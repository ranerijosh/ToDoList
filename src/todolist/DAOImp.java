package todolist;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class DAOImp implements ItemListDAO {

	@Override
	public void addItem(String itemStr) {
		ListItem item = new ListItem(itemStr);
		Session session = HibernateUtil.getSessionFactory().openSession();
	    Transaction tx = null;
	    Integer itemID = null;
		try {
			tx = session.beginTransaction();
			itemID = ((Integer) session.save(item));
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}	
	}

	@Override
	public void delItem(int itemNbr) {
		Session session = HibernateUtil.getSessionFactory().openSession();		
	    Transaction tx = null;
	    ListItem item2 = session.get(ListItem.class, itemNbr);
		try {
			tx = session.beginTransaction();
			session.delete(item2);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	@Override
	public List<ListItem> getList() {
		List<ListItem> list = new ArrayList<>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Query<ListItem> queryList = session.createQuery("FROM ListItem");
			list = queryList.list();
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	    return list;
	}

}

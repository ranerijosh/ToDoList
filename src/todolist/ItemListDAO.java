package todolist;

import java.util.List;
import todolist.ListItem;

public interface ItemListDAO {
	public void addItem(String itemStr);
	public void delItem(int itemNbr);
	public List<ListItem> getList();
}

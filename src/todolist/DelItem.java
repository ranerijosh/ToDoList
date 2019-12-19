package todolist;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DelItem
 */
@WebServlet("/DelItem")
public class DelItem extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAOImp daoimp = new DAOImp();
	ItemListDAO idao;      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DelItem() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("delete.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("itemNbr")!=null && request.getParameter("itemNbr")!="") {
			int itemNbr = Integer.parseInt(request.getParameter("itemNbr"));
			daoimp.delItem(itemNbr);
			RequestDispatcher rd = request.getRequestDispatcher("delete.jsp");
			rd.forward(request, response);
		}

	}

}

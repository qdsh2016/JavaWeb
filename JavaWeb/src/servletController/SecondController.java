package servletController;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Beans.for_DB;
/**
 * Servlet implementation class Second
 */
@WebServlet("/Second")
public class SecondController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public SecondController() {
        super();
    }
 protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
		// request
	// request.getRequestDispatcher("Second.jsp").forward(request, response);
		// response
    for_DB db=new for_DB();
    Statement stst=db.open_Mysql();
    try {
		ResultSet rs=stst.executeQuery("call xx()");
		while (rs.next()) {
			  String ss= rs.getString(1);
			  response.getWriter().println(ss);
		
		
		}
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
		try {
			stst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
 }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}

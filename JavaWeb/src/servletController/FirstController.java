package servletController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.print.resources.serviceui;

/**
 * Servlet implementation class First
 */
@WebServlet("/First")
public class FirstController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public FirstController() {
        super();
    }
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	//request
    
    	
    	request.getRequestDispatcher("First.jsp").forward(request, response);
    	//response
    
    	
    	

    	
    	
    	
    	
    	
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("DefaultedInfo:Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}


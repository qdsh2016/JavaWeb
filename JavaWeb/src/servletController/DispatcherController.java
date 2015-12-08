package servletController;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DispatcherController
 */
@WebServlet(description = "url_dispatcher", urlPatterns = { "/0/*" })
public class DispatcherController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public DispatcherController() {
        super();
    }
   
    //Just use "Request + Response" writing JAVA code to realize the WebServer's Function..like connect DB +WebApp's Function.. 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*String url = request.getRequestURI();
		String path = url.substring(12, url.length());
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);*/
	
		request.
		
		
		
		
		
		
		
		//response
		
		
		
		
		
		
		
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Your URL: " +request.getRequestURI()+" doesn't match Servlet on my server. ");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

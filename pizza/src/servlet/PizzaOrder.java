package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PizzaOrder
 */
@WebServlet("/PizzaOrder")
public class PizzaOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public PizzaOrder() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//String printMe = (String)session.getAttribute("printMe");
		
		String order = request.getParameter("mydata");
		response.getWriter()
		.append("<html>")
		.append("<body>")
		.append("<h1>"+ order)
		.append("</h1>")
		.append("<form method = POST>")
		.append("<input name = \"mydata\" type = \"text\">")
		.append("<input type = \"submit\" value = \"Küld\">")
		.append("</html>")
		.append("</form>")
		.append("</body>")
		.append("</html>");

		//PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(true);
		session.setAttribute("Order",request.toString());
		//HttpServletRequest session = request.getSession(true);
		(String)session.getAttribute("Order");
		//response.getWriter().append(order);


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		//String order = null;
		;

	}

}

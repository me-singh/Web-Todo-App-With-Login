package webapp.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/login.do")
public class LoginServlet extends HttpServlet {
	
	CheckUser user = new CheckUser();
	
	@Override
	protected void doGet(HttpServletRequest reqest, HttpServletResponse response) 
			throws ServletException, IOException {
//		String name = reqest.getParameter("name");
//		System.out.println(name);
//		reqest.setAttribute("naam", name);
//		reqest.setAttribute("password", reqest.getParameter("password"));
		reqest.getRequestDispatcher("/WEB-INF/Pages/login.jsp").forward(reqest, response);
//		PrintWriter out = response.getWriter();
//		out.print("jsfksjdb");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
	
		if(user.isValidUser(name, password)) {
			request.getSession().setAttribute("name", name);
//			request.setAttribute("todos", ShowTodos.getTodos());
			response.sendRedirect("/show-todo.do");
		}else {
			request.setAttribute("error", "INVALID CREDENTIALS!!");
			request.getRequestDispatcher("/WEB-INF/Pages/login.jsp").forward(request, response);
		}
	}
	
}

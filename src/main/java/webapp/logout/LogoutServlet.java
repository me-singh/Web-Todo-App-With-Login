package webapp.logout;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webapp.login.CheckUser;

@WebServlet(urlPatterns="/logout.do")
public class LogoutServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest reqest, HttpServletResponse response) 
			throws ServletException, IOException {
		reqest.getSession().invalidate();
		reqest.getRequestDispatcher("/WEB-INF/Pages/login.jsp").forward(reqest, response);
	}

}

package webapp.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webapp.todo.ShowTodos;

@WebServlet(urlPatterns="/show-todo.do")
public class ShowTodoServlet extends HttpServlet {
	
	ShowTodos showTodos = new ShowTodos();
	
	@Override
	protected void doGet(HttpServletRequest reqest, HttpServletResponse response) 
			throws ServletException, IOException {
		reqest.setAttribute("todos", showTodos.getTodos());
		reqest.getRequestDispatcher("/WEB-INF/Pages/todo.jsp").forward(reqest, response);
	}

}

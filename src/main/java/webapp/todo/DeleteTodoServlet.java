package webapp.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webapp.todo.ShowTodos;

@WebServlet(urlPatterns="/delete-todo.do")
public class DeleteTodoServlet extends HttpServlet {
	
	ShowTodos showTodos = new ShowTodos();
	
	@Override
	protected void doGet(HttpServletRequest reqest, HttpServletResponse response) 
			throws ServletException, IOException {
		String name = reqest.getParameter("name");
		String category = reqest.getParameter("category");
		showTodos.deleteTodo(new Todo(name,category));
		response.sendRedirect("/show-todo.do");
//		reqest.setAttribute("todos", showTodos.getTodos());
//		reqest.getRequestDispatcher("/WEB-INF/Pages/todo.jsp").forward(reqest, response);
	}

}

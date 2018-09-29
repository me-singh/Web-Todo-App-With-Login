package webapp.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webapp.todo.ShowTodos;

@WebServlet(urlPatterns="/add-todo.do")
public class AddTodoServlet2 extends HttpServlet {
	
	ShowTodos showTodos = new ShowTodos();

	@Override
	protected void doGet(HttpServletRequest reqest, HttpServletResponse response) 
			throws ServletException, IOException {
		reqest.getRequestDispatcher("/WEB-INF/Pages/add-todo.jsp").forward(reqest, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String todo = request.getParameter("todo");
		String category = request.getParameter("category");
		showTodos.setTodos(new Todo(todo,category));
		response.sendRedirect("/show-todo.do");
//		request.setAttribute("todos", showTodos.getTodos());
//		request.getRequestDispatcher("/WEB-INF/Pages/todo.jsp").forward(request, response);
	}
}

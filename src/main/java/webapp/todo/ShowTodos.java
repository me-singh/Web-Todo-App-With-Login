package webapp.todo;

import java.util.ArrayList;

public class ShowTodos {
	
	private static ArrayList<Todo> todos = new ArrayList<Todo>();
	
	static {
		todos.add(new Todo("Todo 1","Study"));
		todos.add(new Todo("Todo 2","Study"));
		todos.add(new Todo("Todo 3","Study"));
		todos.add(new Todo("Todo 4","Study"));
		todos.add(new Todo("Todo 5","Study"));
	}
	
	public ArrayList<Todo> getTodos() {
		return todos;
	}
	
	public void setTodos(Todo todo) {
		todos.add(todo);
	}
	
	public void deleteTodo(Todo todo) {
		todos.remove(todo);
	}
}

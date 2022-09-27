package sarayatech.service;

import sarayatech.model.Todo;

import java.util.ArrayList;
import java.util.List;

public class ServletService {
    List<Todo> todos = new ArrayList<>();

    public boolean isAuthentificated(String username,String password){
        return username.equalsIgnoreCase("ibrahim")&&password.equals("admin");
    }

    public void addTodo(Todo todo){
        this.todos.add(todo);
    }
    public void updateTodo(int index,Todo todo){
        this.todos.set(index,todo);
    }
    public void deleteTodo(Todo todo){
        this.todos.remove(todo);
    }
    public String getTodo(Todo todo){
       return todo.toString() ;
    }
    public List<Todo> getTodos(){
        return this.todos;
    }
}

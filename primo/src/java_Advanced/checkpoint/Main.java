package java_Advanced.checkpoint;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("asf", OffsetDateTime.of(2024, 01, 03, 15, 50, 34, 0, ZoneOffset.UTC), false);
        Task task2 = new Task("rfdh", OffsetDateTime.of(2002, 04, 11, 16, 51, 35, 0, ZoneOffset.UTC), false);
        Task task3 = new Task("sdg", OffsetDateTime.of(2003, 05, 12, 17, 52, 36, 0, ZoneOffset.UTC), false);

        TodoList todoList = new TodoList();
        todoList.addTasks(task1);
        todoList.addTasks(task2);
        todoList.addTasks(task3);

        printList(todoList);

        todoList.removeTasks(task3);
        todoList.markCompleted(task1);
        System.out.println(" ");
        printList(todoList);
        System.out.println(" ");
        List<Task> listSearch = todoList.searchTasks();
        System.out.println(listSearch);

        List<Task> listTasks = todoList.getTaskExpirateon();
        System.out.println(" ");
        System.out.println(listTasks);
    }

    public static void printList(TodoList todoList) {
        for (Task task : todoList.getTasks()) {
            System.out.println("Task [description=" + task.getDescription() + ", expiration=" + task.getExpiration()
                    + ", completed=" + task.isCompleted() + "]");
        }
    }
}

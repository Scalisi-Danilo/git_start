package java_Advanced.checkpoint.prova1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class TodoListTest {

    @Test
    public void testSearchTasksifNull() {
        TodoList todoList = new TodoList();
        List<Task> resultList = todoList.searchTasks(null);
        assertEquals(0, resultList.size());
    }

    @Test
    public void testSearchTasksifTheDescriptionIsNullAndTheSearchedStringIsNull() {
        Task task1 = new Task(null, null, false);

        TodoList todoList = new TodoList();
        todoList.addTasks(task1);
        List<Task> resultList = todoList.searchTasks(null);

        assertEquals(1, resultList.size());
        assertTrue(resultList.contains(task1));
    }

    @Test
    public void testSearchTasksifTheTaskListIsEmpty() {
        Task task1 = new Task("1234", null, false);

        TodoList todoList = new TodoList();
        todoList.addTasks(task1);
        todoList.getTasks().clear();
        List<Task> resultList = todoList.searchTasks("1234");

        assertEquals(0, resultList.size());
        assertFalse(resultList.contains(task1));
    }

    @Test
    public void testSearchTasksifTheSearchedStringIsFound() {
        Task task1 = new Task("1234", null, false);

        TodoList todoList = new TodoList();
        todoList.addTasks(task1);
        List<Task> resultList = todoList.searchTasks("1234");

        assertEquals(1, resultList.size());
        assertTrue(resultList.contains(task1));
    }

    @Test
    public void testSearchTasksifTheSearchedStringIsNotFound() {
        Task task1 = new Task("1234", null, false);

        TodoList todoList = new TodoList();
        todoList.addTasks(task1);
        List<Task> resultList = todoList.searchTasks("1236");

        assertEquals(0, resultList.size());
        assertFalse(resultList.contains(task1));
    }

    @Test
    public void testSearchTasksifTheDescriptionIsNull() {
        Task task1 = new Task(null, null, false);

        TodoList todoList = new TodoList();
        todoList.addTasks(task1);
        List<Task> resultList = todoList.searchTasks("1236");

        assertEquals(0, resultList.size());
        assertFalse(resultList.contains(task1));
    }
}

package com.pieceofquality;

import com.pieceofquality.categories.Smoke;
import com.pieceofquality.testconfigs.BaseTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static pages.ToDoMVC.*;
import static pages.ToDoMVC.TaskType.ACTIVE;


public class TodosE2ETest extends BaseTest{

    @Test
    @Category(Smoke.class)
    public void testTasksFlow() {
        givenAtAll(ACTIVE, "1");

        toggle("1");
        assertTasks("1");

        filterActive();
        assertNoVisibleTasks();

        filterCompleted();
        assertVisibleTasks("1");

        //reopen
        toggle("1");
        assertNoVisibleTasks();
        assertItemsLeft(1);

        filterAll();
        assertTasks("1");

        toggleAll();

        clearCompleted();
        assertNoTasks();
    }
}

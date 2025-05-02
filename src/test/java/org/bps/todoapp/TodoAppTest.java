package org.bps.todoapp;

import io.qameta.allure.Description;
import org.bps.flow.ToDoAppFlow;
import org.bps.testsetup.BaseTest;
import org.testng.annotations.Test;

public class TodoAppTest extends BaseTest {
    public ToDoAppFlow todoAppUser;

    @Test
    @Description("todo app header check test for allure reporting")
    public void todoAppHeaderCheck() throws Exception {
        todoAppUser = new ToDoAppFlow();
        todoAppUser
                .launch_todoApp()
                .validate_todoApp_header()
                .clickOnChecklistItems()
                .done();
    }
}

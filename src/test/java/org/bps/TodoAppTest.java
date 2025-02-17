package org.bps;

import org.bps.flow.ToDoAppFlow;
import org.bps.testsetup.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TodoAppTest extends BaseTest {
    public ToDoAppFlow todoAppUser;

    @Test
    public void todoAppHeaderCheck() throws Exception {
        todoAppUser = new ToDoAppFlow();
        todoAppUser
                .launch_todoApp()
                .validate_todoApp_header()
                .done();
    }
}

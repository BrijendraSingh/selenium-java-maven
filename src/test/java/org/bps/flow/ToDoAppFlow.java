package org.bps.flow;

import org.bps.pom.todoapp.TodoAppPage;
import org.bps.testassertions.Assertions;

public class ToDoAppFlow extends Assertions {
    public TodoAppPage todoAppPage;

    public ToDoAppFlow() throws Exception {
        todoAppPage = new TodoAppPage();
    }

//    @Step("launch todo app")
    public ToDoAppFlow launch_todoApp(){
        todoAppPage.launchTodoApp();
        return this;
    }

//    @Step("validate todo app header")
    public ToDoAppFlow validate_todoApp_header() {
        String actualHeaderText = todoAppPage.getHeaderText();
        String expectedHeaderText = "LambdaTest Sample App";
        assertText(actualHeaderText,expectedHeaderText);
        return this;
    }
    public  ToDoAppFlow clickOnChecklistItems(){
        todoAppPage.clickOnAllItems();
        return this;
    }

    public void done(){}
}

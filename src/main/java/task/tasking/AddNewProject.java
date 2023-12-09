package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomePage;
import ui.HomePageLoged;

public class AddNewProject {
    public static void as(WebDriver webDriver) {
        Click.on(webDriver, HomePage.login);
        Enter.text(webDriver, HomePage.emailLogin, "luisdavid123456780@gmail.com");
        Enter.text(webDriver, HomePage.passwordLogin, "luisdavid12345");
        Click.on(webDriver, HomePage.loginUp);
        Click.on(webDriver, HomePageLoged.addNewProject);
        Enter.text(webDriver, HomePageLoged.enterNameNewProject, "diplomado V5");
        Click.on(webDriver, HomePageLoged.addButton);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Enter.text(webDriver, HomePageLoged.enterAddNew, "Tarea Completada");
        Click.on(webDriver, HomePageLoged.addButtonItem);
    }
}

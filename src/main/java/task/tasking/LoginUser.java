package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomePage;

public class LoginUser {
    public static void as(WebDriver webDriver) {
        Click.on(webDriver, HomePage.login);
        Enter.text(webDriver, HomePage.emailLogin, "luisdavid123456780@gmail.com");
        Enter.text(webDriver, HomePage.passwordLogin, "luisdavid12345");
        Click.on(webDriver, HomePage.loginUp);
    }
}

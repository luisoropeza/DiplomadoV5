package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomePage;

public class SignUpFreeNewUser {
    public static void as(WebDriver webDriver) {
        Click.on(webDriver, HomePage.signUpFree);
        Enter.text(webDriver ,HomePage.fullName, "Luis Oropeza");
        Enter.text(webDriver, HomePage.email, "luisdavid123456780@gmail.com");
        Enter.text(webDriver, HomePage.password, "luisdavid12345");
        Click.on(webDriver, HomePage.termsOfService);
        Click.on(webDriver, HomePage.SignUp);
    }
}

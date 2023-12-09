import base.BaseTest;
import org.testng.annotations.Test;
import task.tasking.AddNewProject;
import task.tasking.LoginUser;
import task.tasking.LogoutUser;
import task.tasking.SignUpFreeNewUser;

public class Tests extends BaseTest {
    @Test(priority = 1)
    public void signUpFreeTest(){
        SignUpFreeNewUser.as(webDriver);
    }
    @Test(priority = 2)
    public void loginUserTest(){
        LoginUser.as(webDriver);
    }
    @Test(priority = 3)
    public void logoutUserTest(){
        LogoutUser.as(webDriver);
    }
    @Test(priority = 4)
    public void addProjectTest(){
        AddNewProject.as(webDriver);
    }
}

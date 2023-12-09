package ui;

import org.openqa.selenium.By;

public class HomePageLoged {
    public static By logout = By.xpath("//*[@id=\"ctl00_HeaderTopControl1_LinkButtonLogout\"]");
    public static By addNewProject = By.xpath("//*[@id=\"MainTable\"]/tbody/tr/td[1]/div[6]/div/table/tbody/tr/td[2]");
    public static By enterNameNewProject = By.xpath("//*[@id=\"NewProjNameInput\"]");
    public static By addButton = By.xpath("//*[@id=\"NewProjNameButton\"]");
    public static By enterAddNew = By.xpath("//*[@id=\"NewItemContentInput\"]");
    public static By addButtonItem = By.xpath("//*[@id=\"NewItemAddButton\"]");
}

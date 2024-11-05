package ui.testSuite;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import ui.pages.LoginSection;
import ui.pages.MainPage;
import ui.pages.SettingsSection;


public class UpdateEmailTest extends BaseTestTodoLy {
    LoginSection loginSection = new LoginSection();
    MainPage mainPage = new MainPage();
    SettingsSection settingsSection = new SettingsSection();
    WebDriver chrome;

    @Test
    public void createUpdateDeleteListTest() throws InterruptedException {
        String fullName = "examen111";
        String email = "examen1.11@gmail.com";
        String pwd = "1234567";
        String newEmail = "examen1.2@gmail.com";

        loginSection.createAccountButton.click();
        loginSection.createAccount(fullName, email, pwd);
        mainPage.settingsButton.click();
        Assertions.assertEquals(email, settingsSection.getEmail(email).getText(), "Error:  no se creó la cuenta");

        settingsSection.editEmail(newEmail);
        Thread.sleep(3000);
        loginSection.loginButton.click();
        loginSection.login(newEmail, pwd);
        Thread.sleep(5000);
        Alert alert = chrome.switchTo().alert();
        alert.accept();
        Thread.sleep(5000);


        Assertions.assertTrue(mainPage.settingsButton.isControlDisplayed(), "Error:  actualizo el email correctamente");


    }
}
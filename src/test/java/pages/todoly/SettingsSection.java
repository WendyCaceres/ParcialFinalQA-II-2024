package pages.todoly;


import controls.Button;
import controls.Label;
import controls.TextBox;
import org.openqa.selenium.By;


public class SettingsSection {
    public Button okButton = new Button(By.xpath("//button/span[text()='Ok']"));
    public TextBox emailInput = new TextBox(By.id("EmailInput"));

    public Label getEmail(String email){
        return new Label(By.id(" //input[contains(@value,'"+email+"')]"));

    }

    public void editEmail(String email){
        emailInput.clearSetText(email);
        okButton.click();
    }
}

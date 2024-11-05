package activities;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class Activity {
    public TextBox activitylistname = new TextBox(By.id("com.vrproductiveapps.whendo:id/categoryTitle"));
    public Button colorbutton = new Button(By.id("com.vrproductiveapps.whendo:id/color_select10"));
    public Button checkbutton = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
    public Button borrarbutton = new Button(By.id("com.vrproductiveapps.whendo:id/deleteItem"));
    public Button checkborrar = new Button(By.id("android:id/button1"));

    public void crearactivity(String name){
        activitylistname.setText(name);
        colorbutton.click();
        checkbutton.click();
    }

}


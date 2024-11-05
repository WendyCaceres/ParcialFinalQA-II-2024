package activities.whendo;

import controls.Button;
import controls.Label;
import org.openqa.selenium.By;

public class Plusmenu {
    public Button masmenu = new Button(By.id("com.vrproductiveapps.whendo:id/addCategoryItem"));
    public Label nombrelista = new Label(By.xpath("//android.widget.TextView[@text=\"Mi Lista\"]"));

    public Label getlabel(String name){
        return new Label(By.xpath("//android.widget.TextView[@text='"+ name + "']"));
    }
}

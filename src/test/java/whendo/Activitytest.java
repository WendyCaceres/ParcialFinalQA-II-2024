package whendo;

import activities.whendo.Activity;
import activities.whendo.Hammenu;
import activities.whendo.Mainscreen;
import activities.whendo.Plusmenu;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Activitytest extends WhendoTestBase{
    Mainscreen main = new Mainscreen();
    Hammenu hammenu = new Hammenu();
    Activity activity = new Activity();
    Plusmenu plusmenu = new Plusmenu();
    @Test
    public void activitytest() {
        String activityname = "Prueba";
        String activitychange = "Activitydos";
        main.hammenu.click();
        hammenu.editlist.click();
        plusmenu.masmenu.click();
        activity.crearactivity(activityname);
        Assertions.assertEquals(activityname, plusmenu.getlabel(activityname).getText());
        plusmenu.getlabel(activityname).click();
        activity.activitylistname.clearSetText(activitychange);
        activity.checkbutton.click();
        Assertions.assertEquals(activitychange, plusmenu.getlabel(activitychange).getText());
        plusmenu.getlabel(activitychange).click();
        activity.borrarbutton.click();
        activity.checkborrar.click();
        Assertions.assertFalse(plusmenu.getlabel(activitychange).isControlDisplayed());
    }

}

package ui.session;

import org.openqa.selenium.WebDriver;
import ui.factoryBrowser.FactoryBrowser;

public class Session {
    //atributo del mismo tipo de la clase

    private static  Session session;
    private WebDriver browser;
    //constructor privado

    private Session(){
        browser = FactoryBrowser.make("chrome").create();
    }
    //metodo de acceso global publico

    public static Session getInstance(){
        if (session == null)
            session = new Session();
        return session;
    }


    public void closeSession(){
        browser.quit();
        session=null;
    }

    public WebDriver getBrowser() {
        return browser;
    }
}

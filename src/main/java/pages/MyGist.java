package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyGist {
    WebDriver driver;
    By myGist = By.xpath("//*[@id=\"user-links\"]/details/details-menu/a[1]");

    public MyGist(WebDriver driver){
        this.driver = driver;
    }

    //Get the User name from Home Page
    public String getHomePageCreateGist(){
        return	driver.findElement(myGist).getText();
    }
}

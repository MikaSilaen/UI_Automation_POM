package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateGistHomepage {
    WebDriver driver;
    By createGist = By.xpath("//*[@id=\"user-links\"]/details/summary");

    public CreateGistHomepage(WebDriver driver){
        this.driver = driver;
    }

    //Get the User name from Home Page
    public String getHomePageCreateGist(){
        return	driver.findElement(createGist).getText();
    }
}

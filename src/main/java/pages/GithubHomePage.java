package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GithubHomePage {
    WebDriver driver;
    By homePageUserName = By.xpath("/html/body/div[1]/div/div[3]/nav/a[2]");

    public GithubHomePage(WebDriver driver){
        this.driver = driver;
    }

    //Get the User name from Home Page
    public String getHomePageDashboardUserName(){
        return	driver.findElement(homePageUserName).getText();
    }
}

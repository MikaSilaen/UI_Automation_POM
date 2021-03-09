package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyGist {
    WebDriver driver;
    @FindBy(xpath="//*[@id=\"user-links\"]/details/details-menu/a[1]")
    WebElement homePageUserName;

    public MyGist(WebDriver driver){
        this.driver = driver;
        //This initElements method will create  all WebElements
        PageFactory.initElements(driver, this);
    }

    //Create gist
    public String getHomePageCreateGist(){
        return	homePageUserName.getText();
    }
}

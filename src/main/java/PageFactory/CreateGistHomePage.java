package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateGistHomePage {

    WebDriver driver;
    @FindBy(xpath="//*[@id=\"user-links\"]/details/summary")
    WebElement homePageUserName;

    public CreateGistHomePage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create  all WebElements
        PageFactory.initElements(driver, this);
    }

    //Create gist
    public String getHomePageCreateGist(){
        return	homePageUserName.getText();
    }

}

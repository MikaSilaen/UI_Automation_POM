package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateGist {
    WebDriver driver;
    @FindBy(className="css-truncate")
    WebElement createGist;

    @FindBy(className="dropdown-item")
    WebElement myGist;

    public CreateGist(WebDriver driver){
        this.driver = driver;
        //This initElements method will create  all WebElements
        PageFactory.initElements(driver, this);
    }
    //Click on create button
    public void createGist(){
        createGist.click();
    }

    //Click on create button
    public String myGist(){
        return myGist.getText();
    }

    public void createGist(String strUserName,String strPasword) {
        //Create new gist
        this.createGist();
        //   this.myGist();
    }

}

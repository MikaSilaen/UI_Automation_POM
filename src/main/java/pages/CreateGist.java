package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CreateGist {

    WebDriver driver;
    By createNewGist = By.xpath("/html/body/div[1]/div/div[5]/a/svg[2]");
    By myGist = By.className("dropdown-item");


    public CreateGist(WebDriver driver){
        this.driver = driver;
        //This initElements method will create  all WebElements
        PageFactory.initElements(driver, this);
    }
    //Click on login button
    public void createGist(){
        driver.findElement(createNewGist).click();
    }

    public void createGist(String strUserName,String strPasword) {
        //Create new gist
        this.createGist();
        //   this.myGist();
    }

}

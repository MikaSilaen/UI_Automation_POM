package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    WebDriver driver;
    By userGhist = By.name("login");
    By passwordGhist = By.name("password");
    By titleText =By.xpath("//*[@id=\"login\"]/div[3]/div/p");
    By login = By.name("commit");
    By createNewGist = By.className("css-truncate");
    By myGist = By.className("dropdown-item");

    public Login(WebDriver driver){
        this.driver = driver;
    }
    //Set user name in textbox
    public void setUserName(String strUserName){
        driver.findElement(userGhist).sendKeys(strUserName);;
    }

    //Set password in password textbox
    public void setPassword(String strPassword){
        driver.findElement(passwordGhist).sendKeys(strPassword);
    }

    //Click on login button
    public void clickLogin(){
        driver.findElement(login).click();
    }

    //Get the title of Login Page
    public String getLoginTitle(){
        return	driver.findElement(titleText).getText();
    }

    //Create new gists
    public String createNewGist(){
        return	driver.findElement(createNewGist).getText();
    }

    /*//Create new gists
    public String myGist(){
        return	driver.findElement(myGist).getText();
    }
*/
    /**
     * This POM method will be exposed in test case to login in the application
     * @param strUserName
     * @param strPasword
     * @return
     */
    public void loginToGithub(String strUserName,String strPasword){
        //Fill user name
        this.setUserName(strUserName);
        //Fill password
        this.setPassword(strPasword);
        //Click Login button
        this.clickLogin();

    }
}

package test;

import PageFactory.CreateGistHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.CreateGist;
import pages.GithubHomePage;
import pages.Login;
import pages.MyGist;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    WebDriver driver;
    Login login;
    CreateGist createGist;
    GithubHomePage homePage;
    CreateGistHomePage createGistHomePage;
    MyGist myGist;

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://github.com/login?client_id=7e0a3cd836d3e544dbd9&return_to=%2Flogin%2Foauth%2Fauthorize%3Fclient_id%3D7e0a3cd836d3e544dbd9%26redirect_uri%3Dhttps%253A%252F%252Fgist.github.com%252Fauth%252Fgithub%252Fcallback%253Freturn_to%253Dhttps%25253A%25252F%25252Fgist.github.com%25252Fdiscover%26response_type%3Dcode%26state%3D28960869c32ed2097ee85c0fa0c8935ad423a1c990ca6fd9a208198329c29e25");


    }

    @Test(priority=0)
    public void test_Home_Page_Appear_Correct(){
        //Create Login Page object
        login = new Login(driver);
        //Verify login page title
        String loginPageTitle = login.getLoginTitle();
        Assert.assertTrue(loginPageTitle.contains("Sign in to GitHub"));
        //login to application
        login.loginToGithub("MikaSilaen", "Test123QA");
        // go the next page
        homePage = new GithubHomePage(driver);
        //Verify home page
        Assert.assertTrue(homePage.getHomePageDashboardUserName().matches("Back to GitHub"));
    }

    @Test(priority=1)
    public void test_CreateGist(){
        //Create Login Page object
        login = new Login(driver);
        //Verify login page title
        String loginPageTitle = login.getLoginTitle();
        Assert.assertTrue(loginPageTitle.contains("Sign in to GitHub"));
        //login to application
        login.loginToGithub("MikaSilaen", "Test123QA");
        // go the next page
        homePage = new GithubHomePage(driver);
        //Verify home page
        Assert.assertTrue(homePage.getHomePageDashboardUserName().matches("Back to GitHub"));
        //Create Login Page object
        createGist = new CreateGist(driver);
    }
}

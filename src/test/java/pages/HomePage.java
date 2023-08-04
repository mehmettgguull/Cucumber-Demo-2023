package pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage  extends Base {

    @FindBy(xpath = "(//i[@class='fa fa-facebook'])[1]")
    public WebElement facebookHeaderIcon;
    @FindBy(xpath = "(//*[@class='fa fa-facebook'])[2]")
    public WebElement facebookFooterIcon;
    @FindBy(xpath = "//*[@class='_8ice']")
    public WebElement facebookPage;
    @FindBy(xpath = "(//i[@class='fa fa-twitter'])[1]")
    public WebElement twitterHeaderIcon;
    @FindBy(xpath = "(//i[@class='fa fa-twitter'])[2]")
    public WebElement twitterFooterIcon;
    @FindBy(xpath = "//*[text()='Giriş yap']")
    public WebElement twitterPage;
    @FindBy(xpath = "(//*[@class='fa fa-youtube'])[1]")
    public WebElement youtubeHeaderIcon;
    @FindBy(xpath = "(//*[@class='fa fa-youtube'])[2]")
    public WebElement youtubefooterIcon;
    @FindBy(xpath = "(//*[@class='external-icon'])[1]")
    public WebElement youtubePage;

    @FindBy(xpath = "(//*[@class='fa fa-instagram'])[1]")
    public WebElement instagramHeaderIcon;
    @FindBy(xpath = "(//*[@class='fa fa-instagram'])[2]")
    public WebElement instagramFooterIcon;
    @FindBy(xpath = "//*[@data-visualcompletion='css-img']")
    public WebElement instagramPage;
    @FindBy(xpath = "(//*[@class='fa fa-linkedin'])[1]")
    public WebElement linkedinHeaderIcon;
    @FindBy(xpath = "(//*[@class='fa fa-linkedin'])[2]")
    public WebElement linkedinFooterIcon;
    @FindBy(xpath = "//*[@class='linkedin-text']")
    public WebElement linkedinPage;
    @FindBy(xpath = "(//*[@class='fa fa-pinterest'])[1]")
    public WebElement pinterestHeaderIcon;
    @FindBy(xpath = "(//*[@class='fa fa-pinterest'])[2]")
    public WebElement pinterestFooterIcon;
    @FindBy(xpath = "//*[@aria-label='Pinterest']")
    public WebElement pinterestPage;
    @FindBy(xpath = "(//*[@class='fa fa-google-plus'])[1]")
    public WebElement googleplusHeaderIcon;
    @FindBy(xpath = "(//*[@class='fa fa-google-plus'])[2]")
    public WebElement googleplusFooterIcon;
    @FindBy(xpath = "//*[@id='sdgBod']")
    public WebElement googleplusPage;

}

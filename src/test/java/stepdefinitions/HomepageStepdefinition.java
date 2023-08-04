package stepdefinitions;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.Set;

public class HomepageStepdefinition {
HomePage homePage=new HomePage();
    String whd=Driver.getDriver().getWindowHandle();
    @Given("Windowhandle value is taken")
    public void windowhandle_value_is_taken() {
        whd=Driver.getDriver().getWindowHandle();

    }
    @Given("Switch to old page with windowhandle value")
    public void switch_to_old_page_with_windowhandle_value() {
        Driver.getDriver().switchTo().window(whd);
    }

    @Given("Switch to new page with windowhandle value")
    public void switch_to_new_page_with_windowhandle_value() {
        Driver.getDriver().switchTo().window(whd);
        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();
        String newWindowHandle = "";
        for (String each : allWindowHandles) {
            if (!each.equals(whd)) {
                newWindowHandle = each;
                Driver.getDriver().switchTo().window(newWindowHandle);
                break;
            }
            else {
                Driver.getDriver().switchTo().window(whd);
            }
        }
    }
    @Given("Get text title")
    public void get_text_title() {
       String title=Driver.getDriver().getTitle();
        System.out.println(title);
    }
    @Given("Scrolls down to the bottom of the page")
    public void scrolls_down_to_the_bottom_of_the_page() throws InterruptedException {
       Actions actions=new Actions(Driver.getDriver());
       actions.moveToElement(homePage.facebookFooterIcon).perform();
       Thread.sleep(2000);
    }

    @Given("Click to facebook icon")
    public void click_to_facebook_icon() {
    homePage.facebookHeaderIcon.click();

    }
    @Given("It is tested to be on the facebook page")
    public void ıt_is_tested_to_be_on_the_facebook_page() {
        Assert.assertTrue(homePage.facebookPage.isDisplayed());
    }

    @Given("Click to twitter icon")
    public void click_to_twitter_icon() {
    homePage.twitterHeaderIcon.click();
    }
    @Given("It is tested to be on the twitter page")
    public void ıt_is_tested_to_be_on_the_twitter_page() {

        Assert.assertTrue(homePage.twitterPage.isDisplayed());
    }
    @Given("Click to youtube icon")
    public void click_to_youtube_icon() {
        homePage.youtubeHeaderIcon.click();
    }

    @Given("It is tested to be on the youtube page")
    public void ıt_is_tested_to_be_on_the_youtube_page() {
        Assert.assertTrue(homePage.youtubePage.isDisplayed());
    }

    @Given("Click to instagram icon")
    public void click_to_instagram_icon() {
        homePage.instagramHeaderIcon.click();
    }
    @Given("It is tested to be on the instagram page")
    public void ıt_is_tested_to_be_on_the_instagram_page() {
        Assert.assertTrue(homePage.instagramPage.isDisplayed());
    }

    @Given("Click to linkedin icon")
    public void click_to_linkedin_icon() {
        homePage.linkedinHeaderIcon.click();
    }
    @Given("It is tested to be on the linkedin page")
    public void ıt_is_tested_to_be_on_the_linkedin_page() {

        Assert.assertTrue(homePage.linkedinPage.isDisplayed());
    }

    @Given("Click to pinterest icon")
    public void click_to_pinterest_icon() {
        homePage.pinterestHeaderIcon.click();
    }
    @Given("It is tested to be on the pinterest page")
    public void ıt_is_tested_to_be_on_the_pinterest_page() {

        Assert.assertTrue(homePage.pinterestPage.isDisplayed());
    }

    @Given("Click to googleplus icon")
    public void click_to_googleplus_icon() {

        homePage.googleplusHeaderIcon.click();
    }
    @Given("It is tested to be on the googleplus page")
    public void ıt_is_tested_to_be_on_the_googleplus_page() throws IOException {
        try {
            Assert.assertTrue(homePage.googleplusPage.isDisplayed());
        } catch (Exception e) {
           ReusableMethods.getScreenshot("Dosya1");
        }

    }
    @Given("Click to facebookFooter icon")
    public void click_to_facebook_footer_icon() {
        homePage.facebookFooterIcon.click();
    }
    @Given("Click to twitterFooter icon")
    public void click_to_twitter_footer_icon() {
        homePage.twitterFooterIcon.click();
    }
    @Given("Click to youtubeFooter icon")
    public void click_to_youtube_footer_icon() {
        homePage.youtubefooterIcon.click();
    }
    @Given("Click to instagramFooter icon")
    public void click_to_instagram_footer_icon() {
        homePage.instagramFooterIcon.click();
    }
    @Given("Click to linkedinFooter icon")
    public void click_to_linkedin_footer_icon() {
        homePage.linkedinFooterIcon.click();
    }
    @Given("Click to pinterestFooter icon")
    public void click_to_pinterest_footer_icon() {
        homePage.pinterestFooterIcon.click();
    }
    @Given("Click to googleplusFooter icon")
    public void click_to_googleplus_footer_icon() {
        homePage.googleplusFooterIcon.click();
    }
    @Given("Go to {string}")
    public void go_to(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("userurlmehmet"));
    }
    @Given("user close the browser")
    public void user_close_the_browser() {
       Driver.quitDriver();
    }



}




package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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

    @Then("click on online admission title")
    public void clickOnOnlineAdmissionTitle() {
        homePage.clickOnlineAdmissionHomePage();
    }

    @Then("verify online admission page")
    public void verifyOnlineAdmissionPage() {
        homePage.verifyOnlineAdmissionPage();
    }

    @Then("verify that school admission criteria text")
    public void verifyThatSchoolAdmissionCriteriaText() {
        homePage.verifySchoolAdmissionCriteria();
    }

    @Then("verify and fill the fields under Basic Details")
    public void verifyAndFillTheFieldsUnderBasicDetails() {
        homePage.enterVerifyBasicDetails();
    }

    @Then("verify that student photo has been uploaded")
    public void verifyThatStudentPhotoHasBeenUploaded() {
        homePage.verifyUploadStudentPhoto();
    }

    @Then("verify and fill the fields under Parent Details")
    public void verifyAndFillTheFieldsUnderParentDetails() {
        homePage.verifyEnterDataParentDetails();
    }

    @Then("verify mandatory fields under Basic Details and Guardian Details section")
    public void verifyMandatoryFieldsUnderBasicDetailsAndGuardianDetailsSection() {
        homePage.verifyMandatoryFieldsBasicDetailsParentDetails();
    }



    @Then("verify and fill the fields under Guardian Details Section")
    public void verifyAndFillTheFieldsUnderGuardianDetailsSection() {
        homePage.verifyEnterGuardianDetailsOnlineAdmissionPage();
    }

    @Then("verify that guardian photo has been uploaded")
    public void verifyThatGuardianPhotoHasBeenUploaded() {
        homePage.verifyGuardianPhotoUpload();
    }

    @Then("verify RadioBoxes under Guardian Details Section")
    public void verifyRadioBoxesUnderGuardianDetailsSection() {
        homePage.verifyRadioBoxesGuardianDetails();
    }

    @Then("verify and fill the fields under Miscellaneous Details")
    public void verifyAndFillTheFieldsUnderMiscellaneousDetails() {
        homePage.miscellaneousDetailsVerifyEnter();
    }

    @Then("upload a document on Upload Document Section and verify that")
    public void uploadADocumentOnUploadDocumentSectionAndVerifyThat() {
        homePage.uploadVerifyDocumentOnlineAdmissionPage();
    }


    @Then("click on Submit and verify Reference Number and Review entered Details and Status Page")
    public void clickOnSubmitAndVerifyReferenceNumberAndReviewEnteredDetailsAndStatusPage() {
        homePage.verifyREDaS_ReferenceNo();
    }

    @Then("verify form status and application Date")
    public void verifyFormStatusAndApplicationDate() {
        homePage.verifyFormStatusAndApplicationDate();
    }

    @Then("verifiy entered informations")
    public void verifiyEnteredInformations() {
        homePage.controlInformations();
    }

    @Then("verify and click on I agree to the terms and conditions checkbox")
    public void verifyAndClickOnIAgreeToTheTermsAndConditionsCheckbox() {
        homePage.checkBoxVerifyEnter();
    }

    @Then("click on submit and verify form status and success alert")
    public void clickOnSubmitAndVerifyFormStatusAndSuccessAlert() {
        homePage.submitVerifyFormStatusAndAlert();
    }

    @And("Close the page.")
    public void close_the_page() {
        Driver.quitDriver();

    }

    @Given("go to home page")
    public void go_to_home_page() {
        ReusableMethods.goToHomePage();

    }



}




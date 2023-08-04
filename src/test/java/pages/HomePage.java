package pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HomePage  extends Base {
    Actions actions = new Actions(Driver.getDriver());
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


    //Home Page Online Admission Title
    @FindBy(xpath = "//*[text()='Online Admission']")
    private WebElement homePageOnlineAdmissionTitle;


    //Online Admission PAge Instructions Text
    @FindBy(xpath = "//*[text()='In order to enroll in our school, it is necessary to have completed the age of 6 and reside in Brooklyn.']")
    private WebElement onlineAdmissionPageInstructionsText;

    //Online Admission Page Class Dropdown under BasicDetails
    @FindBy(xpath = "//select[@id='class_id']")
    private WebElement onlineAdmissionPageClassDropDown;

    //Online Admission Page Firstname Textbox under BasicDetails
    @FindBy(xpath = "//input[@id='firstname']")
    private WebElement onlineAdmissionPageFirstnameTextBox;

    //Online Admission Page Lastname TextBox under BasicDetails
    @FindBy(xpath = "//input[@id='lastname']")
    private WebElement onlineAdmissionPageLastNameTextBox;

    //Online Admission Page Gender Dropdown under BasicDetails
    @FindBy(xpath = "//select[@name='gender']")
    private WebElement onlineAdmissionPageGenderDropDown;

    //Online Admission Page Date Of Birth DatePicker under BasicDetails
    @FindBy(xpath = "//input[@name='dob']")
    private WebElement onlineAdmissionPageDateOfBirth;

    //Online Admission Page Mobile Number TextBox under BasicDetails
    @FindBy(xpath = "//input[@name='mobileno']")
    private WebElement onlineAdmissionPageMobileNumber;

    //Online Admission Page Email TextBox under BasicDetails
    @FindBy(xpath = "(//input[@name='email'])[2]")
    private WebElement onlineAdmissionPageEmail;

    //Online Admission Page Student Photo under BasicDetails
    @FindBy(xpath = "(//input[@id='file'])[1]")
    private WebElement onlineAdmissionPageStudentPhoto;

    // Online Admission PAge Date of birth previous button
    @FindBy(xpath = "(//th[@class='prev'])[2]")
    private WebElement previousDateOfBirth;

    // Online Admission PAge Date of birth mounth button
    @FindBy(xpath = "//*[text()='Oct']")
    private WebElement mounthDateOfBirth;
    // Online Admission PAge Date of birth day button
    @FindBy(xpath = "//*[text()='26']")
    private WebElement dayDateOfBirth;
    //Student Photo remove Button
    @FindBy(xpath = "(//button[@type='button'])[9]")
    private WebElement removeButtonStudentPhoto;

    //required field alerts
    @FindBy(xpath = "//*[text()='The Class field is required.']")
    private WebElement requiredFieldAlertClass;
    @FindBy(xpath = "//*[text()='The First Name field is required.']")
    private WebElement requiredFieldAlertFirstName;
    @FindBy(xpath = "//*[text()='The Gender field is required.']")
    private WebElement requiredFieldAlertGender;
    @FindBy(xpath = "//*[text()='The Date Of Birth field is required.']")
    private WebElement requiredFieldAlertDateOfBirth;
    @FindBy(xpath = "//*[text()='The Email field is required.']")
    private WebElement requiredFieldAlertEmail;
    @FindBy(xpath = "//*[text()='The Guardian field is required.']")
    private WebElement requiredFieldAlertGuardian;
    @FindBy(xpath = "//*[text()='The Guardian Name field is required.']")
    private WebElement requiredFieldAlertGuardianName;
    @FindBy(xpath = "//*[text()='The Guardian Relation field is required.']")
    private WebElement requiredFieldAlertGuardianRelation;

    //Online Admission Page Submit Button
    @FindBy(xpath = "(//button[@type='submit'])[5]")
    private WebElement onlineAdmissionPageSubmitButton;

    //Online Admission Page Parent details Section Father Name TextBox
    @FindBy(xpath = "//input[@name='father_name']")
    private WebElement fatherNameParentDetail;

    //Online Admission Page Parent details Section Father Name TextBox
    @FindBy(xpath = "//input[@name='mother_name']")
    private WebElement motherNameParentDetail;

    //Online Admission Page Guardian Details Section
    //Guardian Name Online Admission Page
    @FindBy(xpath = "//input[@id='guardian_name']")
    private WebElement guardianNameOnlineAdmissionPage;
    //Guardian Relation Online Admission Page
    @FindBy(xpath = "//input[@id='guardian_relation']")
    private WebElement guardianRelationOnlineAdmissionPage;
    //Guardian EMail Online Admission Page
    @FindBy(xpath = "//input[@id='guardian_email']")
    private WebElement guardianEmailOnlineAdmissionPage;
    //Guardian Photo Online Admission Page
    @FindBy(xpath = "(//input[@id='file'])[2]")
    private WebElement guardianPhotoOnlineAdmissionPage;
    //Guardian Phone Online Admission Page
    @FindBy(xpath = "//input[@id='guardian_phone']")
    private WebElement guardianPhoneOnlineAdmissionPage;
    //Guardian Occupation Online Admission Page
    @FindBy(xpath = "//input[@id='guardian_occupation']")
    private WebElement guardianOccupationOnlineAdmissionPage;
    //Guardian Adress Online Admission Page
    @FindBy(xpath = "//textarea[@id='guardian_address']")
    private WebElement guardianAdressOnlineAdmissionPage;

    // Remove button on Guardian Photo
    @FindBy(xpath = "(//button[@type='button'])[10]")
    private WebElement verifyGuardianPhotoUploaded;

    //Online Admission title
    @FindBy(xpath = "(//*[text()='Online Admission'])[2]")
    private WebElement onlineAdmissionTitle;

    //Guardian Details Radio Box Father
    @FindBy(xpath = "//div/div/div/label[2]/input")
    private WebElement fatherRadioBoxGuardianDetails;
    //Guardian Details Radio Box Mother
    @FindBy(xpath = "//div/div/div/label[3]/input")
    private WebElement motherRadioBoxGuardianDetails;
    //Guardian Details Radio Box Other
    @FindBy(xpath = "//div/div/div/label[4]/input")
    private WebElement otherRadioBoxGuardianDetails;

    //Miscellaneous Details Section National Identification Number TextBox
    @FindBy(xpath = "//input[@id='adhar_no']")
    private WebElement nationalINMiscellaneousDetails;
    //Miscellaneous Details Section Previous School Details TextBox
    @FindBy(xpath = "(//textarea[@class='form-control'])[2]")
    private WebElement previousSchoolDetailsMiscellaneousDetails;
    //Upload Dokument Online Admission Page
    @FindBy(xpath = "//input[@id='document']")
    private WebElement uploadDocumentOnlineAdmissionPage;
    //Uplaod Document Remove Button
    @FindBy(xpath = "(//button[@type='button'])[11]")
    private WebElement uploadDocumentRemoveButton;
    //Review entered Deteails and Status Page Student Reference Number
    @FindBy(xpath = "//div[5]/div[1]/div[1]/div[4]/div[3]/div[1]/ul/li[1]/span")
    private WebElement referencenumberReviewEnteredDetails;
    //Title Review entered Details and Status
    @FindBy(xpath = "//*[text()='Review Entered Details and Status']")
    private WebElement titleReviewEDaS;
    //Form status REDaS
    @FindBy(xpath = "//*[text()='Not Submitted']")
    private WebElement formStatusREDaS;
    //Application Date REDaS
    @FindBy(xpath = "//*[text()='04/08/2023']")
    private WebElement applicationDateREDaS;
    //Date Of Birth after Submit
    @FindBy(xpath = "//*[text()='26/10/2013']")
    private WebElement controlDateOfBirth;
    //Guardian Relation after Submit
    @FindBy(xpath = "//*[text()='Brother']")
    private WebElement controlGuardianRelation;
    //Email after Submit
    @FindBy(xpath = "//*[text()='muster.mustermann23@gmail.com']")
    private WebElement controlEmail;
    //CheckBox I Agree Terms
    @FindBy(xpath = "//input[@id='checkterm']")
    private WebElement checkBoxIAgreeTerms;
    //Successful Alert REDaS
    @FindBy(xpath = "//input[@id='checkterm']")
    private WebElement successfulAlertREDaS;
    //Form Status REDaS
    @FindBy(xpath = "//input[@id='checkterm']")
    private WebElement formstatusAfterSubmitREDaS;
    //REDaS Submit Button
    @FindBy(xpath = "//button[@id='submitbtn']")
    private WebElement submitREDaS;
    //REDaS Successful alert after submit
    @FindBy(xpath = "//div[@id='completeformdiv']")
    private WebElement successfulAlertAfterSubmitREDaS;
    // REDaS Submitted Form Status
    @FindBy(xpath = "//*[text()='Submitted']")
    private WebElement submittedFormStatusREDaS;

    private String eMail = "muster.mustermann23@gmail.com";
    //**************************************************

    //What People Says title on homepage
    @FindBy(xpath = "//*[text()='WHAT PEOPLE SAYS']")
    private WebElement whatPeopleSaysTitleHomePage;
    //What People Says Sidney W. Yarber
    @FindBy(xpath = "(//*[text()='Sidney W. Yarber'])[2]")
    private WebElement person1WhatPeopleSays;
    //What People Says Kayla H. Seaman
    @FindBy(xpath = "(//*[text()='Kayla H. Seaman'])[2]")
    private WebElement person2WhatPeopleSays;
    //What People Says Terence M. Witzel
    @FindBy(xpath = "(//*[text()='Terence M. Witzel'])[2]")
    private WebElement person3WhatPeopleSays;
    //What People Says Loura Williamson
    @FindBy(xpath = "(//*[text()='Loura Williamson'])[2]")
    private WebElement person4WhatPeopleSays;
    //Our Experienced Stuff Title Home Page
    @FindBy(xpath = "//*[text()='OUR EXPERIENCED STAFFS']")
    public WebElement ourExperiencedStaffHomePage;

    //Clicks on Online Admission Title on Home page
    public void clickOnlineAdmissionHomePage(){
        Assert.assertTrue(homePageOnlineAdmissionTitle.isDisplayed());
        Assert.assertTrue(homePageOnlineAdmissionTitle.isEnabled());
        homePageOnlineAdmissionTitle.click();
    }
    // Verifies Online Admission Page
    public void verifyOnlineAdmissionPage(){
        String expectedTitle = "Online Admission Form";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    // Verifies that school admission criteria is displayed
    public void verifySchoolAdmissionCriteria(){
        String expectedText ="In order to enroll in our school, " +
                "it is necessary to have completed the age of 6 and reside in Brooklyn.";
        String actualText = onlineAdmissionPageInstructionsText.getText();
        Assert.assertEquals(expectedText,actualText);
    }
    //Verifies Class, First Name, Last Name, Gender, Date of Birth,
    //Mobile number, Email and Student Photo Webelements and fills these fields
    public void enterVerifyBasicDetails(){

        Assert.assertTrue(onlineAdmissionPageClassDropDown.isDisplayed());
        Assert.assertTrue(onlineAdmissionPageClassDropDown.isEnabled());
        Assert.assertTrue(onlineAdmissionPageFirstnameTextBox.isDisplayed());
        Assert.assertTrue(onlineAdmissionPageFirstnameTextBox.isEnabled());
        Assert.assertTrue(onlineAdmissionPageLastNameTextBox.isDisplayed());
        Assert.assertTrue(onlineAdmissionPageLastNameTextBox.isEnabled());
        Assert.assertTrue(onlineAdmissionPageGenderDropDown.isDisplayed());
        Assert.assertTrue(onlineAdmissionPageGenderDropDown.isEnabled());
        Assert.assertTrue(onlineAdmissionPageDateOfBirth.isDisplayed());
        Assert.assertTrue(onlineAdmissionPageDateOfBirth.isEnabled());
        Assert.assertTrue(onlineAdmissionPageMobileNumber.isDisplayed());
        Assert.assertTrue(onlineAdmissionPageMobileNumber.isEnabled());
        Assert.assertTrue(onlineAdmissionPageEmail.isDisplayed());
        Assert.assertTrue(onlineAdmissionPageEmail.isEnabled());

        Select select = new Select(onlineAdmissionPageClassDropDown);
        select.selectByIndex(14);
        onlineAdmissionPageFirstnameTextBox.sendKeys("Timur");
        onlineAdmissionPageLastNameTextBox.sendKeys("Lenk");
        Select select1 = new Select(onlineAdmissionPageGenderDropDown);
        select1.selectByIndex(1);
        actions.click(onlineAdmissionPageDateOfBirth).perform();
        actions.click(Driver.getDriver().findElement(By.xpath("(//th[@colspan='5'])[1]"))).perform();
        actions.doubleClick(previousDateOfBirth).perform();
        actions.doubleClick(previousDateOfBirth).perform();
        actions.doubleClick(previousDateOfBirth).perform();
        actions.doubleClick(previousDateOfBirth).perform();
        actions.doubleClick(previousDateOfBirth).perform();
        actions.click(mounthDateOfBirth).perform();
        actions.click(dayDateOfBirth).perform();
        onlineAdmissionPageMobileNumber.sendKeys("0123 456 78 90");

        onlineAdmissionPageEmail.sendKeys(eMail);

        String dosyaYolu = "C:\\Users\\ogune\\OneDrive\\Desktop\\BOOTCAMP\\com.wonderworldcollege" +
                "\\src\\test\\java\\.jpg\\4432b9bcacc2ed45b9bef8d8475a6030.jpg";
        onlineAdmissionPageStudentPhoto.sendKeys(dosyaYolu);
    }
    //verifies that student photo has been uploaded
    public void verifyUploadStudentPhoto(){
        removeButtonStudentPhoto.isDisplayed();
    }

    //Verifies required Fields on Online Admission Page under Basic Details Section
    public void verifyMandatoryFieldsBasicDetailsParentDetails(){

        try {
            ReusableMethods.scrollToElement(Driver.getDriver(),guardianAdressOnlineAdmissionPage);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        onlineAdmissionPageSubmitButton.click();
        try {
            ReusableMethods.scrollToElement(Driver.getDriver(),onlineAdmissionTitle);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(requiredFieldAlertClass.isDisplayed());
        Assert.assertTrue(requiredFieldAlertFirstName.isDisplayed());
        Assert.assertTrue(requiredFieldAlertGender.isDisplayed());
        Assert.assertTrue(requiredFieldAlertDateOfBirth.isDisplayed());
        Assert.assertTrue(requiredFieldAlertEmail.isDisplayed());
        try {
            ReusableMethods.scrollToElement(Driver.getDriver(),fatherNameParentDetail);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Assert.assertTrue(requiredFieldAlertGuardian.isDisplayed());
        Assert.assertTrue(requiredFieldAlertGuardianName.isDisplayed());
        Assert.assertTrue(requiredFieldAlertGuardianRelation.isDisplayed());
    }

    //verifies and fills FatherName and MotherName textBoxes under Parent details Section
    public void verifyEnterDataParentDetails(){
        Assert.assertTrue(fatherNameParentDetail.isDisplayed());
        Assert.assertTrue(motherNameParentDetail.isDisplayed());
        Assert.assertTrue(fatherNameParentDetail.isEnabled());
        Assert.assertTrue(motherNameParentDetail.isEnabled());

        fatherNameParentDetail.sendKeys("Hasan");
        motherNameParentDetail.sendKeys("Fatma");
    }
    //Verifies and Enters data of WebElements on Guardian Details Section
    public void verifyEnterGuardianDetailsOnlineAdmissionPage(){
        try {
            ReusableMethods.scrollToElement(Driver.getDriver(),motherNameParentDetail);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(guardianNameOnlineAdmissionPage.isDisplayed());
        Assert.assertTrue(guardianNameOnlineAdmissionPage.isEnabled());
        Assert.assertTrue(guardianRelationOnlineAdmissionPage.isDisplayed());
        Assert.assertTrue(guardianRelationOnlineAdmissionPage.isEnabled());
        Assert.assertTrue(guardianEmailOnlineAdmissionPage.isDisplayed());
        Assert.assertTrue(guardianEmailOnlineAdmissionPage.isEnabled());
        Assert.assertTrue(guardianPhoneOnlineAdmissionPage.isDisplayed());
        Assert.assertTrue(guardianPhoneOnlineAdmissionPage.isEnabled());
        Assert.assertTrue(guardianOccupationOnlineAdmissionPage.isDisplayed());
        Assert.assertTrue(guardianOccupationOnlineAdmissionPage.isEnabled());
        Assert.assertTrue(guardianAdressOnlineAdmissionPage.isDisplayed());
        Assert.assertTrue(guardianAdressOnlineAdmissionPage.isEnabled());

        otherRadioBoxGuardianDetails.click();
        guardianNameOnlineAdmissionPage.sendKeys("Tarik Erdogan");
        guardianRelationOnlineAdmissionPage.sendKeys("Brother");
        guardianEmailOnlineAdmissionPage.sendKeys("muster.mustermann2@hotmail.com");
        guardianPhoneOnlineAdmissionPage.sendKeys("01234 56 789");
        guardianOccupationOnlineAdmissionPage.sendKeys("Big Boss");
        guardianAdressOnlineAdmissionPage.sendKeys("Bochum, Germany");
        String dosyaYolu = "C:\\Users\\ogune\\OneDrive\\Desktop\\BOOTCAMP\\" +
                "com.wonderworldcollege\\src\\test\\java\\.jpg\\IMG_20211022_124748.jpg";
        guardianPhotoOnlineAdmissionPage.sendKeys(dosyaYolu);
        ReusableMethods.bekle(5);
    }
    //Verify that Guardian Photo has been uploaded
    public void verifyGuardianPhotoUpload() {
        actions.moveToElement(verifyGuardianPhotoUploaded).perform();
        Assert.assertTrue(verifyGuardianPhotoUploaded.isDisplayed());
    }
    // Verify Radio Boxes under Guardian Details
    public void verifyRadioBoxesGuardianDetails(){

        Assert.assertTrue(fatherRadioBoxGuardianDetails.isDisplayed());
        Assert.assertTrue(fatherRadioBoxGuardianDetails.isEnabled());
        Assert.assertTrue(motherRadioBoxGuardianDetails.isDisplayed());
        Assert.assertTrue(motherRadioBoxGuardianDetails.isEnabled());
        Assert.assertTrue(otherRadioBoxGuardianDetails.isDisplayed());
        Assert.assertTrue(otherRadioBoxGuardianDetails.isEnabled());
    }
    //Verifies and fills Miscellaneous Details Section
    public void miscellaneousDetailsVerifyEnter(){
        Assert.assertTrue(nationalINMiscellaneousDetails.isDisplayed());
        Assert.assertTrue(previousSchoolDetailsMiscellaneousDetails.isDisplayed());
        Assert.assertTrue(nationalINMiscellaneousDetails.isEnabled());
        Assert.assertTrue(previousSchoolDetailsMiscellaneousDetails.isEnabled());
        nationalINMiscellaneousDetails.sendKeys("0123456789");
        previousSchoolDetailsMiscellaneousDetails.sendKeys("Boston Collage");
    }
    //Uploads Document and verifies that the Document has been uploaded
    public void uploadVerifyDocumentOnlineAdmissionPage(){
        String dosyaYolu = "C:\\Users\\ogune\\OneDrive\\Desktop\\BOOTCAMP\\" +
                "com.wonderworldcollege\\src\\test\\java\\.jpg\\Student.txt";
        uploadDocumentOnlineAdmissionPage.sendKeys(dosyaYolu);
        ReusableMethods.bekle(2);
        actions.moveToElement(uploadDocumentOnlineAdmissionPage).perform();
        ReusableMethods.bekle(1);
        Assert.assertTrue(uploadDocumentRemoveButton.isDisplayed());
    }

    //Verifes Review Entered Details and Status Page and Student Reference No
    public void verifyREDaS_ReferenceNo(){
        onlineAdmissionPageSubmitButton.click();
        Assert.assertTrue(titleReviewEDaS.isDisplayed());
        Assert.assertTrue(referencenumberReviewEnteredDetails.isDisplayed());
    }
    //Verifies Form Status and Application Date
    public void verifyFormStatusAndApplicationDate(){
        String expectedStatus = "Not Submitted";
        String actualStatus = formStatusREDaS.getText();
        Assert.assertEquals(expectedStatus,actualStatus);

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(ldt.format(dateTimeFormatter));
        Assert.assertEquals(applicationDateREDaS.getText(),ldt.format(dateTimeFormatter));
    }
    //verifies entered Informations
    public void controlInformations(){
        Assert.assertEquals(controlEmail.getText(),eMail);
        Assert.assertEquals(controlDateOfBirth.getText(),"26/10/2013");
        Assert.assertEquals(controlGuardianRelation.getText(),"Brother");
    }
    //verifies and clicks on I Agree To The terms And Conditions
    public void checkBoxVerifyEnter(){
        Assert.assertTrue(checkBoxIAgreeTerms.isDisplayed());
        Assert.assertTrue(checkBoxIAgreeTerms.isEnabled());
        checkBoxIAgreeTerms.click();
    }
    //clicks Submit and verifies Form Status And Succeddful Alert
    public void submitVerifyFormStatusAndAlert(){
        submitREDaS.click();

        Assert.assertTrue(submittedFormStatusREDaS.isDisplayed());
    }

    @FindBy(xpath = "(//a[text()='Course'])[1]")
    public WebElement coursePage;

    @FindBy(xpath = "(//div[@class='course-inner'])[1]")
    public WebElement coursePageEnglishAndLiteratureTitle;

    @FindBy(xpath = "(//div[@class='course-inner'])[2]")
    public WebElement coursePageMathematicsTitle;

    @FindBy(xpath = "(//div[@class='course-inner'])[3]")
    public WebElement coursePageSciencesTitle;

    @FindBy(xpath = "(//div[@class='course-inner'])[4]")
    public WebElement coursePageSocialSciencesTitle;

    @FindBy(xpath = "(//div[@class='course-inner'])[5]")
    public WebElement coursePageHistoryTitle;

    @FindBy(xpath = "(//div[@class='course-inner'])[6]")
    public WebElement coursePageArtsAndMusicTitle;

    @FindBy(xpath = "(//div[@class='course-inner'])[7]")
    public WebElement coursePageHealthAndExerciseSciencesTitle;

    @FindBy(xpath = "(//div[@class='course-inner'])[8]")
    public WebElement coursePageForeignLanguageTitle;

    @FindBy(xpath = "(//div[@class='course-inner'])[9]")
    public WebElement coursePageComputerScienceTitle;

    @FindBy(xpath = "(//a[@class='btn-read'])[1]")
    public WebElement coursePageEnglishAndLiteratureDetailsButton;

    @FindBy(xpath = "(//a[@class='btn-read'])[2]")
    public WebElement coursePageMathematicsDetailsButton;

    @FindBy(xpath = "(//a[@class='btn-read'])[3]")
    public WebElement coursePageSciencesDetailsButton;

    @FindBy(xpath = "(//a[@class='btn-read'])[4]")
    public WebElement coursePageSocialSciencesDetailsButton;

    @FindBy(xpath = "(//a[@class='btn-read'])[5]")
    public WebElement coursePageHistoryDetailsButton;

    @FindBy(xpath = "(//a[@class='btn-read'])[6]")
    public WebElement coursePageArtsAndMusicDetailsButton;

    @FindBy(xpath = "(//a[@class='btn-read'])[7]")
    public WebElement coursePageHealthAndExerciseSciencesDetailsButton;

    @FindBy(xpath = "(//a[@class='btn-read'])[8]")
    public WebElement coursePageForeignLanguageDetailsButton;

    @FindBy(xpath = "(//a[@class='btn-read'])[9]")
    public WebElement coursePageComputerScienceDetailsButton;

}

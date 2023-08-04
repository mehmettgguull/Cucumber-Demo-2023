package stepdefinitions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.eo.Se;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import pages.AdminPage;
import pages.HomePage;
import pages.ParentStudentPage;
import pages.TeacherPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
public class ParentStudentStepdefinition {
      ParentStudentPage parentStudentPage=new ParentStudentPage();
    @Given("Go to parenturl")
    public void go_to_parenturl() {
        Driver.getDriver().get(ConfigReader.getProperty("mehmetuserlogin"));
    }
    @Given("Sendkeys parent name")
    public void sendkeys_parent_name() {
       parentStudentPage.parentEmailAdress1.sendKeys(ConfigReader.getProperty("mehmetParentName"));
    }
    @Given("Sendkeys parent password")
    public void sendkeys_parent_password() {
        parentStudentPage.parentEmailPassword1.sendKeys(ConfigReader.getProperty("teacherPasswordmehmet"));
    }
    @Given("Click to sign in button after username and password write")
    public void click_to_sign_in_button_after_username_and_password_write() {
       parentStudentPage.parentEmailandPasswordClickButton1.click();
    }
    @Given("Click to parentStudentPageMyProfilBarButton")
    public void click_to_parent_student_page_my_profil_bar_button() {
        parentStudentPage.parentStudentPageMyProfilBarButton1.click();
    }
    @Given("Test to parentStudentName")
    public void test_to_parent_student_name() {
        Assert.assertTrue(parentStudentPage.parentStudentMyProfileStudentName1.isDisplayed());
    }
    @Given("Test to parentStudentAdmissionNumber")
    public void test_to_parent_student_admission_number() {
       Assert.assertTrue(parentStudentPage.parentStudentMyProfileAdmissionNumber1.isDisplayed());
    }
    @Given("Test to parentStudentGender")
    public void test_to_parent_student_gender() {
       Assert.assertTrue(parentStudentPage.parentStudentMyProfileGender1.isDisplayed());
    }
    @Given("Click to parentStudentFees and test")
    public void click_to_parent_student_fees_and_test() throws InterruptedException {
        parentStudentPage.parentStudentMyProfileFees1.click();
        Thread.sleep(2000);
    }
    @Given("Click to parentStudentExam and test")
    public void click_to_parent_student_exam_and_test() throws InterruptedException {
        parentStudentPage.parentStudentMyProfileExam1.click();
        Thread.sleep(2000);
    }
    @Given("Click to parentStudentDocuments and test")
    public void click_to_parent_student_documents_and_test() throws InterruptedException {
        parentStudentPage.parentStudentMyProfileDocuments1.click();
        Thread.sleep(2000);
    }


}

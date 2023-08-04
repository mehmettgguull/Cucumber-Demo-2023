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
import pages.TeacherPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class TeacherStepdefinition {
    TeacherPage teacherPage=new TeacherPage();
    AdminPage adminPage=new AdminPage();
    @Given("Go to teacherUrl")
    public void go_to_teacher_url() {
       Driver.getDriver().get(ConfigReader.getProperty("teacherurlmehmet"));
    }
    @Given("Sendkeys teacher name")
    public void sendkeys_teacher_name() {
        adminPage.adminPageUserName1.sendKeys(ConfigReader.getProperty("teacherNamemehmet"));
    }
    @Given("Sendkeys teacher password")
    public void sendkeys_teacher_password() {
        adminPage.adminPagePassword1.sendKeys(ConfigReader.getProperty("teacherPasswordmehmet"));
    }
    @Given("Test HomeworkBarButton")
    public void test_homework_bar_button() {
        Assert.assertTrue(teacherPage.homeworkBarButton1.isDisplayed());
    }

    @Given("Click to addHomeWorkButton")
    public void click_to_add_home_work_button() {
        teacherPage.homeworkAddButton1.click();
    }

    @Given("Click to homeworkAddButton")
    public void click_to_homework_add_button() {
       teacherPage.homeworkAddButton2.click();
    }
    @Given("Test homeWorkClass")
    public void test_home_work_class() {
        Assert.assertTrue(teacherPage.homeworkAddpadeClass1.isDisplayed());
    }
    @Given("Test homeWorkSection")
    public void test_home_work_section() {
       Assert.assertTrue(teacherPage.homeworkAddPageSection1.isDisplayed());
    }
    @Given("Test homeWorkSubjectGroup")
    public void test_home_work_subject_group() {
       Assert.assertTrue(teacherPage.homeworkAddPageSubjectGroup1.isDisplayed());
    }
    @Given("Test homeWorkSubject")
    public void test_home_work_subject() {
        Assert.assertTrue(teacherPage.homeworkAddPageSubject1.isDisplayed());
    }
    @Given("Select homeworkClass")
    public void select_homework_class() {
        Select select=new Select(teacherPage.homeworkAddpadeClass1);
        select.selectByIndex(1);
    }
    @Given("Select homeworkSection")
    public void select_homework_section() {
        Select select=new Select(teacherPage.homeworkAddPageSection1);
        select.selectByIndex(1);
    }
    @Given("Select homeworkSubjectGroup")
    public void select_homework_subject_group() {
        Select select=new Select(teacherPage.homeworkAddPageSubjectGroup1);
        select.selectByIndex(1);
    }
    @Given("Select homeworkSubject")
    public void select_homework_subject() {
        Select select=new Select(teacherPage.homeworkAddPageSubject1);
        select.selectByIndex(1);
    }
    @Given("Upload homework file")
    public void upload_homework_file() {
        String filePath = "src/test/java/Ekran görüntüsü 2023-07-31 164046.png";
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].style.display = 'block';", teacherPage.homeworkAddPageAttachDocument1);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].setAttribute('data-default-file', '" + filePath + "');", teacherPage.homeworkAddPageAttachDocument1);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("$(arguments[0]).dropify();", teacherPage.homeworkAddPageAttachDocument1);

    }
    @Given("Write homeworkDescription")
    public void write_homework_description() {
        Driver.getDriver().switchTo().frame(teacherPage.homeworkAddPageIframe1);
        teacherPage.homeworkAddPageDescription1.sendKeys("Ödevini yap tamam mı çocuğum?");
        Driver.getDriver().switchTo().parentFrame();

    }
    @Given("Click to homeworkAddSaveButton")
    public void click_to_homework_add_save_button() throws InterruptedException {
       teacherPage.homeworkAddPageSave1.click();
       Thread.sleep(30000);
    }
    @Given("Click to changeHomeworkAddSaveButton")
    public void click_to_change_homework_add_save_button() throws InterruptedException {
        teacherPage.homeworkAddPageSave1.click();
        Thread.sleep(1000);

    }

    @Given("Click to homeworkClassSearchButton")
    public void click_to_homework_class_search_button() {
        Select select=new Select(teacherPage.homeworkAfterAddClass1);
        select.selectByIndex(1);
    }
    @Given("Click to homeworkSectionSearchButton")
    public void click_to_homework_section_search_button() {
        Select select=new Select(teacherPage.homeworkAfterAddSection1);
        select.selectByIndex(1);
    }
    @Given("Click to homeworkSubjectGroupSearchButton")
    public void click_to_homework_subject_group_search_button() {
        Select select=new Select(teacherPage.homeworkAfterAddSubjectGroup1);
        select.selectByIndex(1);
    }
    @Given("Click to homeworkSubjectSearchButton")
    public void click_to_homework_subject_search_button() {
        Select select=new Select(teacherPage.homeworkAfterAddSubject1);
        select.selectByIndex(1);
    }
    @Given("Click to homeworkSearchButton")
    public void click_to_homework_search_button() {
        teacherPage.homeworkAfterAddSearch1.click();
    }
    @Given("Click to homeworkDeleteButton")
    public void click_to_homework_delete_button() throws InterruptedException {
        Thread.sleep(3000);
        teacherPage.homeworkAfterAddDelete1.click();
    }
    @Given("Click to homeworkDeleteAlertAccept")
    public void click_to_homework_delete_alert_accept() throws InterruptedException {
        Thread.sleep(3000);
        Driver.getDriver().switchTo().alert().accept();
    }
    @Given("Click to closedHomeWorkButton")
    public void click_to_closed_home_work_button() throws InterruptedException {
       teacherPage.homeworkClosedExamList.click();
       Thread.sleep(2000);
    }
    @Given("Click to upComingHomeWorkButton")
    public void click_to_up_coming_home_work_button() {
        teacherPage.homeworkUpcomingList1.click();
    }
    @Given("Click to homeWorkEditButtob")
    public void click_to_home_work_edit_buttob() throws InterruptedException {
        teacherPage.homeworkEditButton1.click();
        Thread.sleep(2000);
    }
    @Given("Write new homeworkDescription")
    public void write_new_homework_description() throws IOException {
        Driver.getDriver().switchTo().frame(teacherPage.homeworkAddPageIframe1);
        teacherPage.homeworkAddPageDescription1.sendKeys(" Yoksa sınıfta kalırsın");
        Driver.getDriver().switchTo().parentFrame();
        ReusableMethods.getScreenshot("dosya1");
    }
    @Given("Write any student's name in the search box")
    public void write_any_student_s_name_in_the_search_box() {
        teacherPage.teacherSearchBox1.sendKeys("ilknur"+ Keys.ENTER);

    }
    @Given("Test that the registered student appears in the list")
    public void test_that_the_registered_student_appears_in_the_list() throws InterruptedException {
        Assert.assertTrue(teacherPage.teacherSearchStudentName.isDisplayed());
        Thread.sleep(2000);

    }
    @Given("Click to StudentDetailsButton")
    public void click_to_student_details_button() {
        teacherPage.teacherStudentDetailsButton.click();
    }
    @Given("Test teacherStudentPageList")
    public void test_teacher_student_page_list() {
        Assert.assertTrue(teacherPage.teacherStudentPageTest.isDisplayed());
    }
    @Given("Select teacherStudentPageClass")
    public void select_teacher_student_page_class() {
        Select select=new Select(teacherPage.teacherStudentPageClass);
        select.selectByIndex(1);
    }
    @Given("Select teacherStudentPageSection")
    public void select_teacher_student_page_section() {
        Select select=new Select(teacherPage.teacherStudentPageSection);
        select.selectByIndex(1);
    }
    @Given("Click teacherStudentPageSearch")
    public void click_teacher_student_page_search() {
       teacherPage.teacherStudentPageSearchOne.click();
    }
    @Given("Test teacherStudentPageSearch")
    public void test_teacher_student_page_search() {
        Assert.assertTrue(teacherPage.tsubasaOzaroAdmissionNumber.isDisplayed());
    }
    @Given("Write teacherSearchByKeyWord")
    public void write_teacher_search_by_key_word() {
        teacherPage.teacherStudentPageByKeyWord.sendKeys("005623");

    }
    @Given("Click teacherStudentPageByKeyWordSearch")
    public void click_teacher_student_page_by_key_word_search() {
        teacherPage.teacherStudentPageSearchTwo.click();
    }
    @Given("Test teacherStudentPageByKeyWordSearch")
    public void test_teacher_student_page_by_key_word_search() throws InterruptedException {
        Assert.assertTrue(teacherPage.tsubasaOzaroAdmissionNumber.isDisplayed());
        Thread.sleep(2000);
    }
    @Given("Click to teacherStudentPageDetailsView")
    public void click_to_teacher_student_page_details_view() {
         teacherPage.teacherStudentPageDetailsViewList.click();
    }

    @Given("Click to studentDetailsViewButton")
    public void click_to_student_details_view_button() {
        teacherPage.teacherStudentPageDetailsViewIcon.click();
    }
    @Given("Test that the selected student is on their profile page")
    public void test_that_the_selected_student_is_on_their_profile_page() {
        Assert.assertTrue(teacherPage.teacherStudentProfilePage.isDisplayed());
    }
    @Given("Click to teacherStudentPageFeesButton")
    public void click_to_teacher_student_page_fees_button() throws InterruptedException {
        teacherPage.teacherStudentPageFeesButton.click();
        Thread.sleep(1000);
    }
    @Given("Click to teacherStudentPageExamButton")
    public void click_to_teacher_student_page_exam_button() throws InterruptedException {
        teacherPage.teacherStudentPageExamButton.click();
        Thread.sleep(1000);
    }
    @Given("Click to teacherStudentPageDocumentButton")
    public void click_to_teacher_student_page_document_button() throws InterruptedException {
       teacherPage.teacherStudentPageDocumentsButton.click();
        Thread.sleep(1000);
    }
    @Given("Click to teacherStudentPageTimelineButton")
    public void click_to_teacher_student_page_timeline_button() throws InterruptedException {
       teacherPage.teacherStudentPageTimelineButton.click();
        Thread.sleep(1000);


    }



}

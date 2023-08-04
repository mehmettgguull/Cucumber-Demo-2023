package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeacherPage extends Base {
    @FindBy(xpath = "//*[text()=' Homework']")
    public WebElement homeworkBarButton1;
    @FindBy(xpath = " (//*[text()='Add Homework'])[1]")
    public WebElement homeworkAddButton1;
    @FindBy(xpath = "//*[text()=' Add']")
    public WebElement homeworkAddButton2;
    @FindBy(xpath = "//*[@id='modal_class_id']")
    public WebElement homeworkAddpadeClass1;
    @FindBy(xpath = "//*[@id='modal_section_id']")
    public WebElement homeworkAddPageSection1;
    @FindBy(xpath = "//*[@id='modal_subject_group_id']")
    public WebElement homeworkAddPageSubjectGroup1;
    @FindBy(xpath = "//*[@id='modal_subject_id']")
    public WebElement homeworkAddPageSubject1;
    @FindBy(xpath = "//*[@id='file']")
    public WebElement homeworkAddPageAttachDocument1;
    @FindBy(xpath = "//*[@class='wysihtml5-sandbox']")
    public WebElement homeworkAddPageIframe1;
    @FindBy(xpath = "//*[@class='form-control wysihtml5-editor']")
    public WebElement homeworkAddPageDescription1;
    @FindBy(xpath = "(//*[text()='Save'])[1]")
    public WebElement homeworkAddPageSave1;
    @FindBy(xpath = "//*[@id='searchclassid']")
    public WebElement homeworkAfterAddClass1;
    @FindBy(xpath = "//*[@id='secid']")
    public WebElement homeworkAfterAddSection1;
    @FindBy(xpath = "//*[@id='subject_group_id']")
    public WebElement homeworkAfterAddSubjectGroup1;
    @FindBy(xpath = "//*[@id='subid']")
    public WebElement homeworkAfterAddSubject1;
    @FindBy(xpath = "//*[@id='search_filter']")
    public WebElement homeworkAfterAddSearch1;
    @FindBy(xpath = "(//*[@class='fa fa-remove'])[1]")
    public WebElement homeworkAfterAddDelete1;
    @FindBy(xpath = "//*[@class='closed-exam']")
    public WebElement homeworkClosedExamList;
    @FindBy(xpath = "//*[text()='Upcoming Homework']")
    public WebElement homeworkUpcomingList1;
    @FindBy(xpath = "(//*[@class='fa fa-pencil'])[1]")
    public WebElement homeworkEditButton1;

    @FindBy(xpath = "//*[@id='search_text1']")
    public WebElement teacherSearchBox1;
    @FindBy(xpath = "(//*[text()='16020'])[1]")
    public WebElement teacherSearchStudentName;
    @FindBy(xpath = "(//*[text()='Student Details'])[1]")
    public WebElement teacherStudentDetailsButton;
    @FindBy(xpath = "//*[text()=' Select Criteria']")
    public WebElement teacherStudentPageTest;
    @FindBy(xpath = "//*[@id='class_id']")
    public WebElement teacherStudentPageClass;
    @FindBy(xpath = "//*[@id='section_id']")
    public WebElement  teacherStudentPageSection;
    @FindBy(xpath = "(//*[@type='submit'])[3]")
    public WebElement teacherStudentPageSearchOne;
    @FindBy(xpath = "//*[@id='search_text']")
    public WebElement teacherStudentPageByKeyWord;
    @FindBy(xpath = "(//*[@type='submit'])[4]")
    public WebElement teacherStudentPageSearchTwo;
    @FindBy(xpath = "//*[text()=' Details View']")
    public WebElement teacherStudentPageDetailsViewList;
    @FindBy(xpath = "(//*[text()='005623'])[1]")
    public WebElement tsubasaOzaroAdmissionNumber;
    @FindBy(xpath = "(//*[@class='fa fa-reorder'])[2]")
    public WebElement teacherStudentPageDetailsViewIcon;
    @FindBy(xpath = " //*[text()='Profile']")
    public WebElement teacherStudentProfilePage;
    @FindBy(xpath = "//*[text()='Fees']")
    public WebElement teacherStudentPageFeesButton;
    @FindBy(xpath = "//*[text()='Exam']")
    public WebElement teacherStudentPageExamButton;
    @FindBy(xpath = "(//*[text()='Documents'])[1]")
    public WebElement teacherStudentPageDocumentsButton;
    @FindBy(xpath = "//*[text()='Timeline']")
    public WebElement teacherStudentPageTimelineButton;

}

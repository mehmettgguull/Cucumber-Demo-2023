package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ParentStudentPage extends Base{

    @FindBy(xpath = "//*[@id='email']")
    public WebElement parentEmailAdress1;
    @FindBy(xpath = "//*[@id='password']")
    public WebElement parentEmailPassword1;
    @FindBy(xpath = "//*[@type='submit']")
    public WebElement parentEmailandPasswordClickButton1;
    @FindBy(xpath = "//*[text()='My Profile']")
    public WebElement parentStudentPageMyProfilBarButton1;
    @FindBy(xpath = "//*[text()='mehmet.gul']")
    public WebElement parentStudentMyProfileStudentName1;
    @FindBy(xpath = "//*[text()='Admission No ']")
    public WebElement parentStudentMyProfileAdmissionNumber1;
    @FindBy(xpath = "//*[text()='Gender']")
    public WebElement parentStudentMyProfileGender1;
    @FindBy(xpath = "(//*[text()='Fees'])[2]")
    public WebElement parentStudentMyProfileFees1;
    @FindBy(xpath = "//*[text()='Documents']")
    public WebElement parentStudentMyProfileDocuments1;
    @FindBy(xpath = "//*[text()='Exam']")
    public WebElement parentStudentMyProfileExam1;

}

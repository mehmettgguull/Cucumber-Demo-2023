package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminPage extends Base {
    @FindBy(xpath = "//a[@class='btn btn-lg btn-admin']")
    public  WebElement adminLoginButton;
    @FindBy(xpath= "//input[@id='form-username']")
    public  WebElement adminUser;
    @FindBy(xpath = "//input[@placeholder='Password']")
    public  WebElement adminPassword;
    @FindBy(xpath = "//button[@type='submit']")
    public  WebElement signInButton;
    @FindBy(xpath = "//*[@id='form-username']")
    public WebElement adminPageUserName1;
    @FindBy(xpath = "//*[@id='form-password']")
    public WebElement adminPagePassword1;
    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement adminPageSignIn1;
    @FindBy(xpath = "//*[text()='Fees Collection']")
    public WebElement feesCollectionButton1;
    @FindBy(xpath = "(//*[text()='Fees Type'])[1]")
    public WebElement feesTypeButton1;
    @FindBy(xpath = "//*[@class='fa fa-th pull-right']")
    public WebElement sideBarButton1;
    @FindBy(xpath = "(//*[text()='Fees Type'])[1]")
    public WebElement feesTypeButton2;

    @FindBy(xpath = "//*[text()='Add Fees Type']")
    public WebElement feesTypePage;
    @FindBy(xpath = "//*[text()='Name']")
    public WebElement addFeesTypeAddName;
    @FindBy(xpath = "(//*[text()='Fees Code'])[1]")
    public WebElement addFeesTypeAddFessCode;
    @FindBy(xpath = "//*[text()='Description']")
    public WebElement addFeesTypeDescription;
    @FindBy(xpath = "(//*[@class='sorting'])[1]")
    public WebElement feesTypeListName;
    @FindBy(xpath = "(//*[@class='sorting'])[2]")
    public WebElement feesTypeListFeesCode;
    @FindBy(xpath = " //*[text()='Action']")
    public WebElement feesTypeListAction;
    @FindBy(xpath = "//*[@id='name']")
    public WebElement feesTypeNameBox;
    @FindBy(xpath = "//*[@id='code']")
    public WebElement feesTypeFeesCodeBox;

    @FindBy(xpath = "//*[@id='description']")
    public WebElement feesTypeDescriptionBox;
    @FindBy(xpath = "(//*[text()='Save'])[1]")
    public WebElement feesTypePageSave;
    @FindBy(xpath = "//*[text()='Record Saved Successfully']")
    public WebElement feesTypeSaveAlert;
    @FindBy(xpath = "//*[@type='search']")
    public WebElement feesTypeListSearch;
    @FindBy(xpath = "//*[@class='fa fa-pencil']")
    public WebElement feesTypeEdit;
    @FindBy(xpath = "//*[@class='fa fa-remove']")
    public WebElement feesTypeDelete;
    @FindBy(xpath = "//*[text()='Income']")
    public WebElement incomeMenuButton;
    @FindBy(xpath = "(//*[text()='Add Income'])[1]")
    public WebElement addIncomeButton;
    @FindBy(xpath = "  (//*[text()='Add Income'])[3]")
    public WebElement addIncomePage;
    @FindBy(xpath = "(//*[@class='form-control'])[1]")
    public WebElement incomeHeadSelect;
    @FindBy(xpath = "//*[@id='name']")
    public WebElement incomeName;
    @FindBy(xpath = "//*[@id='invoice_no']")
    public WebElement incomeInvoiceNumber;
    @FindBy(xpath = "//*[@id='date']")
    public WebElement incomeDate;
    @FindBy(xpath = "(//*[@class='day'])[2]")
    public WebElement incomeDatedate;
    @FindBy(xpath = "//*[@id='amount']")
    public WebElement incomeAmount;
    @FindBy(xpath = "//*[text()='Attach Document']")
    public WebElement incomeAttachment;
    @FindBy(xpath = "//*[@id='description']")
    public WebElement incomeDescription;
    @FindBy(xpath = "//*[@id='submitbtn']")
    public WebElement incomeSaveButton;
    @FindBy(xpath ="//*[text()=' Income List']")
    public WebElement incomeListHead;
    @FindBy(xpath ="//input[@type='search']")
    public WebElement incomeListSearch;
    @FindBy(xpath ="//*[text()='Record Saved Successfully']")
    public WebElement incomeListAddAlert;
    @FindBy(xpath ="//*[@class='fa fa-trash']")
    public WebElement incomeListDelete;
    @FindBy(xpath ="//*[text()='No data available in table ']")
    public WebElement incomeListDeleteCheck;
    @FindBy(xpath = "//*[text()='Front Office']")
    public WebElement frontOfficeBarButton;
    @FindBy(xpath = "(//*[text()='Complain'])[1]")
    public WebElement complaintsMenuButton;
    @FindBy(xpath = "//*[text()='Add Complain']")
    public WebElement addComplaintsPage;

    @FindBy(xpath = "//*[@name='complaint']")
    public WebElement addComplaintTypeSelect;
    @FindBy(xpath = "//*[@name='source']")
    public WebElement addComplaintSourceSelect;
    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    public WebElement addComplaintByWho;
    @FindBy(xpath = "(//input[@class='form-control'])[2]")
    public WebElement addComplaintPhone;
    @FindBy(xpath = "//*[@id='date']")
    public WebElement addComplaintDate;
    @FindBy(xpath = "//*[@class='active day']")
    public WebElement addComplaintDateSelect;
    @FindBy(xpath = "(//*[@id='description'])[1]")
    public WebElement addComplaintDescription;
    @FindBy(xpath = "(//*[@class='form-control'])[6]")
    public WebElement addComplaintActionTaken;
    @FindBy(xpath = "(//*[@class='form-control'])[7]")
    public WebElement addComplaintAssigned;
    @FindBy(xpath = "(//*[@class='form-control'])[8]")
    public WebElement addComplaintNote;
    @FindBy(xpath = "//*[text()='Attach Document']")
    public WebElement addComplaintAttachDocument;
    @FindBy(xpath = "//*[@name='file']")
    public WebElement complaintAttachDocumentUpload;
    @FindBy(xpath = "(//*[text()='Save'])[1]")
    public WebElement addComplaintSaveButton;
    @FindBy(xpath = "//*[text()='Record Saved Successfully']")
    public WebElement complaintAddMessageAllert;
    @FindBy(xpath = "//input[@type='search']")
    public WebElement complaintListSearchBox;
    @FindBy(xpath = "//*[@class='fa fa-remove']")
    public WebElement copmlaintDeleteButton;
    @FindBy(xpath = "//*[text()='Record Delete Successfully']")
    public WebElement complaintDeleteCheckAlert;


    // Admin Student Information --> Multi Class Student
    @FindBy (xpath = "//span[text()='Student Information']")
    public WebElement studentInformation;

    @FindBy (xpath = "(//a[@href=\"https://qa.wonderworldcollege.com/student/multiclass\"])[2]")
    public WebElement multiClassStudentLink;

    @FindBy (xpath = "//h3[@class='box-title']")
    public WebElement multiClassStudentselectCriteriaText;

    @FindBy (id = "class_id")
    public WebElement multiClassStudentClassTexbox;

    @FindBy (id = "section_id")
    public WebElement multiClassStudentSectionTexbox;

    @FindBy (xpath = "(//button[@type='submit'])[3]")
    public WebElement multiClassStudentSearchButton;

    @FindBy (xpath = "(//h3[@class='box-title'])[2]")
    public WebElement multiClassStudentselectCriteriaText2;

    @FindBy (xpath = "(//button[@class='btn btn-default btn-sm pull-right addrow addrow-mb2010'])[1]")
    public WebElement multiClassStudentAddButton;

    @FindBy (xpath = "(//select[@name='class_id_2'])[1]")
    public WebElement multiClassStudentClassTexbox2;

    @FindBy (xpath = "(//select[@name='section_id_2'])[1]")
    public WebElement multiClassStudentSectionTexbox2;

    @FindBy (xpath = "(//button[@type='submit'])[4]")
    public WebElement multiClassStudentUpdateButton;

    @FindBy(xpath = "(//button[@class='btn btn-sm btn-danger rmv_row'])[3]")
    public WebElement multiClassStudentRemoveButton;





}

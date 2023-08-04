package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import pages.AdminPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AdminStepdefinition {
    AdminPage adminPage =new AdminPage();
    @Given("Go to adminurl")
    public void go_to_adminurl() {
        Driver.getDriver().get(ConfigReader.getProperty("adminurlmehmet"));
    }
    @Given("Sendkeys admin name")
    public void sendkeys_admin_name() {
        adminPage.adminPageUserName1.sendKeys(ConfigReader.getProperty("adminusernamemehmet"));
    }
    @Given("Sendkeys admin password")
    public void sendkeys_admin_password() {
       adminPage.adminPagePassword1.sendKeys(ConfigReader.getProperty("adminPasswordmehmet"));
    }
    @Given("Click to sign in button")
    public void click_to_sign_in_button() {
        adminPage.adminPageSignIn1.click();

    }
    @Given("Click to FeesCollection menu")
    public void click_to_fees_collection_menu() {
        adminPage.feesCollectionButton1.click();

    }
    @Given("Test if FeesType appears")
    public void test_if_fees_type_appears() {
        Assert.assertTrue(adminPage.feesTypeButton1.isDisplayed());
    }
    @Given("Click to FeesType")
    public void click_to_fees_type() {

        adminPage.feesTypeButton1.click();
    }
    @Given("Click to SideBar")
    public void click_to_side_bar() {
        adminPage.sideBarButton1.click();

    }
    @Given("{int} second wait")
    public void second_wait(Integer int1) throws InterruptedException {
        Thread.sleep(2000);
    }
    @Given("Test that you are on the fees type page")
    public void test_that_you_are_on_the_fees_type_page() {
        Assert.assertTrue(adminPage.feesTypePage.isDisplayed());
    }
    @Given("Test feestype name")
    public void test_feestype_name() {
       Assert.assertTrue(adminPage.addFeesTypeAddName.isDisplayed());
    }
    @Given("Test feestype feescode")
    public void test_feestype_feescode() {
        Assert.assertTrue(adminPage.addFeesTypeAddFessCode.isDisplayed());
    }
    @Given("Test feestype description")
    public void test_feestype_description() {
        Assert.assertTrue(adminPage.addFeesTypeDescription.isDisplayed());
    }
    @Given("Test feestypelist name")
    public void test_feestypelist_name() {
        Assert.assertTrue(adminPage.feesTypeListName.isDisplayed());
    }
    @Given("Test feestypelist feescode")
    public void test_feestypelist_feescode() {
        Assert.assertTrue(adminPage.feesTypeListFeesCode.isDisplayed());
    }
    @Given("Test feestypelist action")
    public void test_feestypelist_action() {
        Assert.assertTrue(adminPage.feesTypeListAction.isDisplayed());
    }

    @Given("Enter a name in the name box")
    public void enter_a_name_in_the_name_box() {
       adminPage.feesTypeNameBox.sendKeys("Behlül Kaçar");
    }
    @Given("Enter a fees code in the feescode box")
    public void enter_a_fees_code_in_the_feescode_box() {
        adminPage.feesTypeFeesCodeBox.sendKeys("12345");
    }
    @Given("Enter a description")
    public void enter_a_description() {
        adminPage.feesTypeDescriptionBox.sendKeys("Buralar değerlenir demedi demeyin");
    }
    @Given("Click to FeesTypePageSave button")
    public void click_to_fees_type_page_save_button() {
       adminPage.feesTypePageSave.click();
    }
    @Given("Test feestype save alert")
    public void test_feestype_save_alert() {
        Assert.assertTrue(adminPage.feesTypeSaveAlert.isDisplayed());
    }

    @Given("Enter name in the feestype search box")
    public void enter_name_in_the_feestype_search_box() {
        adminPage.feesTypeListSearch.sendKeys("Behlül Kaçar");
    }
    @Given("Delete feestypelist record")
    public void delete_feestypelist_record() throws InterruptedException {
       adminPage.feesTypeDelete.click();
       Thread.sleep(3000);
       Driver.getDriver().switchTo().alert().accept();
    }
    @Given("Click to Income menu")
    public void click_to_ıncome_menu() {
        adminPage.incomeMenuButton.click();
    }
    @Given("Click to addIncomeButton")
    public void click_to_add_ıncome_button() {
        adminPage.addIncomeButton.click();
    }
    @Given("Test addIncomePage")
    public void test_add_ıncome_page() {
        Assert.assertTrue(adminPage.addIncomePage.isDisplayed());
    }
    @Given("Test ıncomeHead")
    public void test_ıncome_head() {
        Assert.assertTrue(adminPage.incomeHeadSelect.isDisplayed());
    }
    @Given("Test ıncomeHeadNamebox")
    public void test_income_head_namebox() {
        Assert.assertTrue(adminPage.incomeName.isDisplayed());
    }
    @Given("Test incomeinvoicenumber")
    public void test_incomeinvoicenumber() {
        Assert.assertTrue(adminPage.incomeInvoiceNumber.isDisplayed());
    }
    @Given("Test incomedate")
    public void test_incomedate() {
        Assert.assertTrue(adminPage.incomeDate.isDisplayed());
    }
    @Given("Test incomeamount")
    public void test_incomeamount() {
        Assert.assertTrue(adminPage.incomeAmount.isDisplayed());
    }
    @Given("Test incomeattachdocument")
    public void test_incomeattachdocument() {
       Assert.assertTrue(adminPage.incomeAttachment.isDisplayed());
    }
    @Given("Test incomedescription")
    public void test_incomedescription() {
        Assert.assertTrue(adminPage.incomeDescription.isDisplayed());
    }
    @Given("Test incomesave")
    public void test_incomesave() {
        Assert.assertTrue(adminPage.incomeSaveButton.isDisplayed());
    }

    @Given("Select a income in incomepage")
    public void select_a_income_in_incomepage() {
       AdminPage adminPage1=new AdminPage();
       Select select=new Select(adminPage1.incomeHeadSelect);
       select.selectByIndex(1);
    }
    @Given("Write a income name in incomepage")
    public void write_a_income_name_in_incomepage() {
       adminPage.incomeName.sendKeys("Bülbül Yuvası");
    }
    @Given("Write a invoice number in incomepage")
    public void write_a_invoice_number_in_incomepage() {
        adminPage.incomeInvoiceNumber.sendKeys("12345");
    }
    @Given("Select a date in incomepage")
    public void select_a_date_in_incomepage() throws InterruptedException {
        adminPage.incomeDate.click();
        adminPage.incomeDatedate.click();
    }
    @Given("Select amount in incomepage")
    public void select_amount_in_incomepage() {
       adminPage.incomeAmount.sendKeys("10000");
    }
    @Given("Click to save in incomepage")
    public void click_to_save_in_incomepage() {
        adminPage.incomeSaveButton.click();
    }
    @Given("Test if donation has been added successfully?")
    public void test_if_donation_has_been_added_successfully() {
       Assert.assertTrue(adminPage.incomeListAddAlert.isDisplayed());
    }
    @Given("Test incomeListHead")
    public void test_income_list_head() {
       Assert.assertTrue( adminPage.incomeListHead.isDisplayed());
    }
    @Given("Test incomeListSerach")
    public void test_income_list_serach() {
        Assert.assertTrue(adminPage.incomeListSearch.isDisplayed());
    }
    @Given("Write your donation name in search")
    public void write_your_donation_name_in_search() {
        adminPage.incomeListSearch.sendKeys("Bülbül Yuvası");
    }
    @Given("Delete your donation")
    public void delete_your_donation() throws InterruptedException {
        adminPage.incomeListDelete.click();
        Thread.sleep(2000);
        Driver.getDriver().switchTo().alert().accept();
    }
    @Given("Check if you don't have a donation name")
    public void check_if_you_don_t_have_a_donation_name() {
       Assert.assertTrue(adminPage.incomeListDeleteCheck.isDisplayed());
    }
    @Given("Click to FrontOfficeBar button")
    public void click_to_front_office_bar_button() {
        adminPage.frontOfficeBarButton.click();
    }
    @Given("Click to Complaints menu")
    public void click_to_complaints_menu() {
        adminPage.complaintsMenuButton.click();
    }
    @Given("Test Complaints Page")
    public void test_complaints_page() {
        Assert.assertTrue(adminPage.addComplaintsPage.isDisplayed());
    }
    @Given("Test complaintsType select")
    public void test_complaints_type_select() {
        Select select=new Select(adminPage.addComplaintTypeSelect);
        select.selectByIndex(2);
    }
    @Given("Test complaintsource")
    public void test_complaintsource() {
        Select select=new Select(adminPage.addComplaintSourceSelect);
        select.selectByIndex(2);
    }
    @Given("Test complaintBy")
    public void test_complaint_by() {
        adminPage.addComplaintByWho.sendKeys("Abuzer Kadayif");
    }
    @Given("Test complaintPhone")
    public void test_complaint_phone() {
       adminPage.addComplaintPhone.sendKeys("0212-110-10-10");
    }
    @Given("Test complaintDate")
    public void test_complaint_date() throws InterruptedException {
        adminPage.addComplaintDate.click();
        JavascriptExecutor jsc=(JavascriptExecutor) Driver.getDriver();
        jsc.executeScript("arguments[0].click();", adminPage.addComplaintDateSelect);
    }
    @Given("Test complaintDescription")
    public void test_complaint_description() {
        adminPage.addComplaintDescription.sendKeys("Cocugunuz cok yaramaz");
    }
    @Given("Test complaintActionTaken")
    public void test_complaint_action_token() {
        adminPage.addComplaintActionTaken.sendKeys("Tek Ayak");
    }
    @Given("Test complaintAssigned")
    public void test_complaint_assigned() {
        adminPage.addComplaintAssigned.sendKeys("Komutan Logar");
    }
    @Given("Test complaintNote")
    public void test_complaint_note() {
        adminPage.addComplaintNote.sendKeys("Eti sizin kemigi benim");
    }
    @Given("Test complaintAttachDocument")
    public void test_complaint_attach_document() {
        Assert.assertTrue(adminPage.addComplaintAttachDocument.isDisplayed());
    }
    @Given("Upload your complaint document")
    public void upload_your_complaint_document() throws InterruptedException {

        String filePath = "src/test/java/Ekran görüntüsü 2023-07-31 164046.png";
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].style.display = 'block';", adminPage.complaintAttachDocumentUpload);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].setAttribute('data-default-file', '" + filePath + "');", adminPage.complaintAttachDocumentUpload);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("$(arguments[0]).dropify();", adminPage.complaintAttachDocumentUpload);

    }
    @Given("Test complaintSaveButton")
    public void test_complaint_save_button() {
        adminPage.addComplaintSaveButton.click();
    }

    @Given("Complaint registered message seen")
    public void complaint_registered_message_seen() {
        Assert.assertTrue(adminPage.complaintAddMessageAllert.isDisplayed());
    }
    @Given("Write complaint name on copmlaint list search")
    public void write_complaint_name_on_copmlaint_list_search() {
       adminPage.complaintListSearchBox.sendKeys("Abuzer Kadayif");
    }
    @Given("Delete the generated complaint")
    public void delete_the_generated_complaint() throws InterruptedException {
       adminPage.copmlaintDeleteButton.click();
       Thread.sleep(2000);
       Driver.getDriver().switchTo().alert().accept();
    }
    @Given("Check that the complaint has been deleted")
    public void check_that_the_complaint_has_been_deleted() {
        Assert.assertTrue(adminPage.complaintDeleteCheckAlert.isDisplayed());
    }

}

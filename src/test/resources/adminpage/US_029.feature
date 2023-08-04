Feature: As an administrator (admin), I want a "Complaints" page to see user complaints and assign them for resolution.

  Scenario: TC_001 Complaints
    * Go to adminurl
    * Sendkeys admin name
    * Sendkeys admin password
    * Click to sign in button
    * 2 second wait
    * Switch to new page with windowhandle value
    * Click to FrontOfficeBar button
    * Click to SideBar
    * Click to Complaints menu
    * Test Complaints Page
    * user close the browser


  Scenario: TC_002 Complaints Attach Document
    * Go to adminurl
    * Sendkeys admin name
    * Sendkeys admin password
    * Click to sign in button
    * 2 second wait
    * Switch to new page with windowhandle value
    * Click to FrontOfficeBar button
    * Click to SideBar
    * Click to Complaints menu
    * Test Complaints Page
    * Test complaintsType select
    * Test complaintsource
    * 2 second wait
    * Test complaintBy
    * 2 second wait
    * Test complaintPhone
    * Test complaintDescription
    * Test complaintActionTaken
    * Test complaintAssigned
    * Test complaintNote
    * Test complaintAttachDocument
    * Upload your complaint document
    * 2 second wait
    * Test complaintSaveButton
    * 2 second wait
    * Complaint registered message seen
    * Write complaint name on copmlaint list search
    * Delete the generated complaint
    * 2 second wait
    * Check that the complaint has been deleted
    * user close the browser




Feature: As an administrator (admin), I want to view and update fee types in the system.

  Scenario: TC_001 Fees Collection
    * Go to adminurl
    * Sendkeys admin name
    * Sendkeys admin password
    * Click to sign in button
    * Switch to new page with windowhandle value
    * Click to FeesCollection menu
    * Click to SideBar
    * Test if FeesType appears
    * 2 second wait
    * Click to FeesType
    * Test that you are on the fees type page
    * Test feestype name
    * Test feestype feescode
    * Test feestype description
    * Test feestypelist name
    * Test feestypelist feescode
    * Test feestypelist action
    * Enter a name in the name box
    * Enter a fees code in the feescode box
    * Enter a description
    * Click to FeesTypePageSave button
    * Test feestype save alert
    * Enter name in the feestype search box
    * Delete feestypelist record
    * 5 second wait
    * user close the browser




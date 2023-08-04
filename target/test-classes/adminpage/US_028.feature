Feature: As an administrator (admin), I want to add new sources of income to the system to increase school revenues.

  Scenario: TC_001 School Income
    * Go to adminurl
    * Sendkeys admin name
    * Sendkeys admin password
    * Click to sign in button
    * Switch to new page with windowhandle value
    * Click to Income menu
    * Click to SideBar
    * Click to addIncomeButton
    * Test addIncomePage
    * Test ıncomeHead
    * Test ıncomeHeadNamebox
    * Test incomeinvoicenumber
    * Test incomedate
    * Test incomeamount
    * Test incomeattachdocument
    * Test incomedescription
    * Test incomesave
    * Select a income in incomepage
    * Write a income name in incomepage
    * Write a invoice number in incomepage
    * Select a date in incomepage
    * Select amount in incomepage
    * Click to save in incomepage
    * Test if donation has been added successfully?
    * Test incomeListHead
    * Test incomeListSerach
    * Write your donation name in search
    * Delete your donation
    * Write your donation name in search
    * Check if you don't have a donation name
    * user close the browser




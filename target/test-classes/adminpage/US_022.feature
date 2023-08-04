Feature: Multi Class student page test as admin


  Scenario: TC03 A new class can be added, the class can be deleted and the changes made can be saved in the window of the selected student among the students listed on the Multi Class page.

    * Go to the "loginurl"
    * click admin login
    * Enter the valid username and password on the Admin login panel
    * click sign in button
    * Student Information, Multi Class Student link is clicked on the admin panel, respectively
    * Select the class from the Class tab, select the section from the Section tab and click the search button
    * A new class is added by clicking the + icon in the selected student's window
    * Clicking the Update button saves the changes made
    * Click the remove button of the class you want to delete in the selected student's window
    * Clicking the Update button saves the changes made
    * Quit the page

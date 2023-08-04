Feature:As a user, I should be able to view all fields when I access "My Profile" When entering the Parent Panel

  Scenario:TC_001 A parent may access all the details under 'My Profile', when entering the Parent Panel
    * Go to parenturl
    * Sendkeys parent name
    * Sendkeys parent password
    * Click to sign in button after username and password write
    * Click to parentStudentPageMyProfilBarButton
    * Test to parentStudentName
    * Test to parentStudentAdmissionNumber
    * Test to parentStudentGender
    * Click to parentStudentFees and test
    * Click to parentStudentExam and test
    * Click to parentStudentDocuments and test
    * user close the browser


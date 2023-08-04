Feature: As an administrator (teacher), I want a page where I can prepare homework for students and assign it to them.

  Scenario: TC_001 A teacher may access and add homework page
    * Go to teacherUrl
    * Sendkeys teacher name
    * Sendkeys teacher password
    * Click to sign in button
    * Click to SideBar
    * Test HomeworkBarButton
    * Click to addHomeWorkButton
    * Click to homeworkAddButton
    * 2 second wait
    * Test homeWorkClass
    * Test homeWorkSection
    * Test homeWorkSubjectGroup
    * Test homeWorkSubject
    * Select homeworkClass
    * Select homeworkSection
    * Select homeworkSubjectGroup
    * Select homeworkSubject
    * 2 second wait
    * Upload homework file
    * Write homeworkDescription
    * 2 second wait
    * 2 second wait
    * Click to homeworkAddSaveButton
    * user close the browser

  Scenario: TC_002 A teacher can update and delete assignments on the assignment page

    * Go to teacherUrl
    * Sendkeys teacher name
    * Sendkeys teacher password
    * Click to sign in button
    * Click to SideBar
    * Test HomeworkBarButton
    * Click to addHomeWorkButton
    * Click to homeworkClassSearchButton
    * Click to homeworkSectionSearchButton
    * Click to homeworkSubjectGroupSearchButton
    * Click to homeworkSubjectSearchButton
    * Click to homeworkSearchButton
    * Click to closedHomeWorkButton
    * Click to upComingHomeWorkButton
    * Click to homeWorkEditButtob
    * Write new homeworkDescription
    * Click to changeHomeworkAddSaveButton
    * Click to homeworkDeleteButton
    * Click to homeworkDeleteAlertAccept
    * user close the browser
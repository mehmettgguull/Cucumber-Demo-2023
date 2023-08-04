Feature:As an administrator (teacher),
        I want a search box in the teacher panel where I can search for students by their names for quick access.

  Scenario:TC_001 A teacher see search box active,when searching a student name
    * Go to teacherUrl
    * Sendkeys teacher name
    * Sendkeys teacher password
    * Click to sign in button
    * Write any student's name in the search box
    * Test that the registered student appears in the list
    * user close the browser

  Scenario:TC_002 A teacher may see the (Student List) is visible and active
    * Go to teacherUrl
    * Sendkeys teacher name
    * Sendkeys teacher password
    * Click to sign in button
    * Click to SideBar
    * Click to StudentDetailsButton
    * Test teacherStudentPageList
    * Select teacherStudentPageClass
    * Select teacherStudentPageSection
    * Click teacherStudentPageSearch
    * Test teacherStudentPageSearch
    * Write teacherSearchByKeyWord
    * Click teacherStudentPageByKeyWordSearch
    * Test teacherStudentPageByKeyWordSearch
    * Click to teacherStudentPageDetailsView
    * Click to studentDetailsViewButton
    * Test that the selected student is on their profile page
    * user close the browser
  Scenario:TC_003 A teacher may see the (Details View) is visible and active
    * Go to teacherUrl
    * Sendkeys teacher name
    * Sendkeys teacher password
    * Click to sign in button
    * Click to SideBar
    * Click to StudentDetailsButton
    * Write teacherSearchByKeyWord
    * Click teacherStudentPageByKeyWordSearch
    * Click to teacherStudentPageDetailsView
    * Click to studentDetailsViewButton
    * Click to teacherStudentPageFeesButton
    * Click to teacherStudentPageExamButton
    * Click to teacherStudentPageDocumentButton
    * Click to teacherStudentPageTimelineButton
    * user close the browser


Feature: As a user I want an Online Admission page on the homepage so that I can enroll in the school online
  Scenario: TC_001  'Online Admission' Page - Redirection, Visibility,
  Enability, Mendatory Fields, Verification and Upload Tests
    Given go to home page

    Then click on online admission title
    Then verify online admission page
    Then verify that school admission criteria text
    Then verify mandatory fields under Basic Details and Guardian Details section
    Then verify and fill the fields under Basic Details
    Then verify that student photo has been uploaded
    Then verify and fill the fields under Parent Details
    Then verify and fill the fields under Guardian Details Section
    Then verify that guardian photo has been uploaded
    Then verify RadioBoxes under Guardian Details Section
    Then verify and fill the fields under Miscellaneous Details
    Then upload a document on Upload Document Section and verify that
    And Close the page.

    Scenario: TC_002 'Review Entered Details and Status' Page-Redirection, Visibility, Enability and Verification Tests
      Given go to home page

      Then click on online admission title
      Then verify online admission page
      Then verify that school admission criteria text
      Then verify mandatory fields under Basic Details and Guardian Details section
      Then verify and fill the fields under Basic Details
      Then verify that student photo has been uploaded
      Then verify and fill the fields under Parent Details
      Then verify and fill the fields under Guardian Details Section
      Then verify that guardian photo has been uploaded
      Then verify RadioBoxes under Guardian Details Section
      Then verify and fill the fields under Miscellaneous Details
      Then upload a document on Upload Document Section and verify that
      Then click on Submit and verify Reference Number and Review entered Details and Status Page
      Then verify form status and application Date
      Then verifiy entered informations
      Then verify and click on I agree to the terms and conditions checkbox
      Then click on submit and verify form status and success alert
      And Close the page.




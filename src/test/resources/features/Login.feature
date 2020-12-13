Feature: To verify Practice Page in rahulshatty academy

#  @smoke1
#  Scenario Outline: To verify radiobutton functionality and text box
#    Given  open the browser "<Browser>" and launch the application
#    When user enter select contry name "<countryName>"
#    Then application should show relevent data in the dopdown
#    And application should allow the user to select the option
#    Examples:
#      | Browser | countryName |
#      | chrome  | india       |


  Scenario Outline: To verify gmail functionality
    Given  open the browser "<Browser>" and launch the gmail application
    When user enter the username"<Username>" and Password "<Password>"



    And click on login button
    Then User should navigate to Gmail home screen

    Examples:
      | Browser | Username                   | Password        |
      | chrome  | srikanthreddy5c0@gmail.com | srisrikanthra1 |
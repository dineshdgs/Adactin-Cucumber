Feature: Hotel Room Bokking in Adaactin Application

Scenario: Login Page
Given user Is able To Launch the Url
When user Is Able to Give the Username
And user is Able to Give the Passward
Then user is Able to Click the Login Page

Scenario: Search Hotel
Given user Select the Location 
And user Select the Hotel
And user Select the RoomType
And user Select the No of Rooms
And user Select the Check in Date
And user Select the Check Out Date
And user Select the Adults Per Room
And user Select the Childrens Per Room
Then user Able to Click the Search Button

Scenario: Select the type of Hotel
Given user Select the Type of Hotel
Then user Able to Click the Continue Button

Scenario: Book a Hotel
Given user Type the First Name
And user Type the Last Name
And user Fill the Address
And user Enter the Credit Card Number
And user Select the Credit Card Type
And user Select the Expiry Date
And user Select the Expiry Year
And user Enter the cvv Number
Then user Able to Click the Book Now Button

Scenario: Logout the Application
Then user Click The Logout Button 
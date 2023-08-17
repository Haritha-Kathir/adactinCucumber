Feature: Hotel Booking In Adactin Application

@smokeTest
Scenario Outline: User Login In The Web Application
Given user Launch The Adactin Application
When user Enter The "<Username>" In The Username Field
And user Enter The "<password>" In The Password Field
Then user Click The Login Button And Navigate to Search Hotel Page

Examples:
|Username|password|
|Haritha11|R3230N|
|aaa|bbb|
|asdv|1235|	

@sanityTest
Scenario: User Search Hotel In The Web Application 
When user Select The Location From Select Location Dropdown 
And user Select The Hotel From Select Hotel Dropdown ie "index" "3"
And user Select The Room Type From Select Room Type Among Standard,Double,Deluxe,Super Deluxe
And user Select The Number Of Rooms From The Number of Rooms Dropdown
And user Enter Check In Date In Format Of (dd/mm/yyyy)
And user Enter Check Out Date In Format Of (dd/mm/yyyy)	
And user Select Adults Rooms From From Adult Per Room
And user Select Children Room From Children Per Room
Then user Click The Search Button And Navigate To Select Hotel Page

@sanity1Test
Scenario: User Select Hotel In The Web Application
When user Click The Radio Button To Select the Hotel From Booked Itinerary
Then user Click the Continue Button And Navigate to Book A Hotel Page

@sanity2Test
Scenario: User Book A Hotel In The Web Application
When user Enter The First Name In The First Name Field
And user Enter The Last Name In The Last Name Field
And user Enter The Address For Billing In The Billing Address
And user Enter The Credit Card Number In The Credit Card Field (Limit 16 digits)
And user Select The credit Card Type From The Credit Card DropDown
And user Select The Expiry Date From The Select Month DropDown 
And user Select The Expiry Year in Expiry Date Dropdown 
And user Enter The CVV Number In The CVV Number Field 
Then user Click The Book Now Button And Navigate To Booking Confirmation Page

@regressionTest
Scenario: User Confirm The Booking Details In The Web Application
Then user Click The Logout Button  And Navigate To Successfully logged Out Page

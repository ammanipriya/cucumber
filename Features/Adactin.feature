Feature: Hotel booking
Background:
@login
Scenario: Home page
	Given url should be launched
	When user "<Username>" name must be entered
	And password "<Password>" must be entered
	Then click login btn

Examples:
|Username|Password|
|Advani|oops|
|Ammanipriya|adactin|


@Regression
Scenario: Search hotel
When select The "Sydney" Location
And select  The "Hotel Creek" Hotel
And select The "Standard" Roomtype
And select No Of Rooms
And select The Checkin Date 
And select The Checkout Date
And select the Adults per room
And select The Children Per Room
Then click Search Btn and navigates to "Adactin.com - Select Hotel" page
@Prod
Scenario: Select hotel
When seleck the hotel
Then click continue and navigates to "Adactin.com - Book A Hotel" page
Scenario: Book A Hotel
When enter Your First Name
And enter Your Last  Name 
And enter your Address
And enter Your Creditcard Details
And select The Creditcard Type
And select Expiry Month
And select Expiry Year
And enter The Cvv Number
Then click Book Now and navigate to "Adactin.com - Book A Hotel" page
Scenario: Booking confirmation 
Then click Myitinerary and navigate to "Adactin.com - Select Hotel" page
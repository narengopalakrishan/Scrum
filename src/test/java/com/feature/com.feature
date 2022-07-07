Feature: Searching flights in flipkart 

Scenario: enter the Valid Url to launch the site 
	Given Pass the url 
	When User click the travel option 
	
Scenario: Searching the flight with required info 
	Given User select the round trip 
	When User enter From and To location 
	When user enter the depart date and return date 
	And user enter the traveller and class details 
	
	
Scenario: Filter option for searching flight 
	When User select the non-stop option 
	When User select Departure time option 
	And user select the airline 
	And user book the flight 
	
Scenario: User login to the application 
	When user enter the valid username and password 
	
Scenario: User enter the traveller deatils 
	When user check the intinerary and click the continue 
	When user enter the traveller name and DOB 
	When user enter the contact info 
	And user click the continue 
Feature: Gmail Testing
@runthis
Scenario: Gmail Login
	
Given url opened
Then enter user id and click next
Then enter password
And click login

@runthis
Scenario: Gmail Close
Then Close browser 



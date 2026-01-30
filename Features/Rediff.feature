Feature: fill dteails for creating account

Scenario Outline: User fill details for creating account on Rediffmail
		Given User launches Chrome Browser
		When User opens URL "https://www.rediff.com/"
		And User click on the link create account
		And User fill Full name as "Ruma Das"
		And user fill Choose a Rediffmail ID as "rumadss"
		And user click on Check availablity button
		Then user check if ID is available or not
		And user fill chose password as "Narayandas"
		And user reenter password as "Narayandas"
		And user select day as "10"
		And user select month as "DEC"
		And user select year as "2000"
		And User select gender
		And User select country as "India"
		And User select city as "Kolkata"
		And User enter Recovery Email ID as "subrotads@gmail.com"
		And User enter mobile no as "9836378482"
		And user click on the create my account
		And User click on terms and conditions
		And User close the terms witndow by click on accept button
		And User close the Browser
		
		
		
		
		
		
		

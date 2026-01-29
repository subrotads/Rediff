Feature: fill dteails for creating account

Scenario Outline: User fill details for creating account on Rediffmail
		Given User launches Chrome Browser
		When User opens URL "https://www.rediff.com/"
		And User click on the link create account
		And User fill Full name as "Subrota Das"
		And user fill Choose a Rediffmail ID as "subrotadss"
		And user click on Check availablity button
		Then user check if ID is available or not
		And user fill chose password as "Narayan"
		And user reenter password as "Narayan"
		And user select day as "23"
		And user select month as "JAN"
		And user select year as "1984"
		And close the browser
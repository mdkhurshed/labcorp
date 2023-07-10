@regression
Feature: Apply to the job 

Scenario Outline: User should able to apply for the job 

	Given Browse to labcorp home page
	When Click on the careers link 
	And Scroll to IT Job link
	And Click on the IT Job link
	And Click on the job title
	And validate the job title
	And Validate the Current URL
	And Validate the Job location
	And Validate the job ID
	And Validate the Sentence from paragraph
	And Validate the Bullete point
	And Validate the job requirment
	And Validate the experience
	And Click on the Apply Now button
	Then Click on the career home to return
	
	Examples: 
		|Username  | Password |
		|  abc     |      123 |
Feature: Product Purchase and Cancellation 

Scenario: Login to Flipkart site from chrome browser 

	Given Load Flipkart
	When Login to Application 
	Then Search Product 
	Then Purchase Product
#	Then Log Product Description
#Then Log Out

	
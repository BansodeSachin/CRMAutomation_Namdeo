Feature: Login into Application

Scenario Outline: Positive test validating login
Given Initialize the browser with chrome
And Navigate to "http://localhost:8082/customer/list" Site
And Click on Add Customer Button to land on Add New Customer Form
When User enters <firstname>, <lastname> and <email> and click on submit button
Then Print Success Message
And close browsers

Examples:
|firstname			|lastname	|email						|
|sachin				|bansode	|bansodesachin110@gmail.com	|
|Vikram				|singh		|vikram.singh@gmail.com		|
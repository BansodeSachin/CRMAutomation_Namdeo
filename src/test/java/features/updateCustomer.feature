Feature: Update Customer Feature

Scenario Outline: Positive test Updating Customer
Given Initialize the browser with chrome
And Navigate to "http://localhost:8082/customer/list" Site
And Click on Update Link for Customer whose id is <id>
When User enters <firstname>, <lastname> and <email> and click on submit button
Then Print Success Message
And close browsers

Examples:
|firstname			|lastname	|email						|id	|
|sachin				|bansode	|bansodesachin110@gmail.com	|7	|
|Vikram				|singh		|vikram.singh@gmail.com		|8	|


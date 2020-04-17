Feature: Delete Customer Feature

Scenario Outline: Positive test -- Delete Customer whose id is present
Given Initialize the browser with chrome
And Navigate to "http://localhost:8082/customer/list" Site
And Click on Delete Link for customer whose id is <id>
Then Print Success Message
And close browsers

Examples:
|id			|
|9			|
|10			|


Scenario Outline: Negative test -- Delete Customer whose id is NOT present
Given Initialize the browser with chrome
And Navigate to "http://localhost:8082/customer/list" Site
And Click on Delete Link for customer whose id is <id>
Then Print Success Message
And close browsers

Examples:
|id			|
|999		|
|1000		|


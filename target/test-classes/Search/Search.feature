
Feature: Search
1)valid case
2)invalid case

Background:
Given User should be in home page of karnataka tourism website
@PositiveTesting
Scenario Outline: To test with multiple valid details
When Click on search option
And Enter data "<data1>"
And Click enter
Then User should see url as "<curl>"
Examples:
|data1|curl|
|Bidar|https://karnatakatourism.org/?s=Bidar|
|blogs|https://karnatakatourism.org/?s=blogs|
@NegativeTesting
Scenario: To Test with invalid details
When Click on search option
And Enter data "ddkjsdjkhsdkj"
And Click enter
Then User should see url as "https://karnatakatourism.org/?s=ddkjsdjkhsdkj"
  
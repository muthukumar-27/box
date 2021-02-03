Feature: this is test2
@pos @reg
Scenario Outline: this is
Given this is step1
When this is step "<a>" and "<b>"
Then this is final
Examples:
|a||b|
|hello||google|
|ok||google|
@neg @reg
Scenario Outline: this is
Given this is step1
When this is step "<a>" and "<b>"
Then this is final
Examples:
|a||b|
|1||2|
|3||4|
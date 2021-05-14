Feature: To Order The Dresses In The Automation Practice Web Application

Scenario: To Login The Sign In Page
Given user Launch The  Mystore Url 
When user Enter The Email Id In The Email Field
And user Enter The Password In The Password Field
Then user Click On The Sigin Button To Go To Next Page

 Scenario: Choose The Dress Type
 Given user Select The Women Section
 When user Moveto Evening Dress Type
 Then user Select The dresses
 And user Enter Into Frames
 Then User Select The Add To Kart
 Then user Select The Proceed To Checkout 
 Then user select The Proceed To Checkout For Summary
 Then user Select The Address For Delivery
 Then user Select The Terms And Conditions
 Then user Select The Shipping 
 Then user Choose The Payby Bank Wire Mode
 Then user Confirm The Order

 
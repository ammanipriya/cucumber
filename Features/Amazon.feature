Feature: check the search funtion 


Scenario: Home page
  Given User able to launch the url
  
 Scenario: Searchfunction
  When User able to type "smart watch" on the Search Box in Homepage
  And User able to click on the Search button,it navigates to smartwatch page
  Then User able to click "Newest Arrivals"
  Scenario: clickonproduct
  When User able to  click on the product
  Then User able to click add to cart
  
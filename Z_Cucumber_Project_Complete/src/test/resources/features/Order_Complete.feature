Feature: Order Creation as a Customer
 
#Ghirkin Language
 @Order

Scenario: Customer places an order successfully

Given a registered customer is logged into the website
And the customer has added products to the cart
Then the customer put it her name in the name field
Then the customer put it her Phone number in Phone number field
Then the customer put it her address in the address  field
Then the customer click the shipping method
And the customer complete the order click submit button
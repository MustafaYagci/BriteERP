Feature: Invoice Module

  @invoice
Scenario: As an authorized user I should be able to access Invoice module

Given user should be able to log in the application
And user should able to click invoice module
Then Verify that user should able to see the table of customer invoices
And Verify that table headers are contains
    |Customer|
    |Number|
    |Salesperson|
    |Due Date|
    |Total|
Then Veify that 5 small buttons are displayed down of the search box
And Verify that page header is "Customer Invoices - Odoo"
When Verify that radio buttons are clickable
And Verify that "Create" and "Import" buttons are displayed
Then Verify that user should able to click "calendar"
Given Verify that user should able to see following buttons
      |Day|
      |Week|
      |Month|
And Verify that followings are displayed under Sales
      |Documents|
      |Master Data|
      |Documents|
      |Master Data|
Then Verify that 3 link displayed under Documents
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
Then Verify that user should able to click "Calendar"
Given Verify that user should able to see "Day" "Week" "Month" buttons
And Verify that "Documents" and "Master Data" are displayed under "Sales"
Then Verify that 3 link displayed under Documents
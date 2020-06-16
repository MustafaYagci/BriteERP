Feature: 

	#User Story : As an authorized user I should be able to acces Invoice module
	#
	#AC:
	#1) Verify that user should able to see the table of customer invoices.
	#2) Verify that table headers are contains Customer, Number, Salesperson, Due Date, Total.
	#3) Veify that 5 small buttons are displayed down of the search box.
	#4) Verify that page header is Customer Invoices - Odoo.
	#5) Verify that radio buttons are clickable.
	#6) Verify that Create and Import buttons are displayed.
	#7) Verify that user should able to click Calendar.
	#8) Verify that user should able to see Day Week Month buttons.
	#9) Verify that Documents and Master Data are displayed under Sales.
	#10) Verify that 3 link displayed under Documents.
	@EU9-149
	Scenario: As an authorized user I should be able to acces Invoice module
		Feature: Invoice Module
		
		   Scenario: As an authorized user I should be able to acces Invoice module
		    Given user should be able to log in the application
		    And user should able to click invoice module
		    Then Verify that user should able to see the table of customer invoices
		    And Verify that table headers are contains "Customer", "Number", "Salesperson", "Due Date", "Total"
		    Then Veify that 5 small buttons are displayed down of the search box
		    And Verify that page header is "Customer Invoices - Odoo"
		    When Verify that radio buttons are clickable
		    And Verify that "Create" and "Import" buttons are displayed
		    Then Verify that user should able to click "Calendar"
		    Given Verify that user should able to see "Day" "Week" "Month" buttons
		    And Verify that "Documents" and "Master Data" are displayed under "Sales"
		    Then Verify that 3 link displayed under Documents
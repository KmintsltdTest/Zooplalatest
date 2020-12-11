Feature: Search property for sale
  As a customer i want the ability to be able to search
  for  a property so that i can purchase the property.

  @ignore
  Scenario Outline: Customer can search for properties for sale.
    Given  I navigate to zoopla homepage
    When   I enter a "<Location>"in the search textbox
    And    I select "<MinPrice>"from Min price dropdown
    And    I select "<MaxPrice>"from M dropdown
    And    I select "<Property>"from Property  dropdown
    And    I select "<Bed>"from bedrooms dropdown
    And    I click on the search button
    Then   a list of "<PropertyType>" in "<Location>" are displayed
    Then   application should be closed.

    Examples: |Location| MinPrice|MaxPrice |Property | Bed|PropertyType |
             #|Manchester| £150,000|£234,000|Houses | 3 |House |
             #|London| £300,000|£550,000|House | 3 |House|
              |Coventry| £200,000.00|£300,000|Flat  | 3 |Flat|
              |Birmingham| £109,000.00|£500,000 |House | 3| House |

  Scenario Outline: Customer cannot  search for properties with any missing value.
    Given  I navigate to zoopla homepage
    When   I enter a "<Location>in the search textbox
    And    I select "<MinPrice>"from Min price dropdown
    And    I select "<MaxPrice>"from M dropdown
    And    I select "<Property>"from Property  dropdown
    And    I select "<Bed>"from bedrooms dropdown
    And    I click on the search button
    Then   a list of "<PropertyType>" in "<Location>" are displayed.
    Then application should be closed.

    Examples: |Location| MinPrice|MaxPrice |Property | Bed |PropertyType |
              |        | £150,000|£300,000|House | 3 |House |

  Scenario Outline: Error Page is displayed for invalid Search.
    Given  I navigate to zoopla homepage
    When   I enter a "<Location>"in the search textbox
    And    I select "<MinPrice>"from Min price dropdown
    And    I select "<MaxPrice>"from Man price dropdown
    And    I select "<Property>"from Property type  dropdown
    And    I select "<Bed>"from Bedrooms dropdown
    And    I click on the search button
    Then   a list of "<PropertyType>" in "<Location>" are displayedSc
    Then   application should be closed.

    Examples: |Location| MinPrice|MaxPrice |Property | Bed |PropertyType |
              |Manchester| £250,000|£734,000|House | 3 |House |
              |Manchester| £10,000|£234,000|House | 3 |House |
              |London| £300,000|£550,000 |Hose | 3 |House|
              |Coventry| £20,000|£300,000|House  | 3 |House|
              |Birmingham| £109,000|£500,000 |House | 3| House |

@Hooks
Feature: To know Hooks and Tags
 
 @Positive @Smoke
  Scenario: My schol life
    Given Must have age three and above
    When Childs joins the school
    Then Child completes the school
    
    @Negative
   Scenario: My schol life
    Given Child not doesnot have age three and above
    When Childs joins the school with fake certificate
    Then Child completes the school with fake certificate
    
    
    
 

  
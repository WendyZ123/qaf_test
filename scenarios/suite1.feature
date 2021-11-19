Feature: Google Search

  @Smoke
  Scenario: Sample Test
    Given get '/'
    Then lands on google page
    When type in search words 'test'
#    When search for 'qaf github infostretch'
#    Then verify link with partial text 'qaf' is present
Feature: GreetingEndpoint: The user will be greeted with hello

  Background:
    * url baseUrl

  Scenario: Greet a Person
    Given path 'hellox'
    When method GET
    Then status 200

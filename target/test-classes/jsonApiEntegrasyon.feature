@jsonApi
Feature: Json Api Entegrasyon

  @jsonApiStatus
  Scenario: Json Api Status Code
    Given kullanici endpoint olarak "http://generator.swagger.io/api/swagger.json" tanimlar
    And kullanici request gönderip response elde eder
    Then kullanici status code assert eder

  @jsonApiClients
  Scenario: Json Api Clients Sayisi
    Given kullanici endpoint olarak "https://generator.swagger.io/api/gen/clients" tanimlar
    And kullanici request gönderip response elde eder
    Then kullanici clients sayisini assert eder

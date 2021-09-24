@web
Feature: Prueba de Madrid decide
  Prueba de uso de Webdriver para navegare sobre Madrid Decide
  Background:
    Given Abro el navegador en la pagina web principal
  Scenario: La navegación a un distrito es correcta
    When Voy a la pagina de usera
    When hago click en la primera propuesta
    Then Compruebo los titulos
    And Cierro el navegador
Feature: Prueba de Navegación
  Prueba de uso de Webdriver para navegare sobre un sitio web
  Background:
    Given Abro el navegador en la pagina web principal
  Scenario: La pagina de profesores en correcta
    When Voy a la pagina de profesores mediante el menu
    Then Deberia aparecer el con el titulo magento
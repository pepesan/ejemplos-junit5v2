Feature: Calculadora
  Pruebas de calculadora simple
  Scenario: suma simple
    Given Tengo una clase llamada Calculadora
    When ejecuto el método suma con el parametros 2 y 3
    Then debería devolver 5
  Scenario: otra suma simple
    Given Tengo una clase llamada Calculadora
    When ejecuto el método suma con el parametros 1 y 2
    Then debería devolver 3
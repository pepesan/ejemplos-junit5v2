@calculadora
Feature: Calculadora
  Pruebas de calculadora simple
  Background:
    Given Tengo una clase llamada Calculadora
  @calculadora
  Scenario: suma simple
    When ejecuto el método suma con el parametros 2 y 3
    Then debería devolver 5
  @calculadora
  Scenario: otra suma simple
    When ejecuto el método suma con el parametros 1 y 2
    Then debería devolver 3
  @calculadora
  Scenario: una resta simple
    When ejecuto el metodo resta con el parametros 2 y 1
    Then debería devolver 1
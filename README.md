# Ejemplos de Junit 5, Mockito y Cucumber

## lanzamiento mvn test
```shell 
mvn test
```
```shell
mvn -Dtest=example.SimpleTest test
```
```shell
mvn -Dtest=example.SimpleTest#testOnePlusOneEqualsTwo test
```
### ejecución de tag integracion
```shell 
mvn test -Dgroups="unidad"
```
### ejecución de tag varios tag
```shell 
mvn test -Dgroups="integracion | aceptacion"
``` 
## no ejecutes este tag api
```shell 
mvn test -Dgroups="!api"
```
## Web Driver
* Para usar el chrome webdriver debes descargarlo desde https://chromedriver.chromium.org/downloads
* En linux dale permisos de ejecución con: chmod +x chromedriver
* Descomprime y copia el fichero a directorio del PATH

## Cucumber
```shell
mvn -Dtest=example.cucumber.RunCucumberTest test
```
```shell 
mvn -Dtest=example.cucumber.RunCucumberCalculadoraTest test -Dcucumber.filter.tags="@calculadora"
```

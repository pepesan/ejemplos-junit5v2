# Ejemplos de Junit 5, Mockito y Cucumber

## lanzamiento mvn test
mvn test
mvn -Dtest=example.SimpleTest test
### ejecución de tag integracion
mvn test -Dgroups="integracion"
### ejecución de tag varios tag
mvn test -Dgroups="integracion | aceptacion"
## no ejecutes este tag api
mvn test -Dgroups="!api"
## Web Driver
* Para usar el chrome webdriver debes descargarlo desde https://chromedriver.chromium.org/downloads
* En linux dale permisos de ejecución con: chmod +x chromedriver
* Descomprime y copia el fichero a directorio del PATH

## Cucumber
mvn -Dtest=example.cucumber.RunCucumberTest test
mvn -Dtest=example.cucumber.RunCucumberCalculadoraTest test -Dcucumber.filter.tags="@calculadora"


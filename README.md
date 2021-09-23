# Ejemplos de Junit 5, Mockito y Cucumber

## lanzamiento mvn test
mvn test
mvn -Dtest=example.SimpleTest test

## Web Driver
* Para usar el chrome webdriver debes descargarlo desde https://chromedriver.chromium.org/downloads
* En linux dale permisos de ejecución con: chmod +x chromedriver
* Descomprime y copia el fichero a directorio del PATH

## Cucumber
mvn -Dtest=example.cucumber.RunCucumberTest test

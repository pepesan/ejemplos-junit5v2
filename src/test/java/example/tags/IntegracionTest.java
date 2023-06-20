package example.tags;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("example.tags")  // Paquete que contiene las clases de prueba
@IncludeTags({"unidad", "smoke"})  // Tags que se deben ejecutar
public class IntegracionTest {
}

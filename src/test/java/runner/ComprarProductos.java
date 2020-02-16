package runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import cucumber.api.SnippetType;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/comprar_productos.feature",
    glue="stepDefinitions",
    snippets = SnippetType.CAMELCASE)
public class ComprarProductos {
}

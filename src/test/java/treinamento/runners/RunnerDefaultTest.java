package treinamento.runners;

import static treinamento.config.DriverFactory.killDriver;

import java.net.MalformedURLException;

import static treinamento.config.DriverFactory.getDriver;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features"}, 
		glue = {"treinamento.steps"},
		snippets = CAMELCASE,
		tags = {},
		plugin = {"pretty","html:target/cucumber-html-report"},
		dryRun = false,
		strict = false
		)

public class RunnerDefaultTest {
	
	@BeforeClass
	public static void comecaTodosTestes() throws MalformedURLException {
		getDriver();
	}
	
	@AfterClass
	public static void finalizarTodosTestes() {
		killDriver();
	}
}

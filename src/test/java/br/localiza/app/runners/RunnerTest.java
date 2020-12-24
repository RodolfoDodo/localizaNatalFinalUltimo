package br.localiza.app.runners;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(
				features = "src/test/resources/features/AbastecerVeiculo.feature",
				glue = "br.localiza.app.steps",
				plugin = "pretty",
				monochrome = true,
				snippets = SnippetType.CAMELCASE,
				dryRun = false,
				strict = true)
public class RunnerTest {

	@After
	public void tearDown() {
		//gerarScreenShot();
		DriverFactory.killDriver();
		DriverFactory.getDriver().resetApp();
	}

	@AfterClass
	public static void fecharClasse() {
		DriverFactory.killDriver();
	}
}

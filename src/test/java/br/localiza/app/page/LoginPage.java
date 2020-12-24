package br.localiza.app.page;

import org.junit.Rule;
import org.junit.rules.TestName;

import br.localiza.app.runners.DriverFactory;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class LoginPage {
	
	@Rule
	public static TestName testName = new TestName();

	public void with(String matricula, String senha) {
		
		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/input_matricula").sendKeys(matricula);
		
		
		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/botao_configuracoes").click();

		DriverFactory.getDriver().findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout")
				.click();

		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/input_senha").sendKeys("111");

		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/btn_continuar").click();

		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/input_patrimonio").sendKeys("teste");
		
		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/input_agencia").sendKeys("aabhz");

		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/botaoSalvar").click();

	
		//DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/botao_login").click();
		
		
		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/input_senha").sendKeys(senha);
		
		tapLogin(505, 1576);
		
		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/botaoPositivo").click();

	}

	
	public void tapLogin(int x, int y) {
		new TouchAction<>(DriverFactory.getDriver()).tap(PointOption.point(x, y)).perform();

	}

	

}

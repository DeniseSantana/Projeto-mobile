package treinamento.steps;

import java.awt.Menu;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import treinamento.pages.MenuPage;
import treinamento.utils.Helper;

public class MenuSteps {
	
	private MenuPage menuPage;
	
	@Before
	public void inicialza() {
		menuPage = new MenuPage();
	}
	
	@After
	public void finalizarTeste(Scenario scenario) {
		Helper.finalizaTestes();
	}
	
	@Dado("que acessei o API Demos")
	public void queAcesseiOAPIDemos() {
		menuPage.givePermission();
		menuPage.outdateNoProblem();
	}

	@Quando("eu clicar em Acessibility")
	public void euClicarEmAcessibility() {
		menuPage.accessibility();
		menuPage.animation();
		}

	@Entao("visualizarei os sub menus de Acessibility")
	public void visualizareiOsSubMenusDeAcessibility() {
	}
}

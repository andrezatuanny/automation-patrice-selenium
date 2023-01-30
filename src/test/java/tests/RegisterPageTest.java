package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.QaTestes.automation.patrice.selenium.pages.LoginPage;
import com.QaTestes.automation.patrice.selenium.pages.RegisterPage;

class RegisterPageTest {
	private RegisterPage registerPage;
	private final String URL = "http://automationpractice.pl/index.php?controller=authentication&back=my-account";
	

	@BeforeEach
	void setUp() throws Exception {
		this.registerPage = new RegisterPage();
		this.registerPage.visit(this.URL);
	}

	@AfterEach
	void tearDown() throws Exception {
		//this.registerPage.quitWebDriver();
	}

	@Test
	void criandoContaComEmailNãoRegistrado() {
		// when
		this.registerPage.insertEmailToRegister();
		
		//then
		String expected = "an.dreza-@hotmail.com";
		String actual = this.registerPage.getEmailNewAccount();
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void preenchendoTodosOscamposComDadosVálidosParaCriacaoDeConta() {
		//when
		this.registerPage.fillOutForm();
		
		//then
		String expected = "Welcome to your account. Here you can manage all of your personal information and orders.";
		String actual = this.registerPage.getWelcomeMessage();
		Assertions.assertEquals(expected, actual);
		
		String actualUrl = this.registerPage.getCurrentUrl();
		Assertions.assertFalse(this.URL.equals(actualUrl));
	}

}

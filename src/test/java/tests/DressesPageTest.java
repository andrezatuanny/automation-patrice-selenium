package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.QaTestes.automation.patrice.selenium.pages.DressesPage;


class DressesPageTest {
	private DressesPage desssesPage;
	private final String URL = "http://automationpractice.pl/index.php";

	@BeforeEach
	void setUp() throws Exception {
		this.desssesPage = new DressesPage();
		this.desssesPage.visit(this.URL);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		this.desssesPage.quitWebDriver();
	}

	@Test
	void test() {
		//when
		this.desssesPage.viewCasualDressesPage();

		//then
		Assertions.assertEquals("CASUAL DRESSES ", this.desssesPage.getTitlePage());
		Assertions.assertFalse(this.URL.equals(desssesPage.getCurrentUrl()));
	}

}

package ar.nic.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaymentsRegisterSteps {

    @Given("i went to payments site main page")
    public void go_payments_site_main_page() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium.dev");
        System.console().printf("TITTLE");
        System.console().printf(driver.getTitle());
        driver.quit();
    }
    @When("i click in register button")
    public void i_click_in_register_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("i should see the form with the fields")
    public void i_should_see_the_form_with_the_fields(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}

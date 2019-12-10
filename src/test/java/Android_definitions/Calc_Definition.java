package Android_definitions;

import Android_Steps.NativeAndroid_Calc_Step;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Calc_Definition {


    @Steps
    NativeAndroid_Calc_Step calc_step;

    @Given("^Charles open calculator app$")
    public void open_calculator_app() {
        calc_step.abrir_calculadora();
    }

    @When("^Charles adds two numbers$")
    public void adds_two_numbers() {
        calc_step.ingresa_datos();
    }

    @Then("^Charles validates multiply of two numbers as 650$")
    public void validates_multiply_of_two_numbers_as() {
        calc_step.valida("1,047,333");

    }

    @Then("^Charles closed calculator app$")
    public void closed_calculator_app() {

        calc_step.cerrar_app();
    }
}

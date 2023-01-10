package stepsdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pageobject.AppointmentConfirmation;
import pageobject.Login;
import pageobject.MakeAppointment;

public class CuraHealthCareStepsDefinitions {
    @Steps
    Login login;
    MakeAppointment makeAppointment;
    AppointmentConfirmation appointmentConfirmation;

    @Given("^que el usuario ingrese a la web$")
    public void queElUsuarioIngreseALaWeb() {
        login.open();

    }

    @When("^ingreso (.*) y (.*)$")
    public void ingresoUserNameYPassword(String userName, String password) {
        login.clickMakeAppointment();
        login.enterCredencial(userName, password);

    }

    @And("^doy clic en el boton Login que dirige a realizar la reserva de cita medica$")
    public void doyClicEnElBotonLoginQueDirigeARealizarLaReservaDeCitaMedica() {
        login.btnLogin.click();
    }

    @And("^selecciona (.*),hago check (.*) y selecciono (.*),(.*) e ingresar (.*)")
    public void seleccionaFacilityHagoCheckApplyYSeleccionoHealthcareProgramVisitDateEIngresarComentario(String facility, String apply, String healthcareProgram, String visitDate, String comentario) {
        makeAppointment.enterInfoFormAppointment(facility, apply, healthcareProgram, visitDate, comentario);
        makeAppointment.btnBookAppointment.click();
    }

    @Then("^verifica la reserva de cita medica$")
    public void verificaLaReservaDeCitaMedicaLblMessageSuccess() {
        appointmentConfirmation.validateInfoIngresada();
    }
}
package stepdefinitions.IngresarAfuncionalidadBlockValidation;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import questions.IngresarAfuncionalidadBlockValidation.SeVisualizaElTitulo;
import tasks.IngresarAfuncionalidadBlockValidation.IngresarAfuncionalidad;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class IngresarAfuncionalidadBlockValidationStepDefinition {

    @Cuando("^seleccione el submenu Form Validation$")
    public void seleccioneElSubmenuFormValidation() {
        theActorInTheSpotlight().attemptsTo(IngresarAfuncionalidad.validationPage());
    }

    @Entonces("^visualiza el titulo (.*)$")
    public void visualizaElTituloBlockValidation(String texto) {
        theActorInTheSpotlight().should(seeThat(SeVisualizaElTitulo.blockValidation(texto)));
    }
}

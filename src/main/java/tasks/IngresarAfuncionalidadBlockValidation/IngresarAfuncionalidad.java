package tasks.IngresarAfuncionalidadBlockValidation;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userinterfaces.IngresarAfuncionalidadBlockValidation.IngresarAfuncionalidadBlockValidationPage.*;

public class IngresarAfuncionalidad implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TXT_FORMS),
                Click.on(TXT_FORM_VALIDATION)
        );
    }
    public static IngresarAfuncionalidad validationPage(){
        return Tasks.instrumented(IngresarAfuncionalidad.class);
    }
}

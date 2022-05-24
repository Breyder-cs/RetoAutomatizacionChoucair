package questions.IngresarAfuncionalidadBlockValidation;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.IngresarAfuncionalidadBlockValidation.IngresarAfuncionalidadBlockValidationPage.TXT_BLOCK_VALIDATION;

public class SeVisualizaElTitulo implements Question<Boolean> {

    private String texto;
    public SeVisualizaElTitulo(String texto) { this.texto = texto; }

    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_BLOCK_VALIDATION.resolveFor(actor).isPresent() &&
                (TXT_BLOCK_VALIDATION.resolveFor(actor).getText().equals(texto));
    }

    public static SeVisualizaElTitulo blockValidation(String texto){ return new SeVisualizaElTitulo(texto); }
}

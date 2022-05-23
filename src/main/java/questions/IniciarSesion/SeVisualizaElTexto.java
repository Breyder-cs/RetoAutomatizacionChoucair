package questions.IniciarSesion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.IniciarSesion.IniciarSesionPage.TXT_MENU;

public class SeVisualizaElTexto implements Question<Boolean> {

    private String texto;
    public SeVisualizaElTexto(String texto) { this.texto = texto; }

    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_MENU.resolveFor(actor).isPresent()
                && (TXT_MENU.resolveFor(actor).getText().equals(texto));
    }

    public static SeVisualizaElTexto metis(String texto) {return new SeVisualizaElTexto(texto);}
}

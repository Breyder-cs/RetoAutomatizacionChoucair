package userinterfaces.IngresarAfuncionalidadBlockValidation;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresarAfuncionalidadBlockValidationPage  extends PageObject {

    public static Target TXT_FORMS = Target.the("Menú forms")
            .locatedBy("//span[contains(text(),'Forms')]");

    public static Target TXT_FORM_VALIDATION = Target.the("Sub menú form validation")
            .locatedBy("(//ul[@class='collapse in']/li)[2]");

    public static Target TXT_BLOCK_VALIDATION = Target.the("Texto para verificar que entró al formulario")
            .locatedBy("//h5[contains(text(),'Block Validation')]");
}

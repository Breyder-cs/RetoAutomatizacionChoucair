package userinterfaces.IniciarSesion;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class IniciarSesionPage extends PageObject {

    public static Target TXT_USUARIO = Target.the("Campo para digitar el usuario")
            .locatedBy("//input[@placeholder='Username']");

    public static Target TXT_CONTRASENIA = Target.the("Campo para digitar la contraseña")
            .locatedBy("//input[@placeholder='Password']");

    public static Target BTN_INICIAR_SESION = Target.the("Botón para iniciar sesión")
            .locatedBy("//button[text()='Sign in']");

    public static Target TXT_MENU = Target.the("Texto para validar el inicio de sesión")
            .locatedBy("//li[contains(text(),'Menu')]");

}

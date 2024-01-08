package TrabajoPOM_GuillermoBateman.pages;

import TrabajoPOM_GuillermoBateman.utils.ClaseBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactanosPage extends ClaseBase {

    //Centralizar Localizadores

    By locatorTxtNombre = By.id("id_nombre_contacto");
    By locatorTxtApellido = By.id("id_apellido_contacto");
    By locatorTxtRut =  By.id("id_rut_contacto");
    By locatorTxtTelefono = By.id("id_telefono_contacto");
    By locatorTxtEmail =  By.id("id_email_contacto");
    By locatorTxtBoleta =  By.id("id_nro_boleta");
    By locatorTxtMotivo = By.id("id_lista_motivo");
    By locatorTxtClasificacion =  By.id("id_lista_clasificacion_motivo");
    By locatorTxtComentarios =  By.id("id_comentarios_contacto");

    By locatorBtnEnviar = By.id("id_enviar_formulario");

     //Funciones

    public ContactanosPage(WebDriver driver) {
        super(driver);
    }

    public void ingresarDatosContacto(String nombre,String apellido,String rut,String telefono,String email,String boleta,String motivo,String clasificacion,String comentarios) {
        agregarTexto(esperarPresenciaWebElement(locatorTxtNombre),nombre);
        agregarTexto(esperarPresenciaWebElement(locatorTxtApellido),apellido);
        agregarTexto(esperarPresenciaWebElement(locatorTxtRut),rut);
        agregarTexto(esperarPresenciaWebElement(locatorTxtTelefono),telefono);
        agregarTexto(esperarPresenciaWebElement(locatorTxtEmail),email);

        agregarTexto(esperarPresenciaWebElement(locatorTxtBoleta),boleta);
        agregarTexto(esperarPresenciaWebElement(locatorTxtMotivo),motivo);
        agregarTexto(esperarPresenciaWebElement(locatorTxtClasificacion),clasificacion);
        agregarTexto(esperarPresenciaWebElement(locatorTxtComentarios),comentarios);

        //click(esperarPorElementoAClickear(locatorBtnEnviar)); //Registrate
    }

}

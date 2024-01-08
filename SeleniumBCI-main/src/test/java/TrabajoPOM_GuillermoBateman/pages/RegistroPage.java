package TrabajoPOM_GuillermoBateman.pages;

import TrabajoPOM_GuillermoBateman.utils.ClaseBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistroPage extends ClaseBase {

    //Centralizar Localizadores

    By locatorTxtManRut = By.id("id_rut_man_cliente");
    By locatorTxtManCliente = By.id("id_nombre_man_cliente");
    By locatorTxtPhone =  By.id("phone");
    By locatorTxtManEmail = By.id("id_email_man_cliente");
    By locatorTxtAutocomplete =  By.id("autocomplete");
    By locatorTxtNombreDireccion =  By.id("nombre_direccion");
    By locatorTxtRoute = By.id("route");
    By locatorTxtNumero =  By.id("street_number");
    By locatorTxtLocalidad =  By.id("locality");
    By locatorTxtClave =  By.id("id_clave_man_cliente");
    By locatorTxtReingreso =  By.id("id_reingrese_man_cliente");
    By locatorBtnGuardarCliente = By.id("btn_guardar_cliente");

     //Funciones

    public RegistroPage(WebDriver driver) {
        super(driver);
    }

    public void ingresarDatosRegistro(String rut,String cliente,String phone,String email,String auto,String dir,String ruta,String nro,String local, String clave, String reingreso) {
        agregarTexto(esperarPresenciaWebElement(locatorTxtManRut),rut);
        agregarTexto(esperarPresenciaWebElement(locatorTxtManCliente),cliente);
        agregarTexto(esperarPresenciaWebElement(locatorTxtPhone),phone);
        agregarTexto(esperarPresenciaWebElement(locatorTxtManEmail),email);
        agregarTexto(esperarPresenciaWebElement(locatorTxtAutocomplete),auto);
        agregarTexto(esperarPresenciaWebElement(locatorTxtNombreDireccion),dir);
        agregarTexto(esperarPresenciaWebElement(locatorTxtRoute),ruta);
        agregarTexto(esperarPresenciaWebElement(locatorTxtNumero),nro);
        agregarTexto(esperarPresenciaWebElement(locatorTxtLocalidad),local);
        agregarTexto(esperarPresenciaWebElement(locatorTxtClave),clave);
        agregarTexto(esperarPresenciaWebElement(locatorTxtReingreso),reingreso);

       // click(esperarPorElementoAClickear(locatorBtnGuardarCliente)); //Registrate
    }

}

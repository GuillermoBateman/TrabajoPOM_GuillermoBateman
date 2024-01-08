package TrabajoPOM_GuillermoBateman.pages;

import TrabajoPOM_GuillermoBateman.utils.ClaseBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class miPedidoPage extends ClaseBase {
    //Centralizar los By
    By localizadorRutDespacho = By.id("id_rut_despacho");
    By localizadorBoleta  = By.id("id_boleta_despacho");
    By localizadorEnviarConsulta = By.id("id_buscar_documento");

    public miPedidoPage(WebDriver driver) {
        super(driver);
    }

    //Acciones
    public void ingresarBuscaPedido(String rut,String boleta){
        agregarTexto(esperarPresenciaWebElement(localizadorRutDespacho),rut);
        agregarTexto(esperarPresenciaWebElement(localizadorBoleta),boleta);
        click(esperarPorElementoAClickear(localizadorEnviarConsulta));

    }

}

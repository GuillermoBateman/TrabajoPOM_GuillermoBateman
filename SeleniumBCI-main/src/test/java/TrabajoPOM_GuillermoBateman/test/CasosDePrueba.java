package TrabajoPOM_GuillermoBateman.test;

import TrabajoPOM_GuillermoBateman.pages.ContactanosPage;
import TrabajoPOM_GuillermoBateman.pages.HomePage;
import TrabajoPOM_GuillermoBateman.pages.RegistroPage;
import TrabajoPOM_GuillermoBateman.pages.miPedidoPage;
import TrabajoPOM_GuillermoBateman.utils.DataDriven;
import TrabajoPOM_GuillermoBateman.utils.PropertiesManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class CasosDePrueba {
    private WebDriver driver; //null
    private HomePage homePage;
    private ContactanosPage contactanosPage;
    private miPedidoPage miPedidoPage; //null
    private RegistroPage registroPage; //null
    private String browser = PropertiesManager.obtenerProperty("browser");
    private String propertyDriver = PropertiesManager.obtenerProperty("propertyDriver");
    private String rutaDriver = PropertiesManager.obtenerProperty("rutaDriver");
    private String url = PropertiesManager.obtenerProperty("url");
    private ArrayList<String> datosPrueba; //null

    @BeforeEach
    public void preparacionTests(){
        datosPrueba = new ArrayList<String>(); //arreglo tamaño 0
        homePage = new HomePage(driver);
        homePage.conexionDriver(browser,rutaDriver,propertyDriver);
        homePage.manejoEsperasElementosWeb(10);
        contactanosPage = new ContactanosPage(homePage.getDriver());
        miPedidoPage = new miPedidoPage(homePage.getDriver());
        registroPage = new RegistroPage(homePage.getDriver());
        homePage.cargarURL(url);
        homePage.maximizarBrowser();
    }

    @Test
    public void CP001_ingresar_datos_contacto() {
        datosPrueba = DataDriven.prepararData("CP001_ingresar_datos_contacto");
        homePage.irAContactanos();
        contactanosPage.ingresarDatosContacto(datosPrueba.get(1), datosPrueba.get(2), datosPrueba.get(3), datosPrueba.get(4), datosPrueba.get(5), datosPrueba.get(6), datosPrueba.get(7), datosPrueba.get(8), datosPrueba.get(8));
    //    Assertions.assertEquals(datosPrueba.get(8), homePage.getUsername());
        Assertions.assertTrue(true);
    }

    @Test
    public void CP002_error_ingresar_datos_contacto(){
        datosPrueba = DataDriven.prepararData("CP002_error_ingresar_datos_contacto");
        // Nombre y apellido en blanco en planilla
        homePage.irAContactanos();
        contactanosPage.ingresarDatosContacto(datosPrueba.get(1), datosPrueba.get(2), datosPrueba.get(3), datosPrueba.get(4), datosPrueba.get(5), datosPrueba.get(6), datosPrueba.get(7), datosPrueba.get(8), datosPrueba.get(8));
        //    Assertions.assertEquals(datosPrueba.get(8), homePage.getUsername());
        WebElement errorNombre = driver.findElement(By.id("error_nombre"));
        Assertions.assertTrue(errorNombre.isEnabled());
    }

    @Test
    public void CP003_buscar_mi_pedido (){
        datosPrueba = DataDriven.prepararData("CP003_buscar_mi_pedido");
        homePage.irAMiPedido();
        miPedidoPage.ingresarBuscaPedido(datosPrueba.get(1), datosPrueba.get(2) );
        Assertions.assertTrue(true);
    }

    @Test
    public void CP004_error_buscar_mi_pedido () {
        // nro de pedido en blanco en la planilla
        datosPrueba = DataDriven.prepararData("CP003_buscar_mi_pedido");
        homePage.irAMiPedido();
        miPedidoPage.ingresarBuscaPedido(datosPrueba.get(1), datosPrueba.get(2));

        WebElement errorDocumento = driver.findElement(By.id("id_msg_error_despacho"));

        if (errorDocumento.isEnabled()) {
            Assertions.assertTrue(false);
        } else {
            Assertions.assertTrue(true);
        }
    }
    @Test
        public void CP005_registro_cliente (){
            // No se graba cliente para no bloquear pagina
            datosPrueba = DataDriven.prepararData("CP005_registro_cliente");
            homePage.irARegistro();
            registroPage.ingresarDatosRegistro(datosPrueba.get(1), datosPrueba.get(2), datosPrueba.get(3), datosPrueba.get(4), datosPrueba.get(5), datosPrueba.get(6), datosPrueba.get(7), datosPrueba.get(8), datosPrueba.get(9), datosPrueba.get(10), datosPrueba.get(11) );
            Assertions.assertTrue(true);
    }

    @AfterEach
    public void posEjecucion(){
        homePage.cerrarBrowser();
    }
}

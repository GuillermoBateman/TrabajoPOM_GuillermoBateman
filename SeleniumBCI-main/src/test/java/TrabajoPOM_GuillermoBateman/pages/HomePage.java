package TrabajoPOM_GuillermoBateman.pages;

import TrabajoPOM_GuillermoBateman.utils.ClaseBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends ClaseBase {

    //CENTRALIZAR LOCALIZADOR
    By localizadorContactanos = By.xpath("//a[@href='/contactenos'][1]");

    By localizadorPedido = By.xpath("//a[@href='/despacho'][1]");

    By localizadorRegistro = By.xpath("//a[@href='/registro'][1]");


    //Método que realicen las acciones del sitio
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void irAContactanos(){
        click(esperarPorElementoAClickear(localizadorContactanos));
    }
    public void irAMiPedido(){
        click(esperarPorElementoAClickear(localizadorPedido));
    }

    public void irARegistro(){
        click(esperarPorElementoAClickear(localizadorPedido));
        click(esperarPorElementoAClickear(localizadorRegistro));
    }

}

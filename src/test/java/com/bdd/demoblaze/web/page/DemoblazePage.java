package com.bdd.demoblaze.web.page;

import com.bdd.demoblaze.web.path.DemoblazePath;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import java.util.Map;


public class DemoblazePage {

    private WebDriver driver;

    DemoblazePath demoblazePath = new DemoblazePath();

    public void iniciarWebPage(String url) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Usuario\\Desktop\\AUTOMATIZACION\\ejercicios_automatizacion\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nava")));
    }

    public void crearRegistroPage(DataTable dataTable){
       List<Map<String, String>> list = dataTable.asMaps(String.class,String.class);
       String username = list.get(0).get("usuario");
       String clave = list.get(0).get("clave");
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(demoblazePath.opc_inscripcion))).click();
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(demoblazePath.inp_nombreUsuario))).sendKeys(username);
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(demoblazePath.inp_claveUsuario))).sendKeys(clave);
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(demoblazePath.btn_Sign_up))).click();
    }

    public void usuarioCreado(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.switchTo().alert().accept();
    }

    public void completeRegistro(DataTable dataTable){
        List<Map<String, String>> list = dataTable.asMaps(String.class,String.class);
        String username = list.get(0).get("usuario");
        String clave = list.get(0).get("clave");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(demoblazePath.opc_iniciar_sesion))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(demoblazePath.inp_Username))).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(demoblazePath.inp_Password))).sendKeys(clave);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(demoblazePath.btn_Log_in))).click();
    }

    public void cerrarSesion(){
        try {
            Thread.sleep(3000);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(demoblazePath.btn_Log_out))).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void agregarLaptopAlCarrito(){
        try {
            Thread.sleep(3000);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(demoblazePath.btn_Laptop))).click();
            Thread.sleep(3000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(demoblazePath.opc_Sony))).click();
            Thread.sleep(3000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(demoblazePath.btn_Add_To_Cart))).click();
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.switchTo().alert().accept();
    }

    public void comprobarProducto(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(demoblazePath.opc_Cart))).click();
    }
}

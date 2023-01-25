package com.bdd.demoblaze.web.step;

import com.bdd.demoblaze.web.page.DemoblazePage;
import io.cucumber.datatable.DataTable;

public class DemoblazeStep {

    DemoblazePage demoblazePage = new DemoblazePage();

    public void iniciarWeb(String url){
        demoblazePage.iniciarWebPage(url);
    }
    public void crearRegistro(DataTable dataTable){
        demoblazePage.crearRegistroPage(dataTable);

    }
    public void usuarioCreado() throws Throwable {
        demoblazePage.usuarioCreado();
    }

    public void completeRegistro(DataTable dataTable){
        demoblazePage.completeRegistro(dataTable);
    }

    public void cerrarSesion(){
        demoblazePage.cerrarSesion();
    }

    public void agregarLaptopAlCarrito(){
        demoblazePage.agregarLaptopAlCarrito();
    }
    public void comprobarProducto(){
        demoblazePage.comprobarProducto();
    }
}

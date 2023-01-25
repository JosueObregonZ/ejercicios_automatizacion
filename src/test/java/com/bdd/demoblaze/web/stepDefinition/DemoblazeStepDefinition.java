package com.bdd.demoblaze.web.stepDefinition;
import com.bdd.demoblaze.web.step.DemoblazeStep;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

import java.util.List;
import java.util.Map;


public class DemoblazeStepDefinition {

    DemoblazeStep demoblazeStep = new DemoblazeStep();

    @Dado("^el usuario ingresa a la web$")
    public void elUsuarioIngresaAlaWeb(DataTable url) throws Throwable {
        List<Map<String, String>> list = url.asMaps(String.class,String.class);
        String valorURL = list.get(0).get("url");
        demoblazeStep.iniciarWeb(valorURL);
    }

    @Cuando("^realice una alta nueva$")
    public void realiceUnAltaNueva(DataTable dataTable) throws Throwable {
        demoblazeStep.crearRegistro(dataTable);
    }

    @Entonces("^se creara correctamente el usuario$")
    public void seCrearaCorrectamenteElUsuario() throws Throwable {
        demoblazeStep.usuarioCreado();
    }

    @Cuando("^complete el registro$")
    public void completeElRegistro(DataTable dataTable) throws Throwable {
        demoblazeStep.completeRegistro(dataTable);
    }
    @Y("^desee cerrar sesión$")
    public void CerrarSesion() throws Throwable {
        demoblazeStep.cerrarSesion();
    }

    @Y("^agregue una laptop al carrito$")
    public void agregarLaptoAlpAlCarrito() throws Throwable {
        demoblazeStep.agregarLaptopAlCarrito();
    }
    @Entonces("^se comprueba que se agregó al carrito$")
    public void comprobarProductoEnElCarrito() throws Throwable {
        demoblazeStep.comprobarProducto();
    }
}

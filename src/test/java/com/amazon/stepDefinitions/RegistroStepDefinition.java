package com.amazon.stepDefinitions;

import com.amazon.questions.ValidacionRegistro;
import com.amazon.tasks.Registro;
import com.amazon.userInterfaces.RegistroPage;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RegistroStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor eli = Actor.named("eli");


    private RegistroPage registroPage = new RegistroPage();

    @Before
    public void configuracion(){
        eli.can(BrowseTheWeb.with(navegador));
    }




    @Dado("^el usuario se encuentra en la pagina web$")
    public void elUsuarioSeEncuentraEnLaPaginaWeb() {

        eli.wasAbleTo(Open.browserOn(registroPage));

    }


    @Cuando("^el ingrese los datos solicitados en los campos requeridos se hara el registro$")
    public void elIngreseLosDatosSolicitadosEnLosCamposRequeridosSeHaraElRegistro() {
        eli.attemptsTo(
                Registro.informacion()
        );

    }

    @Entonces("^el visualizara su perfil con su nombre$")
    public void elVisualizaraSuPerfilConSuNombre() {
      eli.should(seeThat("el actor puede ver", ValidacionRegistro.validar(), Matchers.equalTo(true)));


    }





}

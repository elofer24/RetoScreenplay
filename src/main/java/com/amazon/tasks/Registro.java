package com.amazon.tasks;


import com.amazon.utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

import static com.amazon.userInterfaces.RegistroPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class Registro implements Task {
    Datos datos = new Datos();

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
      actor.attemptsTo(

              Click.on(BTN_CUENTA),
              Enter.theValue(datos.leerDatosExcel("Datos.xlsx","Registro", 1, 0)).into(TXT_CORREO),
              Click.on(BTN_CONTINUAR),
              Enter.theValue(datos.leerDatosExcel("Datos.xlsx","Registro", 1, 1)).into(TXT_CLAVE),
              Click.on(BTN_INICIAR_SESION)






      );


        }catch (Exception e){
           e.printStackTrace();

        }


    }

    public static Registro informacion(){

        return instrumented (Registro.class);
    }
}
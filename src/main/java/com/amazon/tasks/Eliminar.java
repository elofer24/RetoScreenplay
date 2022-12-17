package com.amazon.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.amazon.userInterfaces.ComprasPage.BTN_TODO;
import static com.amazon.userInterfaces.EliminarPage.*;


public class Eliminar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        WaitUntil.the(BTN_ELIMINAR, WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds();
        actor.attemptsTo(

                Click.on(BTN_ELIMINAR),
                Click.on(BTN_CARRITO)

        );




    }
}

package com.amazon.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.amazon.userInterfaces.ComprasPage.*;


public class Compras implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        WaitUntil.the(BTN_TODO, WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds();
            actor.attemptsTo(
                    Click.on(BTN_TODO),
                    Click.on(BTN_VER_TODO),
                    Click.on(TXT_HOGAR),
                    Click.on(TXT_MUEBLES),
                    Click.on(TXT_COMEDOR),
                    Click.on(IMG_SILLAS),
                    Click.on(BTN_CANTIDAD),
                    Click.on(BTN_SELECCIONAR),
                    Click.on(IMG_OTRO_PRODUCTO),
                    Click.on(BTN_AGREGARP),
                    Click.on(TXT_BANO),
                    Click.on(IMG_MUEBLES_BANO),
                    Click.on(BTN_CANTIDADB),
                    Click.on(BTN_SELECCIONARB),
                    Click.on(BTN_AGREGARB),
                    Click.on(IMG_OTRO_PRODUCTOB),
                    Click.on(BTN_AGREGARBA),
                    Click.on(TXT_COCINA),
                    Click.on(IMG_COCINA),
                    Click.on(BTN_CANTIDADC),
                    Click.on(BTN_SELECCIONARC),
                    Click.on(BTN_AGREGARC),
                    Click.on(IMG_OTRO_PRODUCTOC),
                    Click.on(BTN_AGREGARCO),
                    Click.on(TXT_OFICINA),
                    Click.on(IMG_OFICINA),
                    Click.on(BTN_CANTIDADO),
                    Click.on(BTN_SELECCIONARO),
                    Click.on(BTN_AGREGARO),
                    Click.on(IMG_OTRO_PRODUCTOO),
                    Click.on(BTN_AGREGAROFI),
                    Click.on(TXT_DECORATIVO),
                    Click.on(IMG_DECORATIVO),
                    Click.on(BTN_CANTIDADO),
                    Click.on(BTN_SELECCIONARD),
                    Click.on(BTN_AGREGARD),
                    Click.on(IMG_OTRO_PRODUCTOD),
                    Click.on(BTN_AGREGARDE)



            );




    }

}




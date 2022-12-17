package com.amazon.userInterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EliminarPage {

    public static final Target BTN_CARRITO = Target.the("todos las categorias").located(By.xpath("//a[@href='/-/es/gp/cart/view.html?ref_=nav_cart']"));
    public static final Target BTN_ELIMINAR = Target.the("todos las categorias").located(By.xpath("submit.delete.C7c4fc086-1224-446b-94b0-7f802b9e906e"));

}

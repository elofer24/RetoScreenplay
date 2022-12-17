package com.amazon.userInterfaces;

import net.serenitybdd.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://www.amazon.com/")

    public class RegistroPage extends PageObject {

    public static final Target BTN_CUENTA = Target.the("identificate").located(By.xpath("//a[@href='https://www.amazon.com/-/es/gp/css/homepage.html?ref_=nav_youraccount_btn']"));
    public static final Target TXT_CORREO = Target.the("igresar correo").located(By.className("a-input-text a-span12 auth-autofocus auth-required-field"));
    public static final Target BTN_CONTINUAR = Target.the("continuar").located(By.className("a-button-input"));
   public static final Target TXT_CLAVE = Target.the("ingresar clave").located(By.className("a-input-text a-span12 auth-autofocus auth-required-field"));
    public static final Target BTN_INICIAR_SESION = Target.the("iniciar sesion").located(By.id("signInSubmit"));



    }


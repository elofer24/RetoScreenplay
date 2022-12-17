package com.amazon.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ComprasPage {

    public static final Target BTN_TODO = Target.the("todos las categorias").located(By.xpath("//a[@aria-label='Abrir menú']"));
    public static final Target BTN_VER_TODO = Target.the("todos las secciones").located(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn'][1]"));
    public static final Target TXT_HOGAR = Target.the("seccion hogar").located(By.xpath("//div[text()='Hogar y Cocina']"));
    public static final Target TXT_MUEBLES = Target.the("seccion de muebles").located(By.xpath("//a[text()='Muebles']"));
    public static final Target TXT_COMEDOR = Target.the("seleccionar comedor").located(By.id("n/3733781"));
    public static final Target IMG_SILLAS = Target.the("sillas comedor").located(By.xpath("//img[@src='https://m.media-amazon.com/images/W/WEBP_402378-T1/images/I/5191uAvtamL._AC_UL320_.jpg']"));
    public static final Target BTN_CANTIDAD= Target.the("seleccionar comedor").located(By.id("a-autoid-0"));
    public static final Target BTN_SELECCIONAR = Target.the("seleccionar 3 ").located(By.xpath("//a[@data-value='{'stringVal':'3'}']"));
    public static final Target BTN_AGREGAR = Target.the("agregar al carro de compras").located(By.xpath("//input[@data-hover='Seleccionar <b>__dims__</b> de la izquierda<br> para agregar al carrito de compras']"));
    public static final Target IMG_OTRO_PRODUCTO = Target.the("seleccionar otro producto").located(By.xpath("//img[@src='https://m.media-amazon.com/images/W/WEBP_402378-T1/images/I/51sixjhFJzL._AC_UL320_.jpg']"));
    public static final Target BTN_AGREGARP = Target.the("agregar al carro de compras").located(By.xpath("//input[@data-hover='Seleccionar <b>__dims__</b> de la izquierda<br> para agregar al carrito de compras']"));
    public static final Target TXT_BANO = Target.the("seleccionar comedor").located(By.id("n/5392425011"));
    public static final Target IMG_MUEBLES_BANO = Target.the("seleccionar muebles bano").located(By.xpath("//img[@src='https://m.media-amazon.com/images/W/WEBP_402378-T1/images/I/61AcF5n875L._AC_UL320_.jpg']"));
    public static final Target BTN_CANTIDADB = Target.the("seleccionar muebles bano").located(By.id("a-autoid-0-announce"));
    public static final Target BTN_SELECCIONARB = Target.the("seleccionar 3 ").located(By.xpath("//a[@data-value='{'stringVal':'3'}']"));
    public static final Target BTN_AGREGARB = Target.the("agregar al carro de compras").located(By.xpath("//input[@data-hover='Seleccionar <b>__dims__</b> de la izquierda<br> para agregar al carrito de compras']"));
    public static final Target IMG_OTRO_PRODUCTOB = Target.the("seleccionar otro producto").located(By.xpath("//img[@src='https://m.media-amazon.com/images/W/WEBP_402378-T1/images/I/51sixjhFJzL._AC_UL320_.jpg']"));
    public static final Target BTN_AGREGARBA = Target.the("agregar al carro de compras").located(By.xpath("//input[@data-hover='Seleccionar <b>__dims__</b> de la izquierda<br> para agregar al carrito de compras']"));
    public static final Target TXT_COCINA = Target.the("seleccionar muebles para cocina").located(By.xpath("//span[text()='Muebles de Cocina']"));
    public static final Target IMG_COCINA = Target.the("seleccionar muebles cocina").located(By.xpath("//img[@src='https://m.media-amazon.com/images/W/WEBP_402378-T1/images/I/61fkMC5zSPL._AC_UL320_.jpg']"));
    public static final Target BTN_CANTIDADC = Target.the("seleccionar comedor").located(By.id("a-autoid-4-announce"));
    public static final Target BTN_SELECCIONARC = Target.the("seleccionar 3 ").located(By.xpath("//a[@data-value='{'stringVal':'3'}']"));
    public static final Target BTN_AGREGARC = Target.the("agregar al carro de compras").located(By.xpath("//input[@data-hover='Seleccionar <b>__dims__</b> de la izquierda<br> para agregar al carrito de compras']"));
    public static final Target IMG_OTRO_PRODUCTOC = Target.the("seleccionar otro producto").located(By.xpath("//img[@src='https://m.media-amazon.com/images/W/WEBP_402378-T1/images/I/51q4tWLe+jL._AC_UL320_.jpg']"));
    public static final Target BTN_AGREGARCO = Target.the("agregar al carro de compras").located(By.xpath("//input[@data-hover='Seleccionar <b>__dims__</b> de la izquierda<br> para agregar al carrito de compras']"));
    public static final Target TXT_OFICINA = Target.the("seleccionar muebles para oficina").located(By.xpath("//span[text()='Muebles de Oficina para Hogar']"));
    public static final Target IMG_OFICINA = Target.the("seleccionar muebles ficina").located(By.xpath("//img[@src='https://m.media-amazon.com/images/W/WEBP_402378-T1/images/I/716tq9Y8WOL._AC_UL320_.jpg']"));
    public static final Target BTN_CANTIDADO = Target.the("seleccionar mueble ficina").located(By.id("a-autoid-0-announce"));
    public static final Target BTN_SELECCIONARO = Target.the("seleccionar 3 ").located(By.xpath("//a[@data-value='{'stringVal':'3'}']"));
    public static final Target BTN_AGREGARO = Target.the("agregar al carro de compras").located(By.xpath("//input[@data-hover='Seleccionar <b>__dims__</b> de la izquierda<br> para agregar al carrito de compras']"));
    public static final Target IMG_OTRO_PRODUCTOO = Target.the("seleccionar otro producto").located(By.xpath("//img[@src='https://m.media-amazon.com/images/W/WEBP_402378-T1/images/I/416m3TkqKdL._AC_UL320_.jpg']"));
    public static final Target BTN_AGREGAROFI = Target.the("agregar al carro de compras").located(By.xpath("//input[@data-hover='Seleccionar <b>__dims__</b> de la izquierda<br> para agregar al carrito de compras']"));
    public static final Target TXT_DECORATIVO = Target.the("seleccionar muebles decorativos").located(By.xpath("//span[text()='Muebles Decorativos']"));
    public static final Target IMG_DECORATIVO = Target.the("seleccionar muebles decorativos").located(By.xpath("//img[@src='https://m.media-amazon.com/images/W/WEBP_402378-T1/images/I/71D7VNMLFFL._AC_UL320_.jpg']"));
    public static final Target BTN_CANTIDADD = Target.the("seleccionar mueble decorativo").located(By.id("a-autoid-4-announce"));
    public static final Target BTN_SELECCIONARD = Target.the("seleccionar 3 ").located(By.xpath("//a[@data-value='{'stringVal':'3'}']"));
    public static final Target BTN_AGREGARD = Target.the("agregar al carro de compras").located(By.xpath("//input[@data-hover='Seleccionar <b>__dims__</b> de la izquierda<br> para agregar al carrito de compras']"));
    public static final Target IMG_OTRO_PRODUCTOD = Target.the("seleccionar otro producto").located(By.xpath("//img[@src='https://m.media-amazon.com/images/W/WEBP_402378-T1/images/I/716RUsUozWL._AC_UL320_.jpg']"));
    public static final Target BTN_AGREGARDE = Target.the("agregar al carro de compras").located(By.xpath("//input[@data-hover='Seleccionar <b>__dims__</b> de la izquierda<br> para agregar al carrito de compras']"));







}


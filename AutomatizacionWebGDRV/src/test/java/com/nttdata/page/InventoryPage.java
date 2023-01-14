package com.nttdata.page;

import org.openqa.selenium.By;

public class InventoryPage {
    public static By productsTitle = By.cssSelector("span.title");
    public static By itemsCards = By.cssSelector("div.inventory_item");
    public static By itemsCardsName = By.cssSelector("div.inventory_item_name");

    public static By addItems = By.id("add-to-cart-sauce-labs-bike-light");


}

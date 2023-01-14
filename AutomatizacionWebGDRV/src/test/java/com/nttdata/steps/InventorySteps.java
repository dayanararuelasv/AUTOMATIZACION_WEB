package com.nttdata.steps;
import com.nttdata.page.CartPage;
import com.nttdata.page.InventoryPage;
import com.nttdata.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InventorySteps {
    private WebDriver driver;
    //contrsuctor
    public InventorySteps(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Obtener el título de la pantalla de productos
     * @return el valor del título de la pantalla de productos
     */
    public String getTitle(){
        return this.driver.findElement(InventoryPage.productsTitle).getText();
    }

    /**
     * @return la cantidad de items
     */
    public int getItemSize(){
        List<WebElement> items = this.driver.findElements(InventoryPage.itemsCards);
        return items.size();
    }

    /**
     *@return nombre del item
     */
    public String getItemName(){
        return this.driver.findElement(InventoryPage.itemsCardsName).getText();
    }

    ///////////////////////
    public void addItemCart(){
        WebElement addItem = driver.findElement(InventoryPage.addItems);
        addItem.click();
    }


}



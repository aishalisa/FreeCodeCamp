package com.saurcedemo;

import org.openqa.selenium.By;

public class ProductsPage extends BasePage{

    protected By productsHeader = By.xpath(".//span[text()='Products']");

    public Boolean isProductsPage(){
        return findElement(productsHeader).isDisplayed();
    }
}

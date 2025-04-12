package com.saurcedemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoginTest extends BaseTest{

    @Test
    public void testLoginError(){
        loginPage.loginIntoApplication("standard_user", "12345");
        String actualMessage = loginPage.getErrorMessage();
        String expectedMessage = "Epic sadface: Username and password do not match any user in this service";
        assertEquals(expectedMessage, actualMessage);
        assertTrue(actualMessage.contains("Epic sadface"));
    }
    @Test
    public void testValidLogin(){
        ProductsPage productsPage = loginPage.loginIntoApplication("standard_user", "secret_sauce");
        Boolean isDisplayed = productsPage.isProductsPage();
        assertTrue(isDisplayed, "Product header is nor displayed");
    }

}

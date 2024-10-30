package org.pages;

import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Home1 {
    private WebDriver driver;
    private String url = "https://www.google.com/";
    private String title = "Google";
    private By searchBox = By.name("q");

    public Home1(WebDriver driver){
        this.driver = driver;
    }

    @Step("When I navigate to the Home page.")
    public Home1 navigate(){
        driver.navigate().to(url);
        return this;
    }

    @Step("Then the browser title should be 'Google'.")
    public Home1 verifyBrowserTitleIsCorrect(){
        driver.getTitle().contentEquals(title);
        return this;
    }

    @Step("And I search for '{query}'.")
    public void searchForQuery(String query){
        driver.findElement(searchBox).sendKeys(query);
    }
}

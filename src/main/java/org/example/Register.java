package org.example;

import org.openqa.selenium.By;

import static org.example.Utils.utils.*;

public class Register extends Utils {

    private By yourpersonaldetails = By.className("title");
    private By Gender = By.id("gender-female");
    private By firstName = By.id("FirstName");
    private By LastName = By.id("LastName");
    private By dayDropList = By.xpath("//div[@class='date-picker-wrapper']/select[1]");
    private By monthDropList = By.xpath("//select[@name='DateOfBirthMonth']");
    private By yearDropList = By.xpath("//select[@name='DateOfBirthYear']");
    String emailTimestamp = "Test" + timeStamp() + "@gmail.com";
    private By email = By.id("Email");
    private By Companyname = By.id("Company");
    private By password = By.id("Password");
    private By Confirmpassword = By.id("ConfirmPassword");
    private By Register = By.id("register-button");
    private By _logout = By.className("ico-logout");

    public void personalDetails() throws InterruptedException {
        System.out.println(getTextFromElement(yourpersonaldetails));
        Thread.sleep(4000);
        ClickOnElement(Gender);
        enterText(firstName, "Ilaben");
        enterText(LastName, "Desai");
        SelectByVisibleText(dayDropList, "8");
        SelectByVisibleText(monthDropList, "October");
        SelectByVisibleText(yearDropList, "1980");
        enterText(email, emailTimestamp);
        enterText(Companyname, "Dndpvtltd");
        enterText(password, "ila@1234");
        enterText(Confirmpassword, "ila@1234");
        enterText(Companyname, "Dndpvtltd");
        ClickOnElement(Register);

    }

    public void logOut() {
        ClickOnElement(_logout);
    }
}


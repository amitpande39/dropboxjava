package com.automatedtest.sample.dropbox;

import com.automatedtest.sample.basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropBox extends BasePage {
    private static final String DROPBOX_URL = "https://www.dropbox.com/register";
    //private static final String DROPBOX_URL = "https://onedrive.live.com/about/en-gb/signin/";

    @FindBy(css = ".dropbox-logo__link")
    private WebElement dropBoxLogo;

    @FindBy(linkText = "log in")
    private  WebElement loginLink;

    @FindBy(name = "login_email")
    private WebElement enterEmail;

    @FindBy(name = "login_password")
    private  WebElement password;

    @FindBy(className = "signin-text")
    private  WebElement signIn;

    @FindBy(name = "remember_me")
    private WebElement rememberMe;

    @FindBy(className = "uee-AppActionsView-SecondaryActionMenu-text-upload-file")
    private WebElement uploadDocument;

    DropBox() {
        PageFactory.initElements(driver, this);

    }

    void goToLoginPage() {
        driver.get(DROPBOX_URL);
        wait.forLoading(60);
        this.loginLink.click();
        this.wait.forElementToBeDisplayed(5, enterEmail, "email");

    }

    void enterCredentialAndLogin(String email, String password) {
        this.enterEmail.sendKeys(email);
        this.password.sendKeys(password);
        // this.rememberMe.click();
        this.signIn.click();
        wait.forLoading(60);
        this.wait.forElementToBeDisplayed(5, uploadDocument, "uploadDocument");
    }

}

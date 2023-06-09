package com.envision.actitime.pageobjects;

import com.envision.actitime.pageobjects.BasePage;
import com.envision.actitime.utility.CommonUtil;
import com.envision.actitime.utility.PropertyFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    public WebDriver driver;

    public LoginPage(WebDriver driver) {
       super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this); //@FindBy
    }

    @FindBy(name = "username")
    private WebElement usernameTextBox;

    @FindBy(name = "pwd")
    private WebElement passwordTextBox;

    @FindBy(id = "loginButton")
    private WebElement submitButton;

    @FindBy(xpath = "//td[@valign='top']/span[@class='errormsg']")
    private WebElement errorMessageText;

    public void enterUserName(String userNameInput) {
      usernameTextBox.sendKeys(userNameInput);
    }

    public void enterPassword(String passwordInput) {
        passwordTextBox.sendKeys(passwordInput);
    }

    public void clickLoginButton() {
        // WebElement submitButton = super.getElement("actitime.loginpage.submit_button");
        submitButton.click();
    }
    public void clickLogout() {
        String logoutLink = PropertyFileReader.getProperty("actitime.timetrackpage.logout_link");
        WebElement logout = getElement(logoutLink);
        logout.click();
    }




    public String getInvalidLoginErrorMessage() {
        return errorMessageText.getText();
    }

}

package pageobject;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class Login extends PageObject {
    @FindBy(xpath = "//a[@id='btn-make-appointment']")
    public WebElementFacade btnMakeAppointment;
    @FindBy(xpath = "//input[@name='username']")
    public WebElementFacade userNameTxt;
    @FindBy(xpath = "//input[@id='txt-password']")
    public WebElementFacade passwordTxt;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElementFacade btnLogin;

    public void clickMakeAppointment() {
        btnMakeAppointment.click();
    }

    public void enterCredencial(String userName, String password) {
        userNameTxt.sendKeys(userName);
        passwordTxt.sendKeys(password);
        btnLogin.click();
    }
}
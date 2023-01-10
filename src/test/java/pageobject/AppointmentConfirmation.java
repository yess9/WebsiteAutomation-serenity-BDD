package pageobject;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class AppointmentConfirmation extends PageObject {
    @FindBy(xpath = "//h2[text()='Appointment Confirmation']")
    public WebElementFacade lblMessageSuccessTxt;
    @FindBy(xpath = "//p[text()='Seoul CURA Healthcare Center']")
    public WebElementFacade recuperaFacility;
    @FindBy(xpath = "//p[text()='Yes']")
    public WebElementFacade recuperaApplyReadmission;
    @FindBy(xpath = "//p[text()='Medicaid']")
    public WebElementFacade recuperaHealthProgram;
    @FindBy(xpath = "//p[text()='09/01/2023']")
    public WebElementFacade recuperaVisitDate;
    @FindBy(xpath = "//p[text()='Sin comentario']")
    public WebElementFacade recuperaComment;


    public void validateInfoIngresada() {
        lblMessageSuccessTxt.withTimeoutOf(Duration.ofSeconds(20)).isEnabled();
        Assert.assertEquals(lblMessageSuccessTxt.getText(),"Appointment Confirmation");
        Assert.assertEquals(recuperaFacility.getText(),"Seoul CURA Healthcare Center");
        Assert.assertEquals(recuperaApplyReadmission.getText(),"Yes");
        Assert.assertEquals(recuperaHealthProgram.getText(),"Medicaid");
        Assert.assertEquals(recuperaVisitDate.getText(),"09/01/2023");
        Assert.assertEquals(recuperaComment.getText(),"Sin comentario");

    }

}
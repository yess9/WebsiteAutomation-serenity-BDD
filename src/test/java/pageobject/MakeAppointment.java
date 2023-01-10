package pageobject;

import actions.SelectOptions;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MakeAppointment extends PageObject {

    @FindBy(xpath = "//div[@class='col-sm-4']/select")
    public WebElementFacade selectFacility;
    @FindBy(xpath = "//select[@id='combo_facility']/option")
    public List<WebElementFacade> listFacility;
    @FindBy(xpath = "//label[@for='chk_hospotal_readmission']")
    public WebElementFacade checkApplyReadmission;
    @FindBy(xpath = "//div[@class='col-sm-4']")
    public WebElementFacade blockHealthProgram;
    @FindBy(xpath = "//div[@class='col-sm-4']/label")
    public List<WebElementFacade> listHealthProgram;
    @FindBy(xpath = "//input[@id='txt_visit_date']")
    public WebElementFacade visitDateTxt;
    @FindBy(xpath = "//textarea[@id='txt_comment']")
    public WebElementFacade comment;
    @FindBy(xpath = "//button[@id='btn-book-appointment']")
    public WebElementFacade btnBookAppointment;

    public void enterInfoFormAppointment(String facility, String apply, String healthcareProgram, String visitDate, String comentario) {
        selectFacility.selectByValue(facility);

        element(blockHealthProgram).waitUntilVisible();
        if (apply.contentEquals("Yes"))
            SelectOptions.select(checkApplyReadmission);
        SelectOptions.in(listHealthProgram, healthcareProgram);
        visitDateTxt.sendKeys(visitDate);
        comment.sendKeys(comentario);
    }
}
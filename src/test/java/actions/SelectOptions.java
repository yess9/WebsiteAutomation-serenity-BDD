package actions;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

import static net.serenitybdd.core.Serenity.getDriver;

public class SelectOptions {
    public static void in(List<WebElementFacade> elements, String value) {
        for (WebElement element : elements) {
            if (element.getText().contentEquals(value)) {
                JavascriptExecutor js = (JavascriptExecutor) getDriver();
                js.executeScript("arguments[0].click();", element);
                break;
            }
        }
    }
    public static void select(WebElementFacade element) {
                JavascriptExecutor js = (JavascriptExecutor) getDriver();
                js.executeScript("arguments[0].click();", element);
    }
}

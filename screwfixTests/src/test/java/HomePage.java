import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.switchTo;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends OpeningPage {

    private SelenideElement searchField = $x("//input[@id='mainSearch-input']");
    private SelenideElement acceptCookiesButton = $x(
            "//a[@role='button' and text()='Accept Cookies']");
    private SelenideElement accountHeader = $x("//a[@id='header_my_account_link']");
    private SelenideElement paymentCardsField = $(byText("Payment Cards"));
    public void searchProduct() {
        searchField.waitUntil(Condition.visible, 60000).click();
        searchField.waitUntil(Condition.visible, 60000).setValue("91024").pressEnter();
    }

    public void verifyTitle() {
        acceptCookiesButton.waitUntil(Condition.visible, 20000);

    }

    public void clickAcceptCookiesButton() {
        switchTo().frame(0);
        acceptCookiesButton.click();
    }

    public void clickAccountHeader() {
        accountHeader.waitUntil(Condition.visible, 60000).click();
    }
    public void clickPaymentCardsField() {
        paymentCardsField.click();
    }
}

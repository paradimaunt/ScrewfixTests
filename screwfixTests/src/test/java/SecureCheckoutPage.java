import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.switchTo;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SecureCheckoutPage {

    private SelenideElement deliveryAddress = $(By.xpath("//a[@class='btn btn--addr fill text-left']"));
    private List<SelenideElement> listsDates = $$x("//div[@class='lg-3 md-6 sm-12 cols']");
    private SelenideElement deliveryOptionsForThisDayButton = $x("//button[@id='deliveryServiceTile_3']");
    private SelenideElement payWithCardRadioButton = $x("//span[@class='h3']");
    private SelenideElement typeCardVisaButton = $x("//button[@data-value='visa']");
    private SelenideElement nameOnCardField = $x("//input[@id='new-card-name']");
    private SelenideElement cardNumberField = $x("//input[@id='new-card-number']");
    private SelenideElement monthExpireDateDropdown = $x("//select[@id='new-card-month']");
    private SelenideElement chooseMonth = $x("//option[@value='09']");
    private SelenideElement yearExpireDateDropdown = $x("//select[@id='new-card-year']");
    private SelenideElement chooseYear= $x("//option[@value='24']");
    private SelenideElement securityCodeField= $x("//input[@id='cvvNumber']");
    private SelenideElement billingAddress= $x("//a[@data-value='address1']");
    private SelenideElement checkboxSaveCard= $(byText("Save these card details for future use"));
    private List<SelenideElement> listContinueButton = $$x("//button[@type='submit']");
    private SelenideElement logoScrewFix= $x("//div[@class='logo']");


    public void clickDeliveryAddress() {
        deliveryAddress.waitUntil(Condition.visible, 60000).click();
    }
    public void chooseTomorrowDate(){
        listsDates.get(0).waitUntil(Condition.visible, 60000).click();
    }
    public void clickDeliveryOptionsForThisDayButton() {
        deliveryOptionsForThisDayButton.waitUntil(Condition.visible, 60000).click();
    }
    public void clickPayWithCardRadioButton() {
       payWithCardRadioButton.waitUntil(Condition.visible, 60000).click();
    }
    public void clickTypeCardVisaButton() {
        typeCardVisaButton.waitUntil(Condition.visible, 60000).click();
    }
    public void inputNameOnCardField() {
        switchTo().frame(1);
        nameOnCardField.setValue("Visa");
    }
    public void inputCardNumberField() {
        cardNumberField.setValue("4111 1111 1111 1111");
    }
    public void clickExpireDateDropdown() {
        monthExpireDateDropdown.click();
    }
    public void clickChooseMonth() {
        chooseMonth.click();
    }
    public void clickYearExpireDateDropdown() {
        monthExpireDateDropdown.click();
    }
    public void clickChooseYear() {
        chooseYear.click();
    }
    public void inputSecurityCode() {
        switchTo().defaultContent();
        securityCodeField.setValue("512");
    }
    public void clickBillingAddress() {
        billingAddress.click();
    }
    public void clickCheckboxSaveCard() {
        if(!checkboxSaveCard.isSelected()){
            checkboxSaveCard.waitUntil(Condition.visible, 60000).click();
        }
    }
    public void clickFirstContinueButton() {
        listContinueButton.get(1).waitUntil(Condition.visible, 60000).click();
    }
    public void clickSecondContinueButton() {
        listContinueButton.get(0).waitUntil(Condition.visible, 60000).click();
    }
    public void clickLogoScrewFix() {
        logoScrewFix.waitUntil(Condition.visible, 60000).click();
    }

}

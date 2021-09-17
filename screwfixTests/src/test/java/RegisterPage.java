import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import java.util.Random;
import org.openqa.selenium.By;

public class RegisterPage {

    private SelenideElement registerButton = $x("//button[@value='Register now']");
    private SelenideElement registerField = $x("//input[@id='email-input']");
    private SelenideElement continueButton = $(By.xpath("//button[@id='continueRegistrationButton']"));
    private SelenideElement titleDropdown = $x("//select[@id='newTitle']");
    private SelenideElement chooseMrInDropdown = $x(" //option[@value='Mr']");
    private SelenideElement firstNameField = $x("//input[@id='firstName']");
    private SelenideElement lastNameField = $x("//input[@id='lastName']");
    private SelenideElement professionDropdown = $x("//select[@id='profession']");
    private SelenideElement chooseDiyInDropdown = $x("//option[@value='11']");
    private SelenideElement postcodeField = $x("//input[@id='contact-search-postcode']");
    private SelenideElement findAddressButton = $x("//button[@data-value='find address']");
    private SelenideElement addressSearchResultDropdown = $x("//select[@id='contact-address-result-select']");
    private SelenideElement chooseCetsatLtdInDropdown = $x("//option[@id='ADDRESS_0']");
    private SelenideElement passwordField = $x("//input[@id='password']");
    private SelenideElement reTypePasswordField = $x("//input[@id='retypePassword']");
    private SelenideElement registerNowButton = $x("//button[@id='registerNowButton']");
    private SelenideElement continueShoppingButton = $x("//a[@title='Continue shopping']");
    private SelenideElement registerComplete = $x("//span[@class='h1']");
    public void clickRegisterButton() {
        registerButton.click();
    }

    public void inputRegisterEmail() {
        Random random = new Random();
        int m = random.nextInt(100000) + 1;
        String email = "paradimaund" + m + "@yopmail.com";
        registerField.setValue(email);

    }

    public void clickContinueButton() {
        continueButton.click();
    }

    public void clickOnTitleDropdownMrField() {
        titleDropdown.click();
        chooseMrInDropdown.click();
    }

    public void inputRandomFirstName() {
        firstNameField.setValue("Dima");
    }

    public void inputRandomLastName() {
        lastNameField.setValue("Murza");
    }

    public void clickOnProfessionDropdownAndChooseDiyField() {
        professionDropdown.click();
        chooseDiyInDropdown.click();
    }

    public void inputPostcode() {
        postcodeField.setValue("BA22 8RT");
    }

    public void clickFindAddressButton() {
        findAddressButton.click();
    }

    public void clickAddressSearchResultDropdownAndChooseCetsatLtdField() {
        addressSearchResultDropdown.click();
        chooseCetsatLtdInDropdown.click();

    }
    public void inputPasswordField() {
        passwordField.setValue("12345678");
    }
    public void inputReTypePasswordField() {
        reTypePasswordField.setValue("12345678");
    }
    public void clickRegisterNowButton() {
        registerNowButton.doubleClick();
    }

    public void clickContinueShoppingButton() {
       continueShoppingButton.click();
    }


    public boolean registerCompleteText() {
        registerComplete.waitUntil(Condition.visible, 60000).shouldHave(text("Thank you"));
        return true;
    }
}

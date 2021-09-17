import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import java.util.Random;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Tests extends OpeningPage {

    @Test
    public void searchProduct() {
        openURL();
        HomePage homePage = new HomePage();
        ProductPage productPage = new ProductPage();
        homePage.clickAcceptCookiesButton();
        homePage.searchProduct();
        Assert.assertTrue(productPage.getProductDescription());
    }

    @Test
    public void addItemToCart() {
        Configuration.startMaximized = true;
        open("https://www.screwfix.com/login/");
        HomePage homePage = new HomePage();
        ProductPage productPage = new ProductPage();
        RegisterPage registerPage = new RegisterPage();
        SecureCheckoutPage secureCheckoutPage = new SecureCheckoutPage();
        PaymentCardsPage paymentCardsPage = new PaymentCardsPage();
        homePage.clickAcceptCookiesButton();
        registerPage.clickRegisterButton();
        registerPage.inputRegisterEmail();
        registerPage.clickContinueButton();
        registerPage.clickOnTitleDropdownMrField();
        registerPage.inputRandomFirstName();
        registerPage.inputRandomLastName();
        registerPage.clickOnProfessionDropdownAndChooseDiyField();
        registerPage.inputPostcode();
        registerPage.clickFindAddressButton();
        registerPage.clickAddressSearchResultDropdownAndChooseCetsatLtdField();
        registerPage.inputPasswordField();
        registerPage.inputReTypePasswordField();
        registerPage.clickRegisterNowButton();
        Assert.assertTrue(registerPage.registerCompleteText());
        registerPage.clickContinueShoppingButton();
        homePage.searchProduct();
        Assert.assertTrue(productPage.getProductDescription());
        productPage.clickDeliverButton();
        productPage.clickCheckoutNowButton();
        productPage.clickContinueToPayment();
        secureCheckoutPage.clickDeliveryAddress();
        secureCheckoutPage.chooseTomorrowDate();
        secureCheckoutPage.clickDeliveryOptionsForThisDayButton();
        secureCheckoutPage.clickPayWithCardRadioButton();
        secureCheckoutPage.clickTypeCardVisaButton();
        secureCheckoutPage.inputNameOnCardField();
        secureCheckoutPage.inputCardNumberField();
        secureCheckoutPage.clickExpireDateDropdown();
        secureCheckoutPage.clickChooseMonth();
        secureCheckoutPage.clickYearExpireDateDropdown();
        secureCheckoutPage.clickChooseYear();
        secureCheckoutPage.inputSecurityCode();
        secureCheckoutPage.clickBillingAddress();
        secureCheckoutPage.clickCheckboxSaveCard();
        secureCheckoutPage.clickFirstContinueButton();
        secureCheckoutPage.clickSecondContinueButton();
        secureCheckoutPage.clickLogoScrewFix();
        homePage.clickAccountHeader();
        homePage.clickPaymentCardsField();
        Assert.assertTrue(paymentCardsPage.numberCardCheck());
    }
}

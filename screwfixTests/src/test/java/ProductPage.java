import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class ProductPage extends OpeningPage {

    private SelenideElement productDescription = $x("//h1[@id='product_description']");
    private SelenideElement deliverButton = $x("//button[@id='product_add_to_trolley_image']");
    private SelenideElement checkoutNowButton = $x("//button[@id='checkout_now_btn']");
    private SelenideElement continueToPayment = $x("//button[@id='topCheckoutButton']");

    public boolean getProductDescription() {
        productDescription.shouldHave(text("Bath Waste with Plug & Chain 16\""));
        return true;
    }
    public void clickDeliverButton(){
        deliverButton.click();
    }
    public void clickCheckoutNowButton(){
        checkoutNowButton.click();
    }
    public void clickContinueToPayment(){
        continueToPayment.click();
    }

}


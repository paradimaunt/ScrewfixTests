import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.SelenideElement;

public class PaymentCardsPage {

    private SelenideElement numberCard = $x("//span[@class='btn-saved-card__card-number']");

    public boolean numberCardCheck() {
        numberCard.shouldHave(text("1111"));
        return true;
    }
}

import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Configuration;


public class OpeningPage {

    public void openURL() {
        Configuration.startMaximized = true;
        open("https://www.screwfix.com/");
    }
}

package pageobjects.components;

import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
//import static com.codeborne.selenide.appium.AppiumClickOptions.longPress;

public class UniversalActionsComponent {
    private static final String
            UNIVERSAL_TEXT_LOCATOR_TPL = "//*[@text = '{SUBSTRING}']";

    private static String getUniversalLocatorSubstring(String substring) {
        return UNIVERSAL_TEXT_LOCATOR_TPL.replace("{SUBSTRING}", substring);
    }

    public void clickByUniversalTplItem(String item){
        $(AppiumBy.xpath(getUniversalLocatorSubstring(item))).click();
    }

    public void verifyItemShouldBeEnabledByUniversalTpl(String item){
        $(AppiumBy.xpath(getUniversalLocatorSubstring(item))).shouldBe(enabled);
    }

    public void verifyItemShouldNotExistByUniversalTpl(String item){
        $(AppiumBy.xpath(getUniversalLocatorSubstring(item))).shouldNot(exist);
    }

    public void longPressByUniversalTpl(String item){
        //$(AppiumBy.xpath(getUniversalLocatorSubstring(item))).click(longPress());
    }
}

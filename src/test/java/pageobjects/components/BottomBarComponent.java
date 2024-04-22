package pageobjects.components;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class BottomBarComponent {
    private static final SelenideElement
        barItem = $(AppiumBy.id("org.wikipedia.alpha:id/navigation_bar_item_small_label_view"));

    public BottomBarComponent openNeededBarItem(String itemTitle){
        barItem.shouldHave(text(itemTitle)).click();

        return this;
    }

    public String getNeededActiveBarItemState(String itemTitle, String attribute){
        return $(AppiumBy.id("org.wikipedia.alpha:id/navigation_bar_item_large_label_view"))
                .shouldHave(text(itemTitle)).getAttribute(attribute);
    }
}
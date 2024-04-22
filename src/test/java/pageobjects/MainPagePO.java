package pageobjects;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.appium.SelenideAppium.$;

public class MainPagePO {
    private static final SelenideElement
            articleBlockTitle = $(AppiumBy.id("org.wikipedia.alpha:id/footerActionButton"));

    public MainPagePO openFirstFoundArticleByScrollingAndVerifyItOpens(){
        articleBlockTitle.scrollTo().click();

        return this;
    }
}
package pageobjects;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;

public class ArticlePO {
    private static final SelenideElement
        articleHeaderImage = $(AppiumBy.id("org.wikipedia.alpha:id/view_page_header_image")),
        articleBlockContainer = $(AppiumBy.id("org.wikipedia.alpha:id/page_web_view"));

    public ArticlePO verifyArticlePageOpens(){
        articleHeaderImage.shouldBe(enabled);

        return this;
    }

    public ArticlePO verifyArticleBlockOpens(){
        articleBlockContainer.shouldBe(enabled);

        return this;
    }
}
package pageobjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchPO {
    private static final SelenideElement
        searchField = $(AppiumBy.accessibilityId("Search Wikipedia")),
        searchFieldAfterClick = $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text"));

    private static final ElementsCollection
            searchFoundItemList = $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"));

    public SearchPO enterValueIntoSearchField(String value){
        searchField.click();
        searchFieldAfterClick.sendKeys(value);

        return this;
    }

    public SearchPO verifyAmountOfFoundItemsInSearchList(int value){
        searchFoundItemList.shouldHave(sizeGreaterThan(value));

        return this;
    }

    public SearchPO selectNeededArticleInSearchFoundList(int itemOrder){
        searchFoundItemList.get(itemOrder).click();

        return this;
    }
}
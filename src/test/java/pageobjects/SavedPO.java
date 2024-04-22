package pageobjects;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import pageobjects.components.BottomBarComponent;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SavedPO {
    BottomBarComponent bottomBarComponent = new BottomBarComponent();
    private static final SelenideElement
        moreOptions = $(AppiumBy.accessibilityId("More options")),
        moreOptionsContainer = $(AppiumBy.id("org.wikipedia.alpha:id/reading_lists_overflow_card_container")),
        moreOptionsCreateNewListItem = $(AppiumBy.id("org.wikipedia.alpha:id/reading_lists_overflow_create_new_list")),
        moreOptionsCreateNewListFrame = $(AppiumBy.id("org.wikipedia.alpha:id/action_bar_root")),
        moreOptionsListTitleInputField = $(AppiumBy.id("org.wikipedia.alpha:id/text_input")),
        moreOptionsNewListCreateOKButton = $(AppiumBy.id("android:id/button1")),
        listItemTitle = $(AppiumBy.id("org.wikipedia.alpha:id/item_title"));

    public SavedPO openSavedPage(){
        bottomBarComponent.openNeededBarItem("Saved");

        return this;
    }

    public String getSavedActiveBarItemNeededAttrState(String attribute){
        return bottomBarComponent.getNeededActiveBarItemState("Saved", attribute);
    }

    public SavedPO openMoreOptionsFrameAndVerifyItOpens(){
        moreOptions.click();
        moreOptionsContainer.shouldBe(enabled);

        return this;
    }

    public SavedPO clickOnOpenNewListItemAndVerifyItOpens(){
        moreOptionsCreateNewListItem.click();
        moreOptionsCreateNewListFrame.shouldBe(enabled);

        return this;
    }

    public SavedPO enterListTitleAndClickOnOK(String listTitle){
        moreOptionsListTitleInputField.sendKeys(listTitle);
        moreOptionsNewListCreateOKButton.click();

        return this;
    }

    public SavedPO verifyCreatedListIsDisplayed(String listTitle){
        listItemTitle.shouldHave(text(listTitle));

        return this;
    }
}
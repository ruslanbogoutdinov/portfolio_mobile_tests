package pageobjects;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import pageobjects.components.UniversalActionsComponent;

import static com.codeborne.selenide.Selenide.$;

public class SettingsPO {
    UniversalActionsComponent universalActionsComponent = new UniversalActionsComponent();
    private static final SelenideElement
        settingsButtonInMoreFrame = $(AppiumBy.id("org.wikipedia.alpha:id/main_drawer_settings_container")),
        backButton = $(AppiumBy.accessibilityId("Navigate up")),
        deleteButton = $(AppiumBy.id("org.wikipedia.alpha:id/menu_delete_selected"));

    public SettingsPO openSettingsPage(){
        settingsButtonInMoreFrame.click();

        return this;
    }

    public SettingsPO openAddLanguagePage(){
        universalActionsComponent.clickByUniversalTplItem("Wikipedia languages");
        universalActionsComponent.clickByUniversalTplItem("Add language");

        return this;
    }

    public SettingsPO chooseNeededLanguageAndVerifyItsChosen(String firstLanguage, String secondLanguage){
        universalActionsComponent.clickByUniversalTplItem(firstLanguage);
        universalActionsComponent.verifyItemShouldBeEnabledByUniversalTpl(secondLanguage);

        return this;
    }

    public SettingsPO verifyChosenLanguageIsDisplayedOnSettingsPage(String languages){
        backButton.click();
        universalActionsComponent.verifyItemShouldBeEnabledByUniversalTpl(languages);

        return this;
    }

    public SettingsPO chooseNeededLanguage(String language){
        universalActionsComponent.clickByUniversalTplItem(language);

        return this;
    }

    public SettingsPO longPressOnNeededLanguageItem(String language){
        universalActionsComponent.longPressByUniversalTpl(language);

        return this;
    }

    public SettingsPO deleteNeededLanguageByClickingOnBinButton(String language){
        deleteButton.click();
        universalActionsComponent.clickByUniversalTplItem("OK");
        universalActionsComponent.verifyItemShouldNotExistByUniversalTpl(language);

        return this;
    }
}

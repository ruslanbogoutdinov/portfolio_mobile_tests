package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.annotations.Layer;

import static io.qameta.allure.Allure.step;

@Layer("mobile tests")
@Feature("Настройки")
public class SettingsTests extends TestBase{
    private static final String languageItemOnRussian = "Русский",
            languageItemOnEnglish = "Russian",
            languagesAfterAddingRussian = "English, русский";

    @Test
    @Story("Добавление языка")
    @Owner("ruslanbogoutdinov")
    @Severity(SeverityLevel.MINOR)
    @DisplayName("Добавление нового языка в набор языков")
    void addLanguageTest() {
        step("Открываем фрейм 'Ещё'", () -> {
            moreFramePO.openMoreFrame();
        });

        step("Кликаем по кнопке настроек", () -> {
            settingsPO.openSettingsPage();
        });

        step("Открываем раздел с выбором языка и кликаем по кнопке добавления языка", () -> {
            settingsPO.openAddLanguagePage();
        });

        step("Выбираем русский язык и проверяем что язык выбрался", () -> {
            settingsPO.chooseNeededLanguageAndVerifyItsChosen(languageItemOnRussian, languageItemOnEnglish);
        });

        step("Возвращаемся назад и проверяем что выбранный язык отображается в разделе настроек", () -> {
            settingsPO.verifyChosenLanguageIsDisplayedOnSettingsPage(languagesAfterAddingRussian);
        });
    }

    @Test
    @Story("Настройка ленты")
    @Owner("ruslanbogoutdinov")
    @Severity(SeverityLevel.MINOR)
    @DisplayName("Удаление выбранного языка при помощи лонг-тапа")
    void deleteAddedLanguageWithLongTap() {
        step("Добавляем язык и совершаем лонг-тап для подготовки к удалению", () -> {
            moreFramePO.openMoreFrame();
            settingsPO.openSettingsPage()
                    .openAddLanguagePage()
                    .chooseNeededLanguage(languageItemOnRussian);
                    //.longPressOnNeededLanguageItem(languageItemOnEnglish);
        });

        step("Удаляем ранее добавленный язык", () -> {
            settingsPO.openMoreOptionsFrame()
                    .selectNeededItemInMoreOptionsMenu("Remove language")
                    .selectRecentAddedLanguageCheckbox()
                    .deleteNeededLanguageByClickingOnBinButton(languageItemOnEnglish);
        });
    }
}
package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.annotations.Layer;

import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

@Layer("mobile tests")
@Feature("Раздел с сохраненными статьями")
public class SavedTests extends BaseTest {
    public String savedNavButtonState;
    public static final String listTitle = "My first saved list";
    @Test
    @Story("Открытие раздела со статьями")
    @Owner("ruslanbogoutdinov")
    @Severity(SeverityLevel.MINOR)
    @DisplayName("Проверка на корректное открытие раздела 'Saved' в нижнем боттом баре")
    void successfullyOpenSavedSection() {
        step("Открываем раздел 'Saved' и проверяем на корректное открытие данного раздела", () -> {
            savedPO.openSavedPage();
            savedNavButtonState = savedPO.getSavedActiveBarItemNeededAttrState("selected");

            assertThat(savedNavButtonState).isEqualTo("true");
        });
    }

    @Test
    @Story("Создание статьи")
    @Owner("ruslanbogoutdinov")
    @Severity(SeverityLevel.MINOR)
    @DisplayName("Создание нового списка с сохраненными статьями")
    void createNewSavedList() {
        step("Открываем раздел 'Saved'", () ->
            savedPO.openSavedPage()
        );

        step("Кликаем по троеточию в верхнем углу и проверяем на корректное открытие меню", () ->
            savedPO.openMoreOptionsFrameAndVerifyItOpens()
        );

        step("Кликаем по кнопке создания нового списка и проверяем открытие окошка для создания списка", () ->
            savedPO.clickOnOpenNewListItemAndVerifyItOpens()
        );

        step("Вводим корректное название для списка и кликаем по кнопке 'ОК'", () ->
            savedPO.enterListTitleAndClickOnOK(listTitle)
        );

        step("Проверяем отображается ли ранее созданный список", () ->
            savedPO.verifyCreatedListIsDisplayed(listTitle)
        );
    }
}
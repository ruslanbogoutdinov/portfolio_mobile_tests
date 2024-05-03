package tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.annotations.Manual;

public class ManualTests {
    @Test
    @Manual
    @AllureId("31963")
    @DisplayName("Смена темы")
    @Story("Тема оформления")
    @Owner("allure8")
    @Feature("Настройки")
    void changeThemeTest(){

    }

    @Test
    @Manual
    @AllureId("31964")
    @DisplayName("Смена шрифта")
    @Story("Тема оформления")
    @Owner("allure8")
    @Feature("Настройки")
    void changeFontTest(){

    }
}

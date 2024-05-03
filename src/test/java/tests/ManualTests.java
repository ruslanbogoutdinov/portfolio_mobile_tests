package tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.annotations.Manual;

import static io.qameta.allure.Allure.step;

public class ManualTests {
    @Test
    @Manual
    @AllureId("31963")
    @DisplayName("Смена темы")
    @Story("Тема оформления")
    @Owner("allure8")
    @Feature("Настройки")
    void changeThemeTest(){
        step("Открыть окно настроек приложения и кликнуть по кнопке 'App theme'", () ->{
            step("Открывается окно настроек оформления приложения");
        });
        step("Выбрать тему для смены", () ->{
            step("Тема выбирается корреткно");
        });
        step("Закрыть окно настроек оформления приложения", () ->{
            step("Окно настроек оформления приложения закрывается и выбранная тема применяется корректно");
        });
    }

    @Test
    @Manual
    @AllureId("31964")
    @DisplayName("Смена шрифта")
    @Story("Тема оформления")
    @Owner("allure8")
    @Feature("Настройки")
    void changeFontTest(){
        step("Открыть окно настроек приложения и кликнуть по кнопке 'App theme'", () ->{
            step("Открывается окно настроек оформления приложения");
        });
        step("При помощи ползунка выбрать нужный размер текста", () ->{
            step("Размер шрифта выбирается корреткно");
        });
        step("Закрыть окно настроек оформления приложения", () ->{
            step("Окно настроек оформления приложения закрывается и выбранный размер шрифта применяется корректно");
        });
    }
}

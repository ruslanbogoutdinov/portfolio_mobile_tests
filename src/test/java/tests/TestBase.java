package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import drivers.BrowserstackDriver;
import drivers.LocalMobileDriver;
import helpers.Attach;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pageobjects.ArticlePO;
import pageobjects.MainPagePO;
import pageobjects.SavedPO;
import pageobjects.SearchPO;


import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class TestBase {
    public static String deviceHost = System.getProperty("deviceHost");
    MainPagePO mainPagePO = new MainPagePO();
    SearchPO searchPO = new SearchPO();
    ArticlePO articlePO = new ArticlePO();
    SavedPO savedPO = new SavedPO();

    @BeforeAll
    static void setUp() {
        Configuration.browserSize = null;

        switch (deviceHost) {
//            case "browserstack" -> Configuration.browser = BrowserstackDriver.class.getName();
//            case "emulation", "real" -> Configuration.browser = LocalMobileDriver.class.getName();
            case "browserstack":
                Configuration.browser = BrowserstackDriver.class.getName();
            case "emulation":
                Configuration.browser = LocalMobileDriver.class.getName();
            case "real":
                Configuration.browser = LocalMobileDriver.class.getName();
            default:
                return;
        }
    }

    @BeforeEach
    void beforeEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open();
        step("Пропуск дефолтного окна приложения", () ->
                $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_skip_button")).click()
        );
    }

    @AfterEach
    void afterEach() {
        if(deviceHost.equals("browserstack")){
            String sessionId = sessionId().toString();
            Attach.addVideo(sessionId);
        }else {
            Attach.screenshotAs("Last screenshot");
        }
        Attach.pageSource();
        closeWebDriver();
    }
}

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
import pageobjects.*;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class TestBase {
    public static String deviceHost = System.getProperty("deviceHost");
    SearchPO searchPO = new SearchPO();
    ArticlePO articlePO = new ArticlePO();
    SavedPO savedPO = new SavedPO();
    MoreFramePO moreFramePO = new MoreFramePO();
    SettingsPO settingsPO = new SettingsPO();

    @BeforeAll
    static void beforeAll() {
        switch (deviceHost) {
            case "browserstack":
                Configuration.browser = BrowserstackDriver.class.getName();
                break;
            case "emulation":
            case "real":
                Configuration.browser = LocalMobileDriver.class.getName();
                break;
        }
        Configuration.browserSize = null;
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
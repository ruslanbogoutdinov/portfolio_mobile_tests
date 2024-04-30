package tests;

import com.codeborne.selenide.WebDriverRunner;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.HashMap;
import java.util.Map;

@Disabled
public class ScrollTests extends TestBase {
    @Test
    void scrollTest() {
        appiumScroll();
    }

    public void appiumScroll(){
        WebElement element = WebDriverRunner.getWebDriver()
                .findElement(By.xpath("//android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView"));

        JavascriptExecutor js = (JavascriptExecutor) WebDriverRunner.getWebDriver();
        Map<String, Object> params = new HashMap<>();

        params.put("elementId", ((RemoteWebElement) element).getId());
        params.put("direction", "down");
        params.put("percent", 1.0);

        js.executeScript("mobile: scrollGesture", params);
    }
}

package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.BrowserstackConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;

public class BrowserstackDriver implements WebDriverProvider {
    private final BrowserstackConfig browserstackConfig;

    public BrowserstackDriver() {
        this.browserstackConfig = ConfigFactory.create(BrowserstackConfig.class, System.getProperties());
    }

    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        MutableCapabilities mutableCapabilities = new MutableCapabilities();
        mutableCapabilities.merge(capabilities);

        mutableCapabilities.setCapability("browserstack.user", browserstackConfig.getBrowserstackUser());
        mutableCapabilities.setCapability("browserstack.key", browserstackConfig.getBrowserstackKey());

        mutableCapabilities.setCapability("app", browserstackConfig.getApp());

        mutableCapabilities.setCapability("device", browserstackConfig.getDevice());
        mutableCapabilities.setCapability("os_version", browserstackConfig.getOSVersion());

        mutableCapabilities.setCapability("project", browserstackConfig.getProjectName());
        mutableCapabilities.setCapability("build", browserstackConfig.getBuildName());
        mutableCapabilities.setCapability("name", browserstackConfig.getName());

        try {
            return new RemoteWebDriver(
                    new URL(browserstackConfig.getRemoteURL()), mutableCapabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}

package config;

import org.aeonbits.owner.Config;

public interface BrowserstackConfig extends Config {
    @Key("browserstack.user")
    @DefaultValue("ENTER_YOUR_BROWSERSTACK_USER")
    String getBrowserstackUser();

    @Key("browserstack.key")
    @DefaultValue("ENTER_YOUR_BROWSERSTACK_KEY")
    String getBrowserstackKey();

    @Key("remoteURL")
    @DefaultValue("http://hub.browserstack.com/wd/hub")
    String getRemoteURL();

    @Key("app")
    @DefaultValue("bs://9a6a48e07cf396b809d75d09c38deca17c368cfc")
    String getApp();

    @Key("device")
    @DefaultValue("Samsung Galaxy S22 Ultra")
    String getDevice();

    @Key("os_version")
    @DefaultValue("12.0")
    String getOSVersion();

    @Key("project")
    @DefaultValue("BrowserStack Java Project")
    String getProjectName();

    @Key("build")
    @DefaultValue("browserstack-build-1")
    String getBuildName();

    @Key("name")
    @DefaultValue("simple_test")
    String getName();
}

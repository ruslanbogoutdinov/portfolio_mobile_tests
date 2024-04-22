package config;

import org.aeonbits.owner.Config;

public interface LocalMobileConfig extends Config {
    @Key("device")
    @DefaultValue("Google Pixel 3")
    String getDeviceName();

    @Key("os_version")
    @DefaultValue("9.0")
    String getOSVersion();
}

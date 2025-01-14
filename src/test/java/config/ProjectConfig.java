package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/driver.properties",
})
public interface ProjectConfig extends Config {
    @DefaultValue("chrome")
    String browser();

    String remoteWebDriverUrl();

    String remoteWebDriverUser();

    String remoteWebDriverPassword();

    String videoStorage();
}

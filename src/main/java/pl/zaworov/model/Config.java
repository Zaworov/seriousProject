package pl.zaworov.model;

import jakarta.enterprise.inject.Produces;
import pl.zaworov.qualifiers.FileName;

import java.io.IOException;
import java.util.Properties;

public class Config {

    public static final String CONFIG_FILE = "/config.properties";

    @Produces
    @FileName
    public String getFileName() {
        Properties config = new Properties();
        try {
            config.load(getClass().getResourceAsStream(CONFIG_FILE));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return config.getProperty("fileName");
    }
}

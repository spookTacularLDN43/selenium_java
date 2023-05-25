package utilities;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

    Properties properties;

    public ReadConfig() {
        File src = new File("./src/main/resources/config.properties");
        try {
            FileInputStream fis = new FileInputStream(src);
            properties = new Properties();
            properties.load(fis);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getApplicationUrl() {
        String url = properties.getProperty("baseURL");
        return url;
    }

    public String getUserName() {
        String username = properties.getProperty("userName");
        return username;
    }

    public String getPassword() {
        String pass = properties.getProperty("password");
        return pass;
    }
}

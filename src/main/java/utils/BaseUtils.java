package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseUtils {

    String configPath = "config/api-config.properties";
    Properties properties = new Properties();

    public BaseUtils()
    {
        FileInputStream reader = null;
        try {
            reader = new FileInputStream(configPath);
            try {
                properties.load(reader);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        ;
    }

    public String getBaseUrl()
    {
        String baseUrl = properties.getProperty("url");
        if (baseUrl!=null)
        {
            return baseUrl;
        }
        else throw new RuntimeException("baseUrl is not defined in api-config properties file");
    }
}

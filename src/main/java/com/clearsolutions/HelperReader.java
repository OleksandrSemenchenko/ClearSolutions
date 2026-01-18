package com.clearsolutions;

import java.io.InputStream;
import java.util.Properties;

import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;

public class HelperReader {
    private static Properties properties;

    private HelperReader() {
//      this.properties = new Properties();
    }

    public static void loadProperties(String fileName) {
      try  {
        InputStream rootPath = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
        InputStream in = HelperReader.class.getClassLoader().getResourceAsStream(fileName);
        properties = new Properties();
        properties.load(in);

      } catch (Exception e) {
        throw new RuntimeException("Failed to load properties", e);
      }
    }

    public static String getProperty(String key) {
      return properties.getProperty(key);
    }

}

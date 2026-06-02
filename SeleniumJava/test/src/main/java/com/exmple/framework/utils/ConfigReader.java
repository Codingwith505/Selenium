package com.exmple.framework.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	
	
	
	private static Properties props = new Properties();

    public static void loadConfig() throws IOException {
        FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
        props.load(fis);
    }

    public static String get(String key) {
        return props.getProperty(key);
    }

}

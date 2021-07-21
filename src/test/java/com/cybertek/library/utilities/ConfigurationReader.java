package com.cybertek.library.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    //1. create properties object
    private static Properties properties = new Properties();

    static {

        //2. load the file into FileInputStream
        try {
            FileInputStream file = new FileInputStream("configuration.properties");

            //3. load properties object with the file (configuration.properties)
            properties.load(file);

        } catch (IOException e) {
            System.out.println("File not found in configuration.properties");
        }
    }


    public static String getProperty(String keyWord) {
        return properties.getProperty(keyWord);
    }


}

package com.utilities;

import com.github.javafaker.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    //Bu class configration.properties file/dosyadaki bilgileri okumak icin dir.
    //Properties object olusturduk.
    private static Properties properties;

    static {
        //properties file path'i
        String path = "configration.properties";

        try {
            //file/dosyayi ac
            FileInputStream fileInputStream = new FileInputStream(path);
        //properties objecti aktif et/calistir.
            properties = new Properties();

          //dosyayi yukle
            properties.load(fileInputStream);
            //dosyayi kapat
            fileInputStream.close();


        } catch (IOException e) {
          e.printStackTrace();
        }

    }
    // getProperti(key) ==>value
    public static String getProperty(String key){
        String value = properties.getProperty(key);
        return value;

     //   return properties.getProperty(key);
    }
}

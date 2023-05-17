package com.envision.actitime.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class PropertyFileReader {

    private static Map<Object, Object> all_Config_and_properties_data = new HashMap<Object, Object>();

    static {
        if (all_Config_and_properties_data.size() == 0) {
            readProperties();
        }
    }

    private static void readProperties() {
        File file_or_folder = new File("actitime_testdata");
        if (file_or_folder.isDirectory()) {
            List<File> allFilesAndFolder = Arrays.asList(file_or_folder.listFiles());
            for (File eachFileAndFolder : allFilesAndFolder) {
                if (eachFileAndFolder.getName().endsWith("properties")) {
                    try {
                        FileInputStream fis = new FileInputStream(eachFileAndFolder);
                        Properties p = new Properties();
                        p.load(fis);
                        all_Config_and_properties_data.putAll(p);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                }
            }
        }
    }
    public static String getProperty(String propertyName){
        return all_Config_and_properties_data.get(propertyName).toString();
    }
    public static void main(String []args){
     String logout=   getProperty("actitime.browsername");
        System.out.println(logout);
        String config = getProperty("actitime.timetrackpage.logout_link");
        System.out.println(config);
        System.out.println(all_Config_and_properties_data);
    }
}

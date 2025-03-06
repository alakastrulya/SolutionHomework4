package part1;

import java.util.HashMap;

public class ConfigurationManager {
    //static variable to save the Singleton
    private static ConfigurationManager configurationManager;
    // stores data as key-value
    private static HashMap<String,String> configuration;

    //method to get the single instance
    public static synchronized ConfigurationManager getInstance() {
        // lazy initialization, create new instance if it does not exist
        if (configurationManager == null) {
            configurationManager = new ConfigurationManager();
        }
        //return exist Configuration Manager
        return configurationManager;
    }


// private constructor, initializes the HashMap for storing data.
    private ConfigurationManager() {
        configuration = new HashMap<>();
    }

    //add key-value pair to the HashMap
    public void addConfiguration(String key, String value) {
        configuration.put(key, value);
    }

    //a method to retrieve configuration values by key.
    public void getConfiguration(String key) {
        System.out.println(configuration.get(key));
    }

    //prints all stored data in the HashMap
    public void showConfiguration(){
        for (String key : configuration.keySet()) {
            System.out.println(key + " - '" + configuration.get(key)+"'");
        }
        System.out.println();
    }
}

package com.hansmoehansen.foodsadozen.handlers;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler {

    public static void init(File configFile){

        Configuration config = new Configuration(configFile); {
            boolean difficultBread = true;
            try {
                //Create the configuration object from the give configuration file
                config.load();

                //Read in the configuration file
                difficultBread = config.get("Baking", "difficultBread", true, "Makes bread baking difficult").getBoolean(true);
            }
            catch (Exception e){
                //Log the exception
            }
            finally {
                //Save the configuration file
                if (config.hasChanged()){
                    config.save();
                }
            }
        }
    }
}

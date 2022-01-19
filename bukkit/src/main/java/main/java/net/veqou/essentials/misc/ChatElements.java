package main.java.net.veqou.essentials.misc;

import main.java.net.veqou.essentials.Main;
import org.bukkit.configuration.file.FileConfiguration;

public class ChatElements {

    public static FileConfiguration fileConfiguration = Main.getInstance().getConfig();

    public static String noPermission = fileConfiguration.getString("ChatPrefix") + fileConfiguration.getString("ChatMessages.NoPermission");
    public static String error = fileConfiguration.getString("ChatPrefix") + fileConfiguration.getString("ChatMessages.Error");

}

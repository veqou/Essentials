package main.java.net.veqou.essentials;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private static Main instance;

    @Override
    public void onEnable() {

        instance = this;

        FileConfiguration fileConfiguration = this.getConfig();
        fileConfiguration.addDefault("ChatPrefix", "§7[§eEssentials§7] ");
        fileConfiguration.addDefault("Messages.NoPermission", "§cDu hast keine Rechte für diesen Command.");
        fileConfiguration.addDefault("Messages.Error", "§cEs ist ein Fehler aufgetreten. Bitte kontaktiere den Support.");
        fileConfiguration.options().copyDefaults(true);
        saveConfig();

    }

    @Override
    public void onDisable() {

    }

    public static Main getInstance() {
        return instance;
    }
}

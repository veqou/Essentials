package main.java.net.veqou.essentials.spigot.commands;

import main.java.net.veqou.essentials.misc.ChatElements;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class CommandHeal implements CommandExecutor {

    private ArrayList<String> onCooldown = new ArrayList<String>();

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        try {

            if(sender instanceof Player) {

                Player player = (Player) sender;

                if(label.equalsIgnoreCase("heal")) {

                    if(args.length == 0) {

                        if(player.hasPermission("essentials.commands.heal.self")) {

                        } else

                            player.sendMessage(ChatElements.noPermission);

                    } else if(args.length == 1) {

                    }

                }

            }

        } catch(Exception e) {

            e.printStackTrace();

        }
        return false;
    }
}

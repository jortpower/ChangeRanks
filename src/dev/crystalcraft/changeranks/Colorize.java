package dev.crystalcraft.changeranks;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Colorize {
    public static void SendMessage(CommandSender reciever,String msg) {
        reciever.sendMessage(ChatColor.translateAlternateColorCodes('&',msg));
    }

    public static void SendMessage(Player reciever, String msg) {
        reciever.sendMessage(ChatColor.translateAlternateColorCodes('&',msg));
    }

    public static String translateColorCodes(String translated) {
        return ChatColor.translateAlternateColorCodes('&',translated);
    }
}

package com.jahona;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class DulocPlugin extends JavaPlugin {

    @Override
    public void onEnable(){
        //Fired when the server enables the plugin
    }

    @Override
    public void onDisable(){
        //Fired when the server stops and disables all plugins
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (label.equalsIgnoreCase("duloc")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.sendMessage("Get out of my swamp!");
                return true;
            }
        }
        return false;
    }

}
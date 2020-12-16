package com.jahona;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
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
                player.sendMessage("Get out of my swamp! Or else");
                return true;
            }
        }

        return false;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event)
    {
        // Just for testing purposes
        Player player = event.getPlayer();
        player.sendMessage("Welcome to the swamp!");

        //Add item to inventory
//        ItemStack hardenedWood = CustomItem.HARDENED_WOOD.getItemStack();
//        hardenedWood.setAmount(64);
//        player.getInventory().addItem(hardenedWood);
//        player.getInventory().addItem(new ItemStack(Material.WOOD, 64));
    }


}
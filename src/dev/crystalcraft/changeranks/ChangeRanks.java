package dev.crystalcraft.changeranks;

import dev.crystalcraft.changeranks.managers.DataManager;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.UUID;

public class ChangeRanks extends JavaPlugin implements Listener {

    public static HashMap<UUID, Integer> RankHashMap;

    @Override
    public void onEnable() {



        Bukkit.getPluginManager().registerEvents(this,this);
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {

        if(!RankHashMap.containsKey(e.getPlayer().getUniqueId())) {
            RankHashMap.put(e.getPlayer().getUniqueId(),0);
            DataManager.setInt(e.getPlayer().getUniqueId() + ".rank",this);
        }

        if(DataManager.hasData(e.getPlayer().getUniqueId(),this)) {
            e.setJoinMessage(Ranks.getPrefix(DataManager.getInt(e.getPlayer().getUniqueId() + ".rank", this)) + Colorize.translateColorCodes(Ranks.getRankColor(DataManager.getInt(e.getPlayer().getUniqueId() + ".rank",this)) + e.getPlayer().getName() + "&6 has joined the game"));
        }
    }
}

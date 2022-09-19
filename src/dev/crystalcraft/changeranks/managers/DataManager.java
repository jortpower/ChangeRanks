package dev.crystalcraft.changeranks.managers;

import dev.crystalcraft.changeranks.ChangeRanks;

import java.util.UUID;

public class DataManager {

    public static boolean hasData(UUID playerUUID, ChangeRanks changeRanks) {
        return changeRanks.getConfig().contains(playerUUID.toString() + ".rank");
    }

    public static int getInt(String path, ChangeRanks changeRanks) {
        return changeRanks.getConfig().getInt(path);
    }

    public static void setInt(String path, ChangeRanks changeRanks) {
        changeRanks.getConfig().set(path,0);
    }
}

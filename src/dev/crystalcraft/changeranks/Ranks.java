package dev.crystalcraft.changeranks;

public enum Ranks {
    DEFAULT,//id=0
    VIP,//id=1
    MVP,//id=2
    HELPER,//id=3
    BUILDER,//id=4
    MODERATOR,//id=5
    ADMIN,//id=6
    HEADADMIN,//id=7
    COOWNER,//id=8
    OWNER;//id=9

    public static String getPrefix(int id) {
        switch (id) {
            case 0:
                return Colorize.translateColorCodes("&7[Member] ");
            case 1:
                return Colorize.translateColorCodes("[&aVip&f] ");
            case 2:
                return Colorize.translateColorCodes("[&6Mvp&f] ");
            case 3:
                return Colorize.translateColorCodes("[&9Helper&f] ");
            case 4:
                return Colorize.translateColorCodes("[&1Builder&f] ");
            case 5:
                return Colorize.translateColorCodes("[&5Moderator&f] ");
            case 6:
                return Colorize.translateColorCodes("[&2Admin&f] ");
            case 7:
                return Colorize.translateColorCodes("[&1HeadAdmin&f] ");
            case 8:
                return Colorize.translateColorCodes("[&4Co-Owner&f] ");
            case 9:
                return Colorize.translateColorCodes("[&cOwner&f] ");
        }

        return null;
    }
}

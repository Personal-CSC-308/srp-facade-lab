package srpfacadelab;

public class PlayerStats {

    static void calculateStats(RpgPlayer player) {
        int armour = 0;
        for (int i = 0; i < player.getInventory().getNumItems(); i++) {
            armour += player.getInventory().getItem(i).getArmour();
        }
        player.setArmour(armour);
    }
}

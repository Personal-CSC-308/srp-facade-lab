package srpfacadelab;

public class PlayerHealth {

    public static boolean healingItem(RpgPlayer player, Item item) {
        heal(player, item.getHeal());

        if (player.getHealth() > player.getMaxHealth())
            player.setHealth(player.getMaxHealth());

        if (item.getHeal() > 500) {
            player.getGameEngine().playSpecialEffect("green_swirly");
        }

        return true;
    }

    public static void takeDamage(RpgPlayer player, int damage) {
        if (damage < player.getArmour()) {
            player.getGameEngine().playSpecialEffect("parry");
        }

        int damageToDeal = damage - player.getArmour();
        if (player.getInventory().calculateInventoryWeight() < player.getCarryingCapacity() * 0.5)
            damageToDeal *= 0.75;
        damage(player, damageToDeal);

        player.getGameEngine().playSpecialEffect("lots_of_gore");
    }

    private static void heal(RpgPlayer player, int health) { player.setHealth(player.getHealth() + health); }
    private static void damage(RpgPlayer player, int damageToDeal) { player.setHealth(player.getHealth() - damageToDeal); }
}

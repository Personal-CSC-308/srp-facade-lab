package srpfacadelab;

public class PlayerFacade {

    RpgPlayer player;

    public PlayerFacade(IGameEngine gameEngine) {
        this.player = new RpgPlayer(gameEngine);
    }

    public PlayerFacade(RpgPlayer player_) {
        this.player = player_;
    }

    public void pickUpItem(Item item) {
        item.pickUpItem(player);
    }

    public void useItem(Item item) {
        item.useItem(player);
    }

    public void takeDamage(int damage) {
        PlayerHealth.takeDamage(player, damage);
    }

    public void calculateStats() {
        PlayerStats.calculateStats(player);
    }
}

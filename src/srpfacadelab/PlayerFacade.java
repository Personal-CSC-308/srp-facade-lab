package srpfacadelab;

public class PlayerFacade {

    RpgPlayer player;

    public PlayerFacade(IGameEngine gameEngine) {
        player = new RpgPlayer(gameEngine);
    }

    public void pickUpItem(Item item) {
        item.pickUpItem(player);
    }

    public void useItem(Item item) {
        item.useItem(player);
    }
}

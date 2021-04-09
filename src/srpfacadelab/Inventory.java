package srpfacadelab;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> inventory;

    public void Inventory() {
        inventory = new ArrayList<Item>();
    }

    public boolean add(Item item) {
        return inventory.add(item);
    }

    public int getNumItems() {
        return  inventory.size();
    }

    public Item getItem(int index) {
        return inventory.get(index);
    }

    //
    boolean checkIfItemExistsInInventory(Item item) {
        for (Item i: inventory) {
            if (i.getId() == item.getId())
                return true;
        }
        return false;
    }

    //
    int calculateInventoryWeight() {
        int sum=0;
        for (Item i: inventory) {
            sum += i.getWeight();
        }
        return sum;
    }
}

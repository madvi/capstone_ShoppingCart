import java.util.List;

public class Item {
    public String itemName;
    public int itemQty;
    public int itemCost;

    public Item(String itemName, int itemQty, int itemCost) {
        this.itemName = itemName;
        this.itemQty = itemQty;
        this.itemCost = itemCost;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemQty() {
        return itemQty;
    }

    public int getItemCost() {
        return itemCost;
    }

    public void setItemQty(int itemQty) {
        this.itemQty = itemQty;
    }
}

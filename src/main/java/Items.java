import java.util.List;

public class Items {
    public String ItemName;
    public int ItemQty;
    public int ItemCost;

    public Items(String itemName, int itemQty, int itemCost) {
        ItemName = itemName;
        ItemQty = itemQty;
        ItemCost = itemCost;
    }

    public String getItemName() {
        return ItemName;
    }

    public int getItemQty() {
        return ItemQty;
    }

    public int getItemCost() {
        return ItemCost;
    }

    public void setItemQty(int itemQty) {
        ItemQty = itemQty;
    }
}

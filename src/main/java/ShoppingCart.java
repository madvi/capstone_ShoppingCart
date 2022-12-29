import java.util.Iterator;
import java.util.List;

public class ShoppingCart {
    public void itemsInCart(List<Item> cartItems) {

        Iterator<Item> iterator1 = cartItems.iterator();
        while (iterator1.hasNext()) {
            Item item1 = iterator1.next();
            System.out.println(item1.getItemName()+ " " + item1.getItemQty()+ " " + item1.getItemCost());
        }
    }

    }



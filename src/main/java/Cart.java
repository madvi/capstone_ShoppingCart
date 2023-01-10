import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Cart {

    private int quantity;
    public List<Item> cartItems;

    public Cart(){
        cartItems = new ArrayList<>();
    }
    public List<Item> itemsInCart(Item... item) {
        cartItems.addAll(Arrays.asList(item));


        Iterator<Item> iterator1 = cartItems.iterator();
        while (iterator1.hasNext()) {
            Item item1 = iterator1.next();
            System.out.println(item1.getItemName()+ " " + item1.getItemQty()+ " " + item1.getItemCost());
        }
        return cartItems;
    }

    public void updateCartItem(Item item) {
        quantity = 0;
        Iterator<Item> iterator2 = cartItems.iterator();
        while (iterator2.hasNext()) {
            Item item2 = iterator2.next();
            if (item2.getItemName() == item.getItemName()) {
                quantity = item2.getItemQty();
                quantity++;
            }
        }
        System.out.println("Updated quantity of apple is: "+quantity);
    }

    public void reduceCartItem(Item item) {
        quantity = 0;
        Iterator<Item> iterator3 = cartItems.iterator();
        while (iterator3.hasNext()) {
            Item item3 = iterator3.next();
            if (item3.getItemName() == item.getItemName()) {
                quantity = item3.getItemQty();
                quantity--;
                item3.setItemQty(quantity);
            }
        }
        System.out.println("Updated quantity of np is: "+quantity);
    }

    public List<Item> itemsInCartAfterUpdate(Item... item) {
        cartItems.addAll(Arrays.asList(item));

        Iterator<Item> iterator1 = cartItems.iterator();
        while (iterator1.hasNext()) {
            Item item1 = iterator1.next();
            System.out.println(item1.getItemName()+ " " + item1.getItemQty()+ " " + item1.getItemCost());
        }
        return cartItems;
    }

}





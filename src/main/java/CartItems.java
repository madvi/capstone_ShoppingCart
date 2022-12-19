import java.util.ArrayList;
import java.util.List;

public class CartItems {

    public static void main(String[] args) {

        Items item1 = new Items("Apple", 3, 100);
        Items item2 = new Items("Milk", 2, 20);
        Items item3 = new Items("Newspaper", 4, 10);

        List<Items> cartItems = new ArrayList<>();
        cartItems.add(item1);
        cartItems.add(item2);
        cartItems.add(item3);

        AddItems addItems = new AddItems();
        addItems.TotalItemsInCart(cartItems);


        addItems.getTotalAmount(cartItems);
        addItems.addDiscount();
        addItems.applyCoupon();
        addItems.payWallet();
        addItems.offerOnMilk(cartItems);
        addItems.totalMilkInCart(cartItems);

    }
}

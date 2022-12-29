import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Item i1 = new Item("Apple", 3, 10);
        Item i2 = new Item("Milk", 2, 10);
        Item i3 = new Item("Newspaper", 4, 10);

        List<Item> cartItems = new ArrayList<>();
        cartItems.add(i1);
        cartItems.add(i2);
        cartItems.add(i3);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.itemsInCart(cartItems);

        CartPayment cartPayment = new CartPayment();
        cartPayment.amountTobePaid(cartItems);
        cartPayment.paymentViaWallet();

        OfferOnItems offerOnItems = new OfferOnItems();
        offerOnItems.buyTwoGetOneOffer(cartItems);
        offerOnItems.itemCountAfterAvailingOffer(cartItems);

    }
}

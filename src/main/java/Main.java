import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Item apple = new Item("Apple", 3, 11);
        Item milk = new Item("Milk", 2, 30);
        Item newspaper = new Item("Newspaper", 4, 15);

        List<Item> cartItems = new ArrayList<>();
        cartItems.add(apple);
        cartItems.add(milk);
        cartItems.add(newspaper);

        Cart cart = new Cart();
        cart.itemsInCart(cartItems);
        cart.updateCartItem(cartItems,"Apple");
        cart.reduceCartItem(cartItems,"Newspaper");
        cart.itemsInCartAfterUpdate(cartItems);

        Offer offer = new Offer();
        offer.buyTwoGetOneOffer(cartItems,"Milk");

        //offerOnItems.itemCountAfterAvailingOffer(cartItems);

        Payment payment = new Payment();
        payment.amountTobePaid(cartItems);
        payment.paymentViaWallet();

    }
}

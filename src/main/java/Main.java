import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Item apple = new Item("Apple", 3, 11);
        Item milk = new Item("Milk", 2, 30);
        Item newspaper = new Item("Newspaper", 4, 15);


        Cart cart = new Cart();
        cart.itemsInCart(apple,milk,newspaper);

        cart.updateCartItem(apple);
        cart.reduceCartItem(newspaper);

        cart.itemsInCartAfterUpdate();

        Offer offer = new Offer();
        offer.buyTwoGetOneOffer(cart.cartItems,"Milk");

        //offerOnItems.itemCountAfterAvailingOffer(cartItems);

        Payment payment = new Payment();
        payment.amountTobePaid(cart.cartItems);
        payment.paymentViaWallet();

    }
}

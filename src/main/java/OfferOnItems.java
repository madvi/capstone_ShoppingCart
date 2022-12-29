import java.util.Iterator;
import java.util.List;

public class OfferOnItems {

    private int quantity;
    public void buyTwoGetOneOffer(List<Item> cartItems) {
        quantity = 0;
        Iterator<Item> iterator3 = cartItems.iterator();
        while (iterator3.hasNext()) {
            Item item3 = iterator3.next();
            if (item3.getItemName() == "Milk") {
                if (item3.getItemQty() == 2) {
                    quantity = item3.getItemQty();
                    quantity++;
                    item3.setItemQty(quantity);
                }else
                {
                    quantity = item3.getItemQty();
                }
            }
        }
    }

    public void itemCountAfterAvailingOffer (List < Item > cartItems) {
        Iterator<Item> iterator4 = cartItems.iterator();
        while (iterator4.hasNext()) {
            Item item4 = iterator4.next();
            if (item4.getItemName() == "Milk") {
                System.out.println("Total no of milk in cart :" +item4.getItemQty());
            }

        }
    }
}

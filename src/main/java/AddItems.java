import java.util.Iterator;
import java.util.List;

public class AddItems {
    private double totalAmount;
    private double discountAmount;
    private double discountAmountAfterCoupon;

    public void TotalItemsInCart(List<Items> cartItems) {

        Iterator<Items> iterator1 = cartItems.iterator();
        while (iterator1.hasNext()) {
            Items items1 = iterator1.next();
            System.out.println(items1.getItemName());
        }
    }

    public void getTotalAmount(List<Items> cartItems) {
        Iterator<Items> iterator2 = cartItems.iterator();
        this.totalAmount = 0;
        while (iterator2.hasNext()) {
            Items item2 = iterator2.next();
            this.totalAmount = this.totalAmount + (item2.getItemCost() * item2.getItemQty());
        }
        System.out.println("Total price of cart: " + this.totalAmount);
    }

    public void addDiscount() {
        discountAmount = totalAmount - (totalAmount*(0.05));
        System.out.println("Amount after 5% discount : " +discountAmount);
    }

    public void applyCoupon(){
        String coupon = "DIS10";
        if(coupon.equals("DIS10")){
           discountAmountAfterCoupon = discountAmount - (discountAmount*(0.1));
            System.out.println("Amount after coupon discount : "+discountAmountAfterCoupon);
        }
    }

    public void payWallet() {
        double walletAmount = 1000;
        walletAmount = walletAmount - discountAmountAfterCoupon;
        System.out.println("eWallet Balance after payment : " + walletAmount);

    }

    public void offerOnMilk(List<Items> cartItems) {
        int qty = 0;
        Iterator<Items> iterator3 = cartItems.iterator();
        while (iterator3.hasNext()) {
            Items item3 = iterator3.next();
            if (item3.getItemName() == "Milk") {
                if (item3.getItemQty() == 3) {
                    qty = item3.getItemQty();
                    qty++;
                    item3.setItemQty(qty);
                }else
                {
                    qty = item3.getItemQty();
                }
            }
        }
    }

    public void totalMilkInCart (List < Items > cartItems) {
        Iterator<Items> iterator4 = cartItems.iterator();
            while (iterator4.hasNext()) {
                Items item4 = iterator4.next();
                if (item4.getItemName() == "Milk") {
                    System.out.println("Total no of milk in cart :" +item4.getItemQty());
                }

            }
        }
    }



import java.util.Iterator;
import java.util.List;

public class Payment {
    private double totalAmount;
    private  double discountAmount;

    public void amountTobePaid(List<Item> cartItems) {
        Iterator<Item> iterator2 = cartItems.iterator();
        this.totalAmount = 0;
        while (iterator2.hasNext()) {
            Item item2 = iterator2.next();
            this.totalAmount = this.totalAmount + (item2.getItemCost() * item2.getItemQty());
        }
        System.out.println("Total price of cart: " + this.totalAmount);

        if (totalAmount >= 100) {
            discountAmount = totalAmount - (totalAmount * (0.05));
            System.out.println("Cart price after availing discount : " + discountAmount);
        }
    }
    /*public void applyCoupon(){
        String coupon = "DIS10";
        if(coupon.equals("DIS10")){
            discountAmountAfterCoupon = discountAmount - (discountAmount*(0.1));
            System.out.println("Amount after coupon discount : "+discountAmountAfterCoupon);
        }
    }*/

        public void paymentViaWallet() {
            double walletBalance = 1000;
            double balanceAfterPayment;

            balanceAfterPayment = walletBalance - discountAmount;
            System.out.println("Wallet balance after payment: " + balanceAfterPayment);

        }

    }



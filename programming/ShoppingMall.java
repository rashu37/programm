public class ShoppingMall {
    public static void main(String[] args) {
        // Example array of item bills
        double[] itemBills = {30, 40, 50, 10}; // You can modify the item bills array
        double totalBill = calculateTotal(itemBills);

        System.out.println("Original Total Bill: Rs " + totalBill);

        if (totalBill > 100) {
            System.out.println("Total Bill is above Rs 100. Applying coupon of Rs 20 for each item...");
            double totalAfterCoupon = applyCoupon(itemBills, 20);  // Apply a flat Rs 20 discount per item
            System.out.println("Total After Coupon: Rs " + totalAfterCoupon);
        } else {
            System.out.println("Total Bill is below Rs 100. No coupon applied.");
        }
    }

    // Method to calculate the total bill
    public static double calculateTotal(double[] itemBills) {
        double total = 0;
        for (double bill : itemBills) {
            total += bill;
        }
        return total;
    }

    // Method to apply a flat Rs 20 discount on each item and calculate the total after discount
    public static double applyCoupon(double[] itemBills, double couponAmount) {
        double totalAfterCoupon = 0;

        for (int i = 0; i < itemBills.length; i++) {
            // Apply Rs 20 discount to each item, but ensure that the discounted price is not negative
            double discountedPrice = itemBills[i] - couponAmount;
            if (discountedPrice < 0) {
                discountedPrice = 0;
            }
            totalAfterCoupon += discountedPrice;
        }

        return totalAfterCoupon;
    }
}
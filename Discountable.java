public class Product implements Discountable {
    
    @Override
    public double applyDiscount() {
        
        // Applying a 10% discount might look like this:
        double discountRate = 0.10;
        double discountedPrice = this.price * (1 - discountRate);
        return discountedPrice;
    }
}

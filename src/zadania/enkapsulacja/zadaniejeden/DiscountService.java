package zadania.enkapsulacja.zadaniejeden;

class DiscountService {

    public double calculateDiscountPrice(Client client, double price){
        if (client.isPremium()){
            return calculatePremiumDiscount(price);
        }else return calculateNormalDiscount(price);
    }
    private double calculateNormalDiscount(double price){
        if (price > 1000) {
            return applyDiscount(price,0.10);
        }else return price;
    }
    private double calculatePremiumDiscount(double price){
        if (price < 1000){
            return applyDiscount(price,0.5);
        }else return applyDiscount(price, 0.15);
    }
    private double applyDiscount(double price, double discount) {
        return price * (1 - discount);
    }
}

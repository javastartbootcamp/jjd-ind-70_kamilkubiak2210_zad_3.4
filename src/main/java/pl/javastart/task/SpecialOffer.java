package pl.javastart.task;

public class SpecialOffer {
    private final String offerDescription;
    private final String offerTime;
    private final double discount;
    private final Product product;

    public SpecialOffer(Product product, String offerDescription, String offerTime, double discount) {
        this.product = product;
        this.offerDescription = offerDescription;
        this.offerTime = offerTime;
        this.discount = discount;
    }

    public String getOfferDescription() {
        return offerDescription;
    }

    public String getOfferTime() {
        return offerTime;
    }

    public double getDiscount() {
        return discount;
    }

    public Product getProduct() {
        return product;
    }
}

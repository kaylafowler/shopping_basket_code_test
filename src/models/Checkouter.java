package models;

public class Checkouter {
    ShoppingBasket shoppingBasket;
    Customer customer;
    Stock stock;

    public Checkouter(ShoppingBasket shoppingBasket, Customer customer, Stock stock){
        this.shoppingBasket = shoppingBasket;
        this.customer = customer;
        this.stock = stock;
    }

    public double updatedBasketTotalPriceAfterGeneralDiscount() {
        if(shoppingBasket.totalPriceOfProducts() >= 20){
            double generalDiscount = shoppingBasket.totalPriceOfProducts() - (shoppingBasket.totalPriceOfProducts() *
                    0.1);
            return generalDiscount;
        }
        else {return shoppingBasket.totalPriceOfProducts();}
    }

    public double updatedBasketTotalPriceAfterLoyaltyDiscount() {
        if(customer.getLoyaltyMember() == true){
            double loyaltyDiscount = updatedBasketTotalPriceAfterGeneralDiscount() - (
            updatedBasketTotalPriceAfterGeneralDiscount() * 0.02);
            return loyaltyDiscount;
        } else {return updatedBasketTotalPriceAfterGeneralDiscount();}

    }

}

package models;

public class Customer {
    String name;
    int id;
    boolean loyaltyMember;

    public Customer(String name, int id, boolean loyaltyMember){
        this.name = name;
        this.id = id;
        this.loyaltyMember = loyaltyMember;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public boolean getLoyaltyMember() {
        return loyaltyMember;
    }

    public void setLoyaltyMember(Boolean loyaltyMember) {
        this.loyaltyMember = loyaltyMember;
    }
}

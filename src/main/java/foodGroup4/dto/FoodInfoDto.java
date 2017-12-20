package foodGroup4.dto;

import foodGroup4.entity.Mon;

public class FoodInfoDto {
    private int quantity;
    private int price;
    private Mon mon;

    public FoodInfoDto(Mon mon) {
        this.quantity = 1;
        this.price = -1;
        this.mon = mon;
    }

    public int getPrice() {
        return price;
    }

    public Mon getMon() {
        return mon;
    }

    public int getQuantity() {

        return quantity;

    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

package foodGroup4.dto;

import foodGroup4.entity.Mon;

public class FoodInfoDto {
    private int quantity;
    private int price;
    private Mon mon;

    public FoodInfoDto(Mon mon) {
        this.mon = mon;
        this.quantity = 1;
    }

    public void setMon(Mon mon) {
        this.mon = mon;
    }

    public int getQuantity() {

        return quantity;
    }

    public Mon getMon() {
        return mon;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

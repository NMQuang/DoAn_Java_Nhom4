package foodGroup4.dto;

import foodGroup4.entity.Chinhanh;
import foodGroup4.entity.Mon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CartInfoDto {
    private int quantity;
    private int totalPrice;
    private List<FoodInfoDto> foodInfoDtos;
    private Chinhanh chinhanh;

    public CartInfoDto() {
        this.quantity = 0;
        this.totalPrice = 0;
        this.foodInfoDtos = new ArrayList<>();
    }

    public void addFoodToCart(Mon mon) {
        for(FoodInfoDto foodInfoDto : this.foodInfoDtos) {
            if(mon.getMonId() == foodInfoDto.getMon().getMonId()) {
                return;
            }
        }
        FoodInfoDto foodInfoDto = new FoodInfoDto(mon);
        this.foodInfoDtos.add(foodInfoDto);
        quantity++;
    }

    public void setPriceForFoodFromMapPrice(HashMap<Integer, Integer> mapPrice) {
        this.totalPrice = 0;
        for(FoodInfoDto foodInfoDto: foodInfoDtos) {
            int priceFood = mapPrice.get(foodInfoDto.getMon().getMonId());
            foodInfoDto.setPrice(priceFood);
            if(priceFood > 0) {
                totalPrice += foodInfoDto.getPrice() * foodInfoDto.getQuantity();
            }
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public List<FoodInfoDto> getFoodInfoDtos() {
        return foodInfoDtos;
    }

    public Chinhanh getChinhanh() {
        return chinhanh;
    }

    public void setChinhanh(Chinhanh chinhanh) {
        this.chinhanh = chinhanh;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}

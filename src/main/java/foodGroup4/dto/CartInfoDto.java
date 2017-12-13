package foodGroup4.dto;

import foodGroup4.entity.Mon;

import java.util.ArrayList;
import java.util.List;

public class CartInfoDto {
    private int quantity;
    private List<FoodInfoDto> foodInfoDtos;

    public CartInfoDto() {
        this.quantity = 0;
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

    public int getQuantity() {
        return quantity;
    }

    public List<FoodInfoDto> getFoodInfoDtos() {
        return foodInfoDtos;
    }
}

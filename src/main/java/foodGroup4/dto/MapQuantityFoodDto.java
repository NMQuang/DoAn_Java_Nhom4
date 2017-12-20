package foodGroup4.dto;

import java.util.HashMap;

public class MapQuantityFoodDto {
    private HashMap<Integer, Integer> map;

    private HashMap<Integer, Integer> createMapQuantityFood(CartInfoDto cartInfo) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(FoodInfoDto foodInfoDto: cartInfo.getFoodInfoDtos()) {
            map.put(foodInfoDto.getMon().getMonId(), foodInfoDto.getQuantity());
        }
        return map;
    }

    public MapQuantityFoodDto() {

    }

    public int getQuantity(int idFood) {
        if(map.containsKey(idFood)) {
            Integer quantity = map.get(idFood);
            return quantity != null && quantity > 0 ? quantity : 1;
        }
        return 1;
    }

    public MapQuantityFoodDto(CartInfoDto cartInfo) {
        this.map = createMapQuantityFood(cartInfo);
    }

    public HashMap<Integer, Integer> getMap() {
        return map;
    }

    public void setMap(HashMap<Integer, Integer> map) {
        this.map = map;
    }
}

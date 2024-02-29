import java.util.*;

public class RestaurantActions {
    ArrayList<Restaurant> restaurants;
    HashMap<Restaurant, Integer> restaurantIndexes;

    public void registerRestaurant(Restaurant restaurant){
       restaurants.add(restaurant);
       restaurantIndexes.put(restaurant, restaurants.size() - 1);
    }

    public void addItemForRestaurant(Item item, Restaurant restaurant, int restaurantID)
    {
        int index = restaurantIndexes.get(restaurant);
        restaurants.get(index).itemList.add(item);
        
    }

    public void deleteItemForRestaurant(Item item, Restaurant restaurant)
    {
        int index = restaurantIndexes.get(restaurant);
        
        Restaurant selectedRestaurant = restaurants.get(index);
        int itemIndex = selectedRestaurant.getItemIndex(item);
        
        selectedRestaurant.itemList.remove(itemIndex);
        
    }

    public void updatePriceForItem(Item item, int newPrice, Restaurant restaurant){
        
        int index = restaurantIndexes.get(restaurant);

        Restaurant selectedRestaurant = restaurants.get(index);
        int itemIndex = selectedRestaurant.getItemIndex(item);

        selectedRestaurant.itemList.get(itemIndex).price = newPrice;
    }

    public ArrayList<Restaurant> searchRestaurantsForItem(String itemName){
        ArrayList<Restaurant> matchedRestaurants = new ArrayList<>();

        for (int i = 0; i < restaurants.size(); i++){
            for (int j = 0; j < restaurants.get(i).itemList.size(); j++){
                if (restaurants.get(i).itemList.get(j).name == itemName){
                    matchedRestaurants.add(restaurants.get(i));
                    break;
                }
            }
        }

        return matchedRestaurants;
    }
}

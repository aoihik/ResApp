import java.util.*;

public class Restaurant {
    String name;
    int pincode;
    int index;
    ArrayList<Item> itemList;
    HashMap<Item, Integer> itemIndexes;

    public Restaurant(String _name, int _pincode){
        name = _name;
        pincode = _pincode;
        itemList = new ArrayList<>();
    }

    public void addItem(Item item){
        itemList.add(item);
        itemIndexes.put(item, itemList.size() - 1);
    }

    public int getItemIndex(Item item){
        return itemIndexes.get(item);
    }

}

package Restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    Date updatedLast = new Date();
    MenuItem lastAdded;
    ArrayList<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem food){
        items.add(food);
        lastItem(items);
    }
    public void printMenu(ArrayList<MenuItem> foods){
        for(MenuItem item: foods){
            System.out.println(item.getPrice());
            System.out.println(item.getDescription());
            System.out.println(item.getCategory());
        }
    }
    public void lastItem(ArrayList<MenuItem> foods){
        lastAdded = foods.get(foods.size()-1);
    }

}

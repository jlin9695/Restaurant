package Restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date last;
    MenuItem lastAdded;
    private ArrayList<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem food){
        items.add(food);
        lastItem(items);
    }
    public void printMenu(){
        for(MenuItem item: this.items){
            System.out.println("*********");
            System.out.println(item.getCategory());
            System.out.println(item.getName()  + " " + item.getPrice() );
            System.out.println(item.getDescription());
            System.out.println("*********");
        }
    }
    //public void
    public void lastItem(ArrayList<MenuItem> foods){
        lastAdded = foods.get(foods.size()-1);
    }

}

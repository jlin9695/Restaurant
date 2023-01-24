package Restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date last;
    MenuItem lastAdded;
    private ArrayList<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem food){
        for (MenuItem item: this.items){
            if(item.getName().toLowerCase() == food.getName().toLowerCase()){
                System.out.println("You are trying to add 2 items with the same name!");
                return;
            }

        }
        if(!this.items.contains(food)) {
            items.add(food);
            lastItem(items);
        }

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

    public void seeItem(MenuItem item){
        if (this.items.contains(item)){
            System.out.println("*********");
            System.out.println(this.items.get(this.items.indexOf(item)).getCategory());
            System.out.println(this.items.get(this.items.indexOf(item)).getName()  +
                    " " + this.items.get(this.items.indexOf(item)).getPrice() );
            System.out.println(this.items.get(this.items.indexOf(item)).getDescription());
            System.out.println("*********");
        }

    }
    public void deleteItem(MenuItem item){
        this.items.remove(item);
    }
    //public void
    public void lastItem(ArrayList<MenuItem> foods){
        lastAdded = foods.get(foods.size()-1);
    }

}

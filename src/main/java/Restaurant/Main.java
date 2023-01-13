package Restaurant;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        MenuItem testFood = new MenuItem(12.99,"A sweet rollllllllll","Appetizer");

//        System.out.println(testFood.getPrice());
//        System.out.println(testFood.getCategory());
//        System.out.println(testFood.getDescription());
        menu.addItem(testFood);
        System.out.println(menu.lastAdded);
    }
}
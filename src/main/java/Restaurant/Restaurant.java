package Restaurant;

public class Restaurant {
    public static void main(String[] args) {
        Menu menu = new Menu();

        MenuItem testFood = new MenuItem("Sweet roll",12.99,"A sweet rollllllllll","Appetizer");

//        System.out.println(testFood.getPrice());
//        System.out.println(testFood.getCategory());
//        System.out.println(testFood.getDescription());
        menu.addItem(testFood);
        menu.printMenu();
    }
}
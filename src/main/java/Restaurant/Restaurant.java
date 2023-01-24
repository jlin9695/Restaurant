package Restaurant;

public class Restaurant {
    public static void main(String[] args) {
        Menu menu = new Menu();

        MenuItem testFood = new MenuItem("Sweet roll",12.99,"A sweet rollllllllll","Appetizer");
        MenuItem testfood2 = new MenuItem("Mozzarella Sticks", 300,"CHEESY LONG BOIS", "Appetizer");
        MenuItem testfood3 = new MenuItem("Mozzarella Sticks",12.99,"CHEESY LONG BOIS", "Appetizer");
//        System.out.println(testFood.getPrice());
//        System.out.println(testFood.getCategory());
//        System.out.println(testFood.getDescription());
        menu.addItem(testFood);
        menu.addItem(testfood2);
        menu.printMenu();
        menu.addItem(testfood3);
        menu.seeItem(testfood2);
        menu.deleteItem(testFood);
        menu.printMenu();

        //menu.printMenu();
    }
}
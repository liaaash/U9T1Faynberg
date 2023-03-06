public class FoodTruck extends Vehicle{
    private int menuItems;
    public FoodTruck(String name, int wheels, int menuItems1) {
        super(name, wheels);
        this.menuItems = menuItems1;
    }
    public void displayMenu() {
        System.out.println("FOOD TRUCK MENU:");
        System.out.println("Croissant: $2");
        System.out.println("Muffin: $1");
        System.out.println("Cake slice: $4");
        System.out.println("Canele: $2");
        System.out.println("Kouign Amann: $3");
    }
    public int getMenuItems() {
        return menuItems;
    }

}

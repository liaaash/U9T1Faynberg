public class Bicycle extends Vehicle {
    private int gearCount;

    public Bicycle(String name, int wheels, int gears)
    {
        super(name, wheels);
        gearCount = gears;
    }

    public void ringBell() {
        System.out.println("the bell is rung!");
    }

    public int getGears() {
        return gearCount;
    }
}

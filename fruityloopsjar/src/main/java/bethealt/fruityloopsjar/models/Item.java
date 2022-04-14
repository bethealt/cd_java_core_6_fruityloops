package bethealt.fruityloopsjar.models;

public class Item {

    //MEMBER VARIABLES
    private String name;
    private double price;

    //CONSTRUCTOR
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //GETTERS & SETTERS
    public String getName() {
        return this.name;
    }

    public String setName(String name) {
        this.name = name;
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public double setPrice(double price) {
        this.price = price;
        return this.price;
    }
    
}

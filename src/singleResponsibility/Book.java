package singleResponsibility;

public class Book {

    private String name;

    private String uuid;

    private double price;

    public Book(String name, String uuid, double price) {
        this.name = name;
        this.uuid = uuid;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getUuid() {
        return uuid;
    }

    public double getPrice() {
        return price;
    }


}

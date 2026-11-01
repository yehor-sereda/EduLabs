public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", "Red", 2020, 20000, 5);
        System.out.println(car.returnAsString());

        car.sell(1);

        System.out.println("\nAfter selling:");
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Color: " + car.getColor());
        System.out.println("Year: " + car.getYear());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Quantity: " + car.getQuantity());

        car.setColor("Blue");
        car.setPrice(18000);
        car.setYear(2021);

        System.out.println("\nAfter changes:");
        System.out.println(car.returnAsString());
    }
}

class Car {
    String color;
    String model;
    int year;
    String brand;
    int price;
    int quantity;

    public Car(String brand, String model, String color, int year, int price, int quantity) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
        this.quantity = quantity;
    }

    String getColor() {
        return color;
    }
    void setColor(String color) {
        this.color = color;
    }

    String getModel() {
        return model;
    }
    void setModel(String model) {
        this.model = model;
    }

    int getYear() {
        return year;
    }
    void setYear(int year) {
        this.year = year;
    }

    String getBrand() {
        return brand;
    }
    void setBrand(String brand) {
        this.brand = brand;
    }

    int getPrice() {
        return price;
    }
    void setPrice(int price) {
        this.price = price;
    }

    int getQuantity() {
        return quantity;
    }
    void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    void sell(int n) {
        if (this.quantity > 0) {
            this.quantity--;
        }
        else  {
            System.out.println("Sorry no sell available");
        }
    }
    void deliver(int n) {
        this.quantity += n;
    }

    String returnAsString() {
        return "Brand: " + getBrand() + "\nModel: " + getModel() + "\nYear: " + getYear() + "\nColor: " + getColor() + "\nPrice:" +  Integer.toString(getPrice()) + "\nQuantity available: " + Integer.toString(getQuantity());
    }
}
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

@Getter
@Setter
@ToString
@AllArgsConstructor
@EqualsAndHashCode(of = "brand")
class CarWithLombok {
    private String brand;
    private String model;
    private String color;
    private int year;
    private int price;
    private int quantity;
}

class Main {
    public static void main(String[] args) {
        CarWithLombok car1 = new CarWithLombok("Mercedes", "GLE", "white", 2020, 350_000, 5);
        CarWithLombok car2 = new CarWithLombok("Mercedes", "GLC", "silver", 2023, 200_000, 3);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1.getColor());
        int year = car1.getYear();
        car1.setColor("black");
        System.out.println("Are these objects equal? " + car1.equals(car2));
        System.out.println("The HashCode of this object is: " + car2.hashCode());
        System.out.println("The HashCode of this object is: " + car1.hashCode());
    }
}

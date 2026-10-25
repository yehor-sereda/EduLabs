import java.util.Random;
import java.util.Scanner;

void main() {
    //Task 3

    Scanner sc = new Scanner(System.in);

    double a, b, c;
    System.out.print("a =>");
    a = sc.nextDouble(); System.out.println();
    System.out.print("b =>");
    b = sc.nextDouble(); System.out.println();
    System.out.print("c =>");
    c = sc.nextDouble(); System.out.println();

    switch (a) {
        case 0.0:
            System.out.print("This program is optimized for quadratic equations. Please, make sure that teh entered data is correct");
            break;

        default:
            double d = Math.pow(b, 2) - 4 * a * c;
    }

    //Task 5

    int min = Integer.MAX_VALUE, max = -1;
    int i = 0;
    Random r = new Random();

    while (i < 10) {
        int rnd = r.nextInt(100);
        if  (rnd < min) {min = rnd;}
        else if (rnd > max) {max = rnd;}

        i++;
    }

    System.out.println("Minimum random value: " + min);
    System.out.println("Maximum random value: " + max);
}

import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {


        try (Scanner obj = new Scanner(System.in)) {

            double radius = obj.nextDouble();
            int length = obj.nextInt();
            int width = obj.nextInt();


            Shape circle = new Circle(radius);
            Shape rectangle = new Ractangle(length,width);

            System.out.println("Circle area :" + circle.calculateArea());
            System.out.println("Rectangle area :" + rectangle.calculateArea());
        }
    }
}
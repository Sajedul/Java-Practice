import org.rahatcode.Inheritance.Bird;

public class Main {
    public static void main(String[] args) {

        Bird parrot = new Bird("pigeons", "green", 2, true,2);
        System.out.println(parrot.getName());

        parrot.eat("wheat");

        System.out.println(parrot.getWings());

        parrot.fly();
    }
}
public class Main {
    public static void main(String[] args) {

        Animal myDog = new Dog();
        myDog.makeSound();
        myDog.sleep();

        Animal myCat = new Cat();
        myCat.makeSound();
        myCat.sleep();

        //Animal obj = new Animal();  we can not able to create Animal object like that
        // because abstract class do not allow us create instace of abstract class
    }
}
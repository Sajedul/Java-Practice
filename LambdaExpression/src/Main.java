import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Mary", "Steve", "Anna", "Paul");
        Collections.sort(names, (a, b) -> a.compareTo(b));
        System.out.println("Alphabetical: " + names);

        Collections.sort(names,(a,b)->b.compareTo(a));
        System.out.println("Reverse Alphabetical:"+names);


        // Sort by length of the strings
        Collections.sort(names, (a, b) -> Integer.compare(a.length(), b.length()));
        System.out.println("By Length: " + names);


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 11, 15, 20);

        // Filter even numbers
        List<Integer> evens = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("Even Numbers: " + evens);

        // Filter odd numbers
        List<Integer> odds = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        System.out.println("Odd Numbers: " + odds);

        // Filter numbers greater than 10
        List<Integer> greaterThanTen = numbers.stream().filter(n -> n > 10).collect(Collectors.toList());
        System.out.println("Numbers Greater Than 10: " + greaterThanTen);


        // Lambda expression to convert string to uppercase
        StringOperation toUpperCase = s -> s.toUpperCase();

        // Lambda expression to convert string to lowercase
        StringOperation toLowerCase = s -> s.toLowerCase();

        // Lambda expression to reverse string
        StringOperation reverse = s -> new StringBuilder(s).reverse().toString();

        // Test the lambda expressions
        String testString = "Lambda Expressions";
        System.out.println("Original: " + testString);
        System.out.println("Uppercase: " + toUpperCase.apply(testString));
        System.out.println("Lowercase: " + toLowerCase.apply(testString));
        System.out.println("Reversed: " + reverse.apply(testString));



        // Lambda expression for addition
        Calculator add = (a, b) -> a + b;

        // Lambda expression for subtraction
        Calculator subtract = (a, b) -> a - b;

        // Lambda expression for multiplication
        Calculator multiply = (a, b) -> a * b;

        // Lambda expression for division
        Calculator divide = (a, b) -> a / b;

        // Test the lambda expressions
        int a = 10;
        int b = 5;
        System.out.println("Addition: " + add.calculate(a, b));
        System.out.println("Subtraction: " + subtract.calculate(a, b));
        System.out.println("Multiplication: " + multiply.calculate(a, b));
        System.out.println("Division: " + divide.calculate(a, b));

        // Create a Runnable using lambda expression
        Runnable runnable = () -> System.out.println("Hello, Lambda!");
    }
}
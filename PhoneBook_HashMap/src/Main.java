import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook pb = new PhoneBook();
        PhoneBook.addContact("Alice", "123-456-7890");
        PhoneBook.addContact("Bob", "987-654-3210");
        PhoneBook.addContact("Charlie", "555-555-5555");

        System.out.println("All contacts:");
        PhoneBook.printAllContacts();

        System.out.println("Enter a contact name to get their phone number:");
        String name = scanner.nextLine();

        System.out.println(name + "'s phone number: " + PhoneBook.getContact(name));

       /* System.out.println("Enter a contact name to remove:");
        name = scanner.nextLine();
        PhoneBook.removeContact(name);*/
    }
}
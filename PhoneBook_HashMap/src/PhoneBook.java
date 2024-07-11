import java.util.HashMap;

public class PhoneBook {
    private static HashMap<String, String> phoneBook = new HashMap<>();

    public static void addContact(String name, String phone) {
        phoneBook.put(name, phone);
    }

    public static String getContact(String name) {
        return phoneBook.get(name);
    }

    /*public static void removeContact(String name) {
        phoneBook.remove(name);
    }*/
    public static void printAllContacts() {
        for (String name : phoneBook.keySet()) {
            System.out.println(name + ": " + phoneBook.get(name));
        }
    }
    
}

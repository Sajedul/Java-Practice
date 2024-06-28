import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String,String> capitalCities=new HashMap<String,String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
        capitalCities.get("England");

        System.out.println(capitalCities.size());

        for ( String i:capitalCities.keySet()) {

            System.out.println(i);
        }

        for (String i : capitalCities.values()) {
            System.out.println(i);
        }
        capitalCities.replace("USA", "New York", "Washington DC");

        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }


        //Create a HashMap object called people that will store String keys and Integer values

        HashMap<String, Integer> people = new HashMap<String, Integer>();

        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }


    }
}
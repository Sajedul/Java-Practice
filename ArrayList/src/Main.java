import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i <10 ; i++) {
            list.add(i);
        }
        System.out.println("List Item is:" +list);

        int fifthElement = list.get(4);

        System.out.println("the fifthElement is:"+fifthElement);

        list.set(3,10);
        System.out.println("modified list is:"+list);
        list.set(1,105);
        System.out.println("modified list is:"+list);


        list.remove(5);
        System.out.println("Removed list is:"+list);

        for (int x:list) {
            System.out.println(x);

        }

        int searchItem =105;
        int index= list.indexOf(searchItem);
        if (index != -1) {
            System.out.println(searchItem + " found at index: " + index);
        } else {
            System.out.println(searchItem + " not found");
        }

        // Convert ArrayList to Array

        ArrayList<Integer> array= new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        System.out.println("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }


    }
}
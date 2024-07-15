import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {

        List<Integer> list1= List.of(2,3,5,4,6);
        //we can not add element in list of operator
        //print using for each loop
        //list1.add(10);
        System.out.println(list1);
        for (int item:list1
             ) {
            System.out.println(item);
        }

        List<Integer> list2=new ArrayList<>();
        list2.add(9);
        list2.add(3);
        list2.add(6);
        list2.add(5);
        list2.add(4);
        System.out.println(list2);
        //show item using stream
        Stream<Integer>streamItem= list2.stream();
        streamItem.forEach(e->{System.out.println(e);});


        List<Integer> list3= Arrays.asList(23,32,45,67,54);
        //create a new list from list2 separating the even items without stream
        List<Integer>evenItems=new ArrayList<>();
        for (Integer item:list2
             ) {
            if(item%2==0){
                evenItems.add(item);
            }
        }
        System.out.println(evenItems);
        //perform this operation using stream
        Stream<Integer> stream = list2.stream();
        List<Integer> newList = stream.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newList);//even elements from list2
    }
}
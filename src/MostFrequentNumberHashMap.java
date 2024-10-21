import java.util.HashMap;
import java.util.Map;

public class MostFrequentNumberHashMap {
    public int mostFrequent(int[]nums){
        //create hashmap to store frequency of each number
        Map<Integer,Integer>frequency=new HashMap<>();

        //iterate through the array and count the occurrence of each number
        for (int num:nums){
            frequency.put(num,frequency.getOrDefault(num,0)+1);
        }
        //variable to track the most frequent number and its frequency
        int mostFrequent=nums[0];
        int maxFrequency=0;
        //iterate through the most frequency map and to find most frequent number
        for (Map.Entry<Integer,Integer>entry:frequency.entrySet()){
            if (entry.getValue()>maxFrequency){
                mostFrequent=entry.getKey();
                maxFrequency=entry.getValue();
            }
        }
        return mostFrequent;


    }
}

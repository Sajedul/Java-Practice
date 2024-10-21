import java.util.Arrays;

public class MostFrequentNumberInArray {

    /*Sorting the array: By sorting the array, all occurrences of each number will be grouped together, making it easier to count consecutive numbers.
Counting consecutive occurrences: We iterate through the sorted array and count how many times each number appears consecutively.
Tracking the most frequent number: We track the number that appears the most frequently while traversing the array*/
    public int mostFrequentNumber(int[]nums){
        Arrays.sort(nums);
        //varibale to track frequency
        int mostFrequent = nums[0];
        int currentNumber=nums[0];
        int currentFrequency=1;
        int maxFrequency=1;

        for (int i=1;i<nums.length;i++){
            if (nums[i]==currentNumber){
                currentFrequency++;
            }else {
                if (currentFrequency>maxFrequency){
                    maxFrequency=currentFrequency;
                    mostFrequent=currentNumber;
                }
                currentNumber=nums[i];
                currentFrequency=1;
            }
        }
        if (currentFrequency>maxFrequency){
            mostFrequent=currentNumber;
        }
        return mostFrequent;

    }
}

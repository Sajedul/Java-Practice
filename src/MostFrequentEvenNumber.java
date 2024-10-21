import java.util.Arrays;

public class MostFrequentEvenNumber {
    public static int  mostFrequentEven(int[]nums){

        int maxFrequency=0;
        int smallestEven=-1;

        for(int i=0;i<nums.length;i++){
            if (nums[i]%2==0){
                int frequency =0;
                for (int j=0;j<nums.length;j++){
                    if (nums[j]==nums[i]){
                        frequency++;
                    }
                }
                if (frequency>maxFrequency ||(frequency==maxFrequency && nums[i]<smallestEven)){
                    maxFrequency=frequency;
                    smallestEven=nums[i];
                }
            }
        }
        return smallestEven;
    }
}

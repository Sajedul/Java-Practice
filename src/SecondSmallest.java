import java.util.Arrays;

public class SecondSmallest {

    /*Algorithm Steps:
Handle Edge Cases:

If the array has fewer than 2 elements, it's not possible to find the second smallest, so handle this case upfront.
Initialize Two Variables:

smallest to store the smallest element.
secondSmallest to store the second smallest element.
Traverse the Array:

For each element, check if it is smaller than the current smallest element. If it is, update the second smallest element to the current smallest, and update the smallest to the current element.
If the element is not smaller than the smallest but is smaller than the second smallest, update the second smallest.
Return the Result:

At the end of the iteration, the second smallest element will be stored in secondSmallest.*/
    public int secondSmallest(int[] nums){

        //use sorting
//        Arrays.sort(nums);
//        return  nums[1];
        //without sorting
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        for (int num:nums){
            if (num<smallest){
                secondSmallest=smallest;
                smallest=num;
            } else if (num<secondSmallest && num!=smallest) {
                secondSmallest = num;
            }
        }
        return  secondSmallest;
    }
}

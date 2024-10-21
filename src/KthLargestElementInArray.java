import java.util.Arrays;

public class KthLargestElementInArray {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);//sorts in ascending order
        return nums[nums.length-k];
    }
}

/*
Input 1:

Array: [3, 2, 1, 5, 6, 4]
Sorted Array: [1, 2, 3, 4, 5, 6]
The 2nd largest element is at index 6 - 2 = 4: 5. */

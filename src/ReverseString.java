public class ReverseString {

    /*Explanation of the Code:
charArray = str.toCharArray();
This converts the string into a character array so that you can modify it.

while (left < right)
The loop runs as long as the left pointer is less than the right pointer. Inside the loop, characters at these positions are swapped.

Swap logic:
A temporary variable (temp) is used to facilitate swapping the values at the left and right pointers.

After the loop finishes:
The array is converted back into a string using new String(charArray) and returned*/

    public String reverse(String str){
        //convert string to a character
        char[] charArray=str.toCharArray();
        //initialize to pointers
        int left = 0;
        int right =charArray.length-1;
        //Swap character until the left pointer meets the right pointer
        while (left<right){
            char temp=charArray[left];
            charArray[left]=charArray[right];
            charArray[right]=temp;

            //move pointer towards each other
            left++;
            right--;
        }
        //convert character array back to string
        return new String(charArray);
    }
}

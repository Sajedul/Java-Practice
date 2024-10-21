public class LargestOddNumberString {
    public static String largestOddNumber(String num){
        //traverse the string from the last character to the first
        for (int i=num.length()-1;i>=0;i--){
            char c =num.charAt(i);
            //check if the current character is an odd digit
            if (c=='1'||c=='3'||c=='5'||c=='7'||c=='9'){
                //return the substring from the start to the current odd digit
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}

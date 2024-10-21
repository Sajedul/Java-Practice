public class SumOfDigits {
    public int digitSum(int num){
        if(num==0){
            return 0;
        }
        else {
            return num%10+digitSum(num/10);
        }
    }
}

public class SummationOfPrime {
    public int summationOfPrime(int end){
        int sum=0;
        for (int i=2;i<=end;i++){
           int isPrime=1;
           for (int j=2;j<=i/2;j++){
               if (i%j==0){
                   isPrime=0;
                   break;
               }
           }
           if (isPrime==1){
               sum +=i;
           }
        }
        return sum;
    }
}

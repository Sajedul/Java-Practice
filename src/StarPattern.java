public class StarPattern {
    public void starPattern(int n){
        for (int i=n;i>0;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

public class PatternQ11 {
    public static void main(String args[]){
        int t = 5;
        for(int i=1;i<=5;i++){
            for(int s=t;s>=1;s--){
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            t--;


            System.out.println(" ");

        }
    }
}

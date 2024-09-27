public class PatternQ14 {
    public static void main(String args[]){
        int t = 5;
        int c = 1;
        for(int i=1;i<=5;i++){
            for(int s=t;s>=1;s--){
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++){
                System.out.print(" "+ c );
                c++;
            }
            t--;



            System.out.println(" ");

        }


}
}

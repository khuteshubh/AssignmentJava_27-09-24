public class PatternQ13 {
    public static void main(String args[]) {
        int t = 5;
        for (int i = 1; i <= 5; i++) {
            for (int s = t; s >= 1; s--) {
                System.out.print(" ");

            }
            for (int j = 0; j < i; j++) {
                System.out.print(i +j +" ");
            }
            t--;


            System.out.println(" ");

        }
    }
}

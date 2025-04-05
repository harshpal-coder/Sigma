import java.util.Scanner;
 public class oddeven {
    public static void oddoreven(int n){
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            //even number
            System.out.println(" number is EVEN");
        } else {
            System.out.println("number is ODD");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        oddoreven(n);
    }
    
}
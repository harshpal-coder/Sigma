import java.util.Scanner;

public class getbit {
    public static int getithbit(int n, int i){
        int bitMask = 1<<i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int i =  sc.nextInt();
        System.out.println(getithbit(n, i));
    }
    
}
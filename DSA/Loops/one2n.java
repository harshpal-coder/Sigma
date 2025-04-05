import java.util.Scanner;

public class one2n {
    public static void main(String[] args) {
        System.err.println("enter number ");
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int j = sc.nextInt();
        while (i<=j) {
            System.out.println(" " + i);
            i++;
        }
    }
}

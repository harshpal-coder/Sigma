import java.util.Scanner;

public class largestof3 {
    public static void main(String[] args) {
        Scanner lar = new Scanner(System.in);
        int A = lar.nextInt();
        int B = lar.nextInt();
        int C = lar.nextInt();
        if (A>=B && A>=C) {
            System.out.println("A is largest");
        }
        else if(B>=A && B>=C) {
            System.out.println("B is largest");
        }
        else {
            System.out.println("C is largest");
        }
    }

}

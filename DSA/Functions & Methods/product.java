import java.util.Scanner;

public class product {
    public static int produc(int num1 , int num2){
        int multi=num1*num2;
        return multi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int multi= produc(a, b);
        System.out.println("product of two numbers are : " + multi);
    }
}
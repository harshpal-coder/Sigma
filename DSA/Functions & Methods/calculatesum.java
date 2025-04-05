import java.util.Scanner;

public class calculatesum {
    public static int calcu(int num1,int num2){
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for A");
        int a = sc.nextInt();
        System.out.println("enter the value for B");
        int b = sc.nextInt();
        // int sum = calcu(a, b);
        System.out.println("the sum of your numbers is : " + calcu(a, b));
    }
}

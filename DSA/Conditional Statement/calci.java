import java.util.Scanner;

public class calci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A : ");
        int A = sc.nextInt();
        System.out.println("Enter B : ");
        int B = sc.nextInt();
        System.out.println("Enter Operator : ");
        char operator = sc.next().charAt(0);
        //Switch Statement 

        switch (operator) {
            case '+':
                System.out.println(A+B);
                break;
            case '-':
                System.out.println(A-B);
                break;
            case '*':
                System.out.println(A*B);
                break;
            case '/':
                System.out.println(A/B);
                break;
            case '%':
                System.out.println(A%B);
                break;
        
            default:
                System.out.println("number is invalid");
                break;
        }

    }
}

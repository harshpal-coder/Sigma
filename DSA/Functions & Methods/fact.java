import java.util.Scanner;

public class fact {
    public static int factorial(int n){
        int f =1;
        for(int i=1;i<=n;i++){
            f = f * i;
        }
        return f; //factorial of n
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int facto = sc.nextInt();
        System.out.println(factorial(facto));
    }
}

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n==2) {
         System.out.println("your number is a prime number ");
        }
        else{
            boolean isPrime = true;
        for(int i = 2 ;i <=Math.sqrt(n);i++){
            if (n%i==0) {
                isPrime = false;
            }
        }
        if (isPrime == true){
            System.out.println("your number is prime number");
        } else {
            System.out.println("your number is a non prime number");
        }
        }
        
        
    }
}

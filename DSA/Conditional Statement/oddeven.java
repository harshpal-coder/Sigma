import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        if( A%2==0 ){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
}

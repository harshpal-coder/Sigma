import java.util.Scanner;

public class concat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String lastName  = sc.next();
        String fullName = firstName + " " + lastName;
        System.out.print(fullName +" ");
    }
}

import java.util.Scanner;

public class javabasics {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine();
            System.out.println(input);
        }


    }
}
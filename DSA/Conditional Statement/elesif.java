import java.util.Scanner;

public class elesif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("you are adult");
        }
        else if ( age>=13 && age<=18 ) {
            System.out.println("welcome to teenage generation");
        }
        else{
            System.out.println("still u are a child ");
        }
    }
}

import java.util.Scanner;

public class arrayio {

    public static void main(String[] args) {
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();
        marks[4] = sc.nextInt();
        marks[5] = sc.nextInt();

        System.out.println("marks of maths 1 : " + marks[0]);
        System.out.println("marks of physics :" + marks[1]);
        System.out.println("marks of english :" + marks[2]);
        System.out.println("marks of chemistry : " + marks[3]);
        System.out.println("marks of hindi :" + marks[4]);
        System.out.println("marks of urdu : " + marks[5]);

        System.out.println("length of array " + marks.length);
        

    }
}
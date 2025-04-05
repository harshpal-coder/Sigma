import java.util.Scanner;

public class linearsearch {
    public static int linearsearch1(int number[], int key){
        for (int i = 0;i<number.length;i++){
            if(number[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10,12,14,16};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        int index = linearsearch1(number, key);
        if(index==-1){
            System.out.println("not found");
        }else{
            System.out.println("key is at index: " + index );
        }

    }
}

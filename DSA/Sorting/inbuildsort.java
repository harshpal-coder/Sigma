import java.util.Arrays;
public class inbuildsort {
    public static void main(String[] args) {
        int arr[] = {1,5,2,6,9,3,6,2,8,3,9,6,2,6,9,2,5,7,4,5,6};
        Arrays.sort(arr,0,6);
        for(int i = 0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
        }
    }
}

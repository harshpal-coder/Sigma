import java.util.Arrays;
import java.util.Collections;
public class inbuildrev {
     public static void main(String[] args) {
        Integer arr[] = {1,5,2,6,9,3,6,2,8,3,9,6,2,6,9,2,5,7,4,5,6};
        Arrays.sort(arr,0,6,Collections.reverseOrder());
        for(int i = 0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
        }
     }
}


public class subarray {
    public static void subArrays(int numbers[]){
        int tp = 0;
        for(int i = 0 ; i<numbers.length; i++){
            int start = i;
            for(int j = i;j<numbers.length;j++){
                int end = j;
                for(int k = start; k<=end ; k++){
                    System.out.print(numbers[k] + " ");
                }
                tp++;
                System.out.println();
            }
            System.out.println();

        }
        System.out.println("total number of sub array are : " + tp);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        subArrays(numbers);
    }
}

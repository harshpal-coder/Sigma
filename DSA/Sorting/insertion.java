public class insertion {
    public static void insert(int arr[]){
        for(int i =0;i<arr.length;i++){
            int current = arr[i];
            int prev = i-1;
            //finding out the correct position to insert
            while (prev>=0 && arr[prev]>current) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = current;
        }


    } 
    public static void main(String[] args) {
        int arr[] = {3,6,4,8,6,9,4,2,1,5,7};
        for(int i=0;i<arr.length;i++){
            insert(arr);
            System.out.print(arr[i] + " ");
        }
    }
}

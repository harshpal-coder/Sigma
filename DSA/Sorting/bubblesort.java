public class bubblesort {
    public static void bub(int arr[]){
        // int n = arr.length;
        for(int turn=0;turn<=arr.length-2;turn++){
            for(int j=0;j<=arr.length-2-turn;j++){
                if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                }
            }
        }
    }public static void printArr(int arr[]){
        // int n = arr.length;
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
            
        }
        System.out.println();
    }
   public static void main(String[] args) {
    int arr[] ={5,4,1,3,2};
    bub(arr);
    printArr(arr);
    }
}
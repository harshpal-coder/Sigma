public class occurence {
    public static int firstoccur(int arr[], int key,int i){
        if(i == arr.length ){
            return - 1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstoccur(arr, key, i+1);
    }

    public static void main(String[] args) {
         int arr[] = {3,7,5,7,3,7,8};
         System.out.println(firstoccur(arr, 5, 0));
    }
}

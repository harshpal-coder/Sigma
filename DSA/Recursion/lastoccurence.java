public class lastoccurence {
    public static int lastoccur(int arr[] ,int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isfound = lastoccur(arr, key, i+1);
        if(isfound == -1  && arr[i] == key){
            return i;
        } 
        return isfound;
    }



    public static void main(String[] args) {
        int arr[] = {5,5,5,5};
        System.out.println(lastoccur(arr, 5, 0));
    }
}

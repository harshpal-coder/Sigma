public class overloadingbytype {
    public static int sum(int a , int b){
        return a+b ;
    }
    public static float sum(float a , float b){
        return a+b ;
    }
    public static void main(String[] args) {
        System.out.println(sum(12, 12));
        System.out.println(sum(12.45f, 12.53f));
    }
}

public class naturalno {

    public static int sum(int n){
        if (n == 1) {
            return 1;
        }
        int sumnm1 = sum(n-1);
        int sn = n + sumnm1;
        return sn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));

    }
}

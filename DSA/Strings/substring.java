public class substring {
    public static String substringfun(String str , int si,int ei){
        String substr = "";
        for(int i = 0; i<ei;i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "HarshPal";
        System.out.println(substringfun(str, 0, 4));
        System.out.println(str.substring(0, 5)); //simple method 
    }
}

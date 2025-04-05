import java.util.Scanner;

public class palin {
    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2;i++)
        // int n = str.length();
        if (str.charAt(i) != str.charAt(str.length()-i-1)) {
            return false;   //not a palindrome
        }
        return true;
    }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        isPalindrome(str);
        System.out.println(isPalindrome(str));

    }
}

import java.util.Scanner;

/**
 * Created by shijo on 15/05/2017.
 */
public class PalindromicString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine().trim();
        if (isPalindrome(str)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }

    private static boolean isPalindrome(String string) {
        int i = 0, j = string.length();
        if (string.length() == 1 || string.length() == 0) {
            return true;
        } else {
            if (string.charAt(0) == string.charAt(string.length()-1)) {
                return isPalindrome(string.substring(i+1, j-1));
            } else {
                return false;
            }
        }
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by shijo on 15/05/2017.
 */
public class ToggleCase {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = line.length();
        char[] toggledString = new char[N];

        for (int i = 0; i < N; i++) {
            int iv = (int) line.charAt(i);
            if (iv >= 65 && iv <= 90) {
                iv += 32;
            } else if (iv >= 97 && iv <= 122) {
                iv -= 32;
            }
            toggledString[i] = (char) iv;
        }
        System.out.println(String.valueOf(toggledString));
    }
}

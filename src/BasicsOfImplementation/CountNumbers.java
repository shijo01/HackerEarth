package BasicsOfImplementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by shijo on 17/05/2017.
 */
public class CountNumbers {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine().trim());
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(reader.readLine().trim());
            int count = 0;
            int prePos = -2;
            String str = reader.readLine().trim();
            for (int j = 0; j < n; j++) {
                if (Character.isDigit(str.charAt(j))) {
                    if (!(prePos == j-1))
                        count++;
                    prePos=j;
                }
            }
            builder.append(count).append("\n");
        }
        System.out.print(builder.toString().trim());
    }
}

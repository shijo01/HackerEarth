package BasicInputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by shijo on 17/05/2017.
 */
public class SeatingArrangement {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine().trim());
        StringBuilder builder = new StringBuilder();

        for (int i = 1; i <= t; i++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());
            int ch = n % 12;
            switch (ch) {
                case 0:
                    n -= 11;
                    builder.append(n + " WS\n");
                    break;
                case 1:
                    n += 11;
                    builder.append(n + " WS\n");
                    break;
                case 2:
                    n += 9;
                    builder.append(n + " MS\n");
                    break;
                case 3:
                    n += 7;
                    builder.append(n + " AS\n");
                    break;
                case 4:
                    n += 5;
                    builder.append(n + " AS\n");
                    break;
                case 5:
                    n += 3;
                    builder.append(n + " MS\n");
                    break;
                case 6:
                    n += 1;
                    builder.append(n + " WS\n");
                    break;
                case 7:
                    n -= 1;
                    builder.append(n + " WS\n");
                    break;
                case 8:
                    n -= 3;
                    builder.append(n + " MS\n");
                    break;
                case 9:
                    n -= 5;
                    builder.append(n + " AS\n");
                    break;
                case 10:
                    n -= 7;
                    builder.append(n + " AS\n");
                    break;
                case 11:
                    n -= 9;
                    builder.append(n + " MS\n");
                    break;
            }
        }
        System.out.println(builder.toString().trim());
    }
}

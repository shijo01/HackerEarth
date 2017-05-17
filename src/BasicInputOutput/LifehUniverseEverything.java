package BasicInputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by shijo on 17/05/2017.
 */
public class LifehUniverseEverything {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        int n;
        while (((n = Integer.parseInt(reader.readLine().trim())) != 0) && (n != 42)) {
            builder.append(n);
            builder.append("\n");
        }
        System.out.println(builder.toString().trim());
    }
}

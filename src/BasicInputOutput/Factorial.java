package BasicInputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by shijo on 17/05/2017.
 */
public class Factorial {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        System.out.println(factorial(N));

    }

    private static int factorial(int n) {
        if (n == 1) {
            return n;
        } else {
            return n * factorial(n - 1);
        }
    }
}

package BasicInputOutput;

import java.util.Scanner;

/**
 * Created by shijo on 16/05/2017.
 */
public class CountDivisors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().trim().split(" ");

        int l = Integer.parseInt(line[0]);
        int r = Integer.parseInt(line[1]);
        int k = Integer.parseInt(line[2]);
        int count = 0;
        for (int i = l; i <= r; i++) {
            if (i % k == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}

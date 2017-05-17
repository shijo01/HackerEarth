package BasicInputOutput;

import java.util.Scanner;

/**
 * Created by shijo on 15/05/2017.
 * You have been given an array A of size N consisting of positive integers.
 * You need to find and print the product of all the number in this array Modulo 10^9 + 7
 */
public class FindProduct {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        s.nextLine();
        String input = s.nextLine().trim();
        String[] numbers = input.split(" ");

        double answer = 1;
        double k = Math.pow(10, 9) + 7;

        for (String token : numbers) {
            answer = (answer * Integer.parseInt(token)) % (k);
        }
        System.out.println((int)answer);
    }
}

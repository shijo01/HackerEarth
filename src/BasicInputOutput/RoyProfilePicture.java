package BasicInputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by shijo on 16/05/2017.
 */
public class RoyProfilePicture {
    public static void main(String[] args) throws Exception {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        Scanner scanner = new Scanner(System.in);
//        int L = scanner.nextInt();
        int L = Integer.parseInt(bufferedReader.readLine().trim());
//        scanner.nextLine();
//        int N = scanner.nextInt();
        int N = Integer.parseInt(bufferedReader.readLine().trim());
//        scanner.nextLine();

        for (int i=0; i<N; i++) {
//            String[] line = scanner.nextLine().trim().split(" ");
            String[] line = bufferedReader.readLine().trim().split(" ");
            int W = Integer.parseInt(line[0]);
            int H = Integer.parseInt(line[1]);

            if (W < L || H < L) {
                System.out.println("UPLOAD ANOTHER");
            } else if ( W >= L && H >= L) {
                if (W==H) {
                    System.out.println("ACCEPTED");
                } else {
                    System.out.println("CROP IT");
                }
            }

        }
    }
}

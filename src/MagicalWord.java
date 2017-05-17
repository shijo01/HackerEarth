import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by shijo on 16/05/2017.
 */
public class MagicalWord {
    private int[] nearPrime = new int[128];

    public MagicalWord() {
        initNearPrime();
    }


    private void initNearPrime() {
        for (int i = 0; i < 128; i++) {
            this.nearPrime[i] = findNearPrime(i);
        }
    }

    private int getNearPrime(char c) {
        return nearPrime[(int) c];
    }

    private int findNearPrime(int alphabet) {
        int i = alphabet;
        int nextPrime, prevPrime;
        while (!isPrime(i)) {
            i++;
        }
        nextPrime = i;
        i = alphabet;
        while (!isPrime(i)) {
            i--;
        }
        prevPrime = i;

        if (nextPrime - alphabet < alphabet - prevPrime) {
            return nextPrime;
        } else if (nextPrime - alphabet >= alphabet - prevPrime) {
            return prevPrime;
        } else {
            return 0;
        }

    }

    private boolean isPrime(int n) {
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        int i = 5, w = 2;
        while (i * i <= n) {
            if (n % i == 0) {
                return false;
            }
            i += w;
            w = 6 - w;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine().trim());
        MagicalWord magicalWord = new MagicalWord();
        for (int i = 0; i < T; i++) {
            int len = Integer.parseInt(bufferedReader.readLine().trim());
            String str = bufferedReader.readLine().trim();
            for (int j = 0; j < len; j++) {
                System.out.print((char) magicalWord.getNearPrime(str.charAt(j)));
            }
            System.out.println();
        }

    }
}

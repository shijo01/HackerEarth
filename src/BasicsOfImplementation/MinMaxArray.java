package BasicsOfImplementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by shijo on 17/05/2017.
 */
public class MinMaxArray {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine().trim());
        Integer [] numbers = new Integer[N];
        String[] data = reader.readLine().trim().split(" ");
        for(int i=0;i<N;i++) {
            numbers[i] = Integer.parseInt(data[i].trim());
        }

        Arrays.sort(numbers);
        if (numbers[N-1] - numbers[0] > N-1) {
            System.out.println("NO");
            return;
        }

        Set set = new HashSet<Integer>(Arrays.asList(numbers));
        if (set.size() == numbers[N-1]) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}

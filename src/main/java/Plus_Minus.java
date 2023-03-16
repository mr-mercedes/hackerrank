import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Plus_Minus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }

    class Result {

        /*
         * Complete the 'plusMinus' function below.
         *
         * The function accepts INTEGER_ARRAY arr as parameter.
         */

        public static void plusMinus(List<Integer> arr) {
            int counterPositive = 0;
            int counterNegative = 0;
            int counterZero = 0;

            for (Integer integer : arr) {
                if (integer != 0) {
                    if (integer > 0) {
                        counterPositive++;
                    } else {
                        counterNegative++;
                    }
                } else {
                    counterZero++;
                }
            }

            int size = arr.size();
            System.out.println((float) counterPositive / size);
            System.out.println((float) counterNegative / size);
            System.out.println((float) counterZero / size);
        }

    }
}

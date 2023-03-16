import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mini_Max_Sum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }

    class Result {

        /*
         * Complete the 'miniMaxSum' function below.
         *
         * The function accepts INTEGER_ARRAY arr as parameter.
         */

        public static void miniMaxSum(List<Integer> arr) {
            if (arr.size() == 0) {
                System.out.println(0);
                return;
            }

            Collections.sort(arr);

            long minSum = sum(arr, true);
            long maxSum = sum(arr, false);

            System.out.println(minSum + " " + maxSum);
        }

        static long sum(List<Integer> arr, boolean marker){
            long sum = 0;
            if (marker){
                for (int i = 0; i < arr.size() - 1; i++) {
                    sum += arr.get(i);
                }
            } else {
                for (int i = 1; i < arr.size(); i++) {
                    sum += arr.get(i);
                }
            }
            return sum;
        }
    }
}

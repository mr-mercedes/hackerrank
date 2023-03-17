import java.io.*;
import java.util.*;

public class Lonely_Integer {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        int result = Result.lonelyInteger(a);

        System.out.println(result);

        bufferedReader.close();

    }

    class Result {

        /*
         * Complete the 'lonelyinteger' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts INTEGER_ARRAY a as parameter.
         */

        public static int lonelyInteger(List<Integer> a) {
            Map<Integer, Integer> map = new HashMap<>();
            map.put(a.get(0), 1);
            for (int i = 1; i < a.size(); i++) {
                Integer key = a.get(i);
                if (map.containsKey(key)){
                    Integer value = map.get(key);
                    value++;
                    map.replace(key,value);
                } else {
                    map.put(key,1);
                }
            }

            int ans = 0;
            for (int i = 0; i < a.size(); i++) {
                if (map.get(a.get(i)) == 1){
                    ans = a.get(i);
                }
            }
            return ans;
        }

    }
}

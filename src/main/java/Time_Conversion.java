import java.io.*;

public class Time_Conversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        System.out.println(result);
    }

    static class Result {

        /*
         * Complete the 'timeConversion' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts STRING s as parameter.
         */

        public static String timeConversion(String s) {
            int hours = Integer.parseInt(s.substring(0, 2));
            String minutes = s.substring(3, 5);
            String seconds = s.substring(6, 8);
            String partDay = s.substring(s.length() - 2);


            if (partDay.equalsIgnoreCase("AM")){
                if (hours == 12) {
                    hours = 0;
                }
            } else {
                if (hours != 12){
                    hours = hours + 12;
                }
            }

            return String.format("%02d:%s:%s", hours, minutes, seconds);
        }

    }
}

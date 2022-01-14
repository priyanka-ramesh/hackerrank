import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr1) {
    // Write your code here
List<Integer> arr = arr1.stream().sorted().collect(Collectors.toList());
  int minIndex = 0;
        int maxIndex = 1;
        long min = 0;
        long max = 0;
        while(maxIndex < arr.size()){
            min = min + arr.get(minIndex);
            minIndex++;
            max = max + arr.get(maxIndex);
            maxIndex++;
        }

        System.out.print(min + " " + max);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}

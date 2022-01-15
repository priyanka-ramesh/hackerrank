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
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> arr1) {
    // Write your code here
   List<Integer> arr =arr1.stream().sorted().collect(Collectors.toList());     
   int x=0;
 int n= arr.size();
 int output =01;
 if( n==1){
     output = arr.get(0);

 }
 else{
     n= arr.size()-1;
   //  System.out.println(n);
 for (int i=1;i<n;i++){
     x=arr.get(i-1);
     if(arr.get(i)==x || arr.get(i)==arr.get(i+1) ){
         
     }
     else {
         output=arr.get(i);
         break;
     }
 }
 if(output ==01){
     output=arr.get(arr.size()-1);
 }
     
 }
    return output; }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.lonelyinteger(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

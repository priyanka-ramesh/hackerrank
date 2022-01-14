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
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
String s1="" ;
int p =Integer.parseInt(s.substring(0,2));
if(s.contains("PM") ){
    if( (p<12)){
 s1 =Integer.toString(p+12)+s.substring(2,8);       
    }
    //System.out.println( s.substring(0,2));
 else{
        s1=s.substring(0,8);
 }
//System.out.println();
}
else if (s.contains("AM")){
    if(p==12){
 s1="00"+s.substring(2,8);       
    }
 else{
      //System.out.println( );
      s1=s.substring(0,8);
 }
}
   
 
 return s1 ;   }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

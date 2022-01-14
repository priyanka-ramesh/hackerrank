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
import java.util.stream.Collectors;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr1) {
    // Write your code here
        float p=0;
        float n=0;
        float z=0;
List<Integer> arr = arr1.stream().sorted().collect(Collectors.toList());     
 int pq=arr.indexOf(0);


//System.out.println(pq);
 int pq1=arr.lastIndexOf(0);

//System.out.println(pq1);
if(pq ==-1){
Collections.reverse(arr);
/*  List<Integer> arr2 = arr.stream().sorted().collect(Collectors.toList());   
  */
   //System.out.println(arr.get(0));
    
z= 0;
p=arr.stream()
            .filter((s) -> Integer.toString(s).contains("-"))
            .limit(1)
  
            .map(arr::indexOf)
            .findFirst().orElse(-1);
if(p<0){
    p=arr.size();
    n=0;
}
else{
n = arr.size()-p;       
}
            
             
             


//System.out.println(arr.size()-1 );
     p/= arr.size();
        n/= arr.size();
       
       
}
else if (pq==pq1){
    z=1;
    p=arr.size()-(pq1+1);
    n=pq;
    p/= arr.size();
        n/= arr.size();
        z/= arr.size();
    }
else {
   //System.out.print(pq+"\n"+pq1);
    z=((pq1+1)-(pq));
    p=arr.size()-(pq1+1);
    n=pq;
        p/= arr.size();
        n/= arr.size();
        z/= arr.size();
    
}

/*for(int i=0;i<arr.size();i++){
//System.out.println(arr.get(i));
            if(arr.get(i) == 0){
                z++;
            }
            else{
                if(arr.get(i) > 0){
                    p++;
                }
                else{
                    n++;
                }
            }
        }

*/
        System.out.printf("%.6f",p);
        System.out.print("\n");
        System.out.printf("%.6f",n);
        System.out.print("\n");
        System.out.printf("%.6f",z);
 
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}

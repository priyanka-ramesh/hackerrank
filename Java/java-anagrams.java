import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
                a=a.toUpperCase();
        b=b.toUpperCase();

           char []arr = a.toCharArray(); 
              java.util.Arrays.sort(arr);
              a=String.valueOf(arr);
           char []arr1 = b.toCharArray(); 
            java.util.Arrays.sort(arr1);
      
            b=String.valueOf(arr1);
            //System.out.println(a);
            //System.out.println(b);
            boolean output;
if(a.equals(b)){
output =true;
}
else{
    output =false;
}
    return output; 
    }

  public static void main(String[] args) {

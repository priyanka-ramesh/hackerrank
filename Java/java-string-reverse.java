import java.io.*;
import java.util.*;
import java.lang.*; 

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
         StringBuilder input1 = new StringBuilder(A); 
         StringBuilder input2 = new StringBuilder(A); 


  
        /* Enter your code here. Print output to STDOUT.
         System.out.println(input2);
                  System.out.println(input1);

         System.out.println(Output);
 */
        StringBuilder Output = input1.reverse();
       
        if (input2.toString().equals(Output.toString())){
            System.out.println("Yes");
        }
            else
            {
                System.out.println("No");
            }
        
    }
}




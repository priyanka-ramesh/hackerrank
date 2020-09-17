import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
              
          /* Check special cases */
      try{        String s = scan.nextLine();

s=s.trim();  
 if (s.length() == 0) {
            System.out.println(0);
            return;
        }
        
        if (s.length() > 0){
                    String arr[] = s.split("[^a-zA-Z]+");

            System.out.println(arr.length) ;
            for(int i=0;i<arr.length;i++){
                
                System.out.println(arr[i].trim());
                }
        }
        else{
            System.out.println(0) ;

        }
      }  catch(Exception e){
 System.out.println(0) ;
           }
         
                
        scan.close();
    }
}


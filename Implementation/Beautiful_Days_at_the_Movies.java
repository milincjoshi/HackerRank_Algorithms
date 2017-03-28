import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Beautiful_Days_at_the_Movies {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int beautiful_days = 0;
        
        for(int i = a; i<=b;i++){
            int reversed_i = reverse(i);
            double diff = (double)Math.abs((i - reversed_i))/c;
             if(diff == (int)diff){
                beautiful_days++;
            }
        }
        
        System.out.println(beautiful_days);
    }
    
    public static int reverse(int n){
      
        String number = Integer.toString(Integer.valueOf(n));
        String newNumber ="";
        
        for(int i=number.length()-1; i>=0; i--){
            newNumber+=number.charAt(i);
        }
        
        int new_number = Integer.parseInt(newNumber);
      
        return new_number;
    }
}
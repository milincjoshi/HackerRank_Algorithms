import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sherlock_and_Squares {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   
    
        Scanner scan = new Scanner(System.in);
        int test_cases = scan.nextInt();
        
        for(int i=0; i<test_cases;i++){
            long a = scan.nextLong();
            long b = scan.nextLong();
            
            int count = 0;
            long squareOne = a;
            
            for(long j=a; j<=b;j++){                
            
                if(Math.sqrt(j) == (long)Math.sqrt(j) ){
                    count++;
                    squareOne = (long)Math.sqrt(j);
                    //System.out.println(squareOne+" so");
                    break;
                }                
            }
            squareOne++;
            while(squareOne*squareOne<=b){
                count++;
                squareOne++;
            }
            
            System.out.println(count);
        }
    }
}
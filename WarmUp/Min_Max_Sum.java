import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Min_Max_Sum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        
        long sum = a+b+c+d+e;
        
        long max = 0;
        long min;
        
        if(sum - a > max){
            max = sum -a;   
        }if(sum - b > max){
            max = sum -b;   
        }if(sum - c > max){
            max = sum -c;   
        }if(sum - d > max){
            max = sum - d;   
        }if(sum - e > max){
            max = sum -e;   
        }
        
        min = max;
        if(sum - a < min){
            min = sum -a;   
        }if(sum - b < min){
            min = sum -b;   
        }if(sum - c < min){
            min = sum -c;   
        }if(sum - d < min){
            min = sum - d;   
        }if(sum - e < min){
            min = sum -e;   
        }
        
        System.out.println(min+" "+max);
    }
}

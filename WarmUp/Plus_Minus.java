import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Plus_Minus {

    static int positiveCount = 0;
    static int negativeCount = 0;
    static int zeroCount = 0;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        for(int i = 0; i<n;i++){
            if(arr[i]>0) positiveCount++;
            if(arr[i]<0) negativeCount++;
            if(arr[i] == 0) zeroCount++;
        }
        
        double negativeFraction = (double)negativeCount/n;
        double positiveFraction = (double)positiveCount/n;
        double zeroFraction = (double)zeroCount/n; 
        
        System.out.println(String.format("%6f",positiveFraction));
        System.out.println(String.format("%6f",negativeFraction));
        System.out.println(String.format("%6f",zeroFraction));
        
    }
}

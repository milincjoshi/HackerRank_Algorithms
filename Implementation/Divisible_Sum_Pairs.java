import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Divisible_Sum_Pairs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        //HashMap<>
        
        int pairCount = 0;    
        for(int i = 0; i<n;i++){
            for(int j = i+1; j<n;j++){
                if((a[i]+a[j])%k == 0 && i<j && a[i]>=1 && a[i]<=100 && n>=2 && n<=100 && k<=100 && k>=1){
                    //System.out.println(i+" "+j);
                    pairCount++;
                }
            }
        }
         System.out.println(pairCount);
       
    }
        
        
    
}

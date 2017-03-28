import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Bon_Appetit {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        
        int[] items = new int[n];
        for(int i=0;i<n;i++){
            items[i] = scan.nextInt();            
        }
        
        int charge_to_anna = scan.nextInt();
        
        int sum = 0;
        for(int i=0;i<n;i++){
            if(i!=k){
                sum+=items[i];            
            }
        }
        
        int fair_split = sum/2;
        
        if(fair_split != charge_to_anna){
            System.out.println(charge_to_anna - fair_split);
        }
        else{
            System.out.println("Bon Appetit");
        }
        
    
    }
}
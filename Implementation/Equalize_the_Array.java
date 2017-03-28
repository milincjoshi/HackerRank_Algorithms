import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Equalize_the_Array {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for(int i=0; i<n;i++){
            int j = scan.nextInt();
            
            if(hm.containsKey(j)){
                int value = hm.get(j);
                hm.put(j,value+1);
            }
            else{
                hm.put(j,1);
            }            
        }
        
        
        int max_count = 0;
        for(Integer i : hm.keySet()){
            int value = hm.get(i);
            if(value>max_count){
                max_count = value;
            }
        }
        
        System.out.println(n-max_count);
        
    }
}
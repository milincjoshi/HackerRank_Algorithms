import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sock_Merchant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        int count_pair = 0;
        for(int i=0; i<n;i++){
            if(hm.containsKey(c[i])){
                hm.remove(c[i]);
                count_pair++;
            }
            else{
                hm.put(c[i],0);
            }
        }
        
        System.out.println(count_pair);
    }
}

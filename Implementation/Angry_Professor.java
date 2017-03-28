import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Angry_Professor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            
            int presentCounter = 0;
            
            for(int i=0; i<n;i++){
                if(a[i]<=0 ){
                    presentCounter++;
                }
            }
            
            if(presentCounter<k){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}

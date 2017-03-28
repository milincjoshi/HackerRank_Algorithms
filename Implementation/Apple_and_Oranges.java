import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Apple_and_Oranges {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //house points
        int s = in.nextInt();
        int t = in.nextInt();
        
        //tree points
        int a = in.nextInt();
        int b = in.nextInt();
        
        //apples
        int m = in.nextInt();
        
        //oranges
        int n = in.nextInt();
        
        int apple_count =0;
        int orange_count =0;
        
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            if(apple[apple_i] >0){
                int distance = a+apple[apple_i];
                if(distance>=s && distance <=t){
                    apple_count++;
                }
            }
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            if(orange[orange_i] <0){
                int distance = b+orange[orange_i];
                if(distance>=s && distance <=t){
                    orange_count++;
                }
            }
        }
        
        System.out.println(apple_count);
        System.out.println(orange_count);
        
        
    }
}

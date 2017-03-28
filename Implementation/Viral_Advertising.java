import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Viral_Advertising {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
    
        int init = 5;
        
        int sum = 0;
        for(int i=1;i<=n;i++){
            //System.out.println(i+" "+init);
            int liked = (int)Math.floor(init/2);
            init = liked*3;
            sum+=liked;
        }
        
        System.out.println(sum);
        
        
    }
}
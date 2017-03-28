import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Repeated_String {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        
        long count=0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i) == 'a'){
                count++;
            }
        }
        
        long rem = n%s.length();
        
        long quo = n/s.length();
        
        count = count * quo;
        
        for(int i=0; i<rem;i++){
            if(s.charAt(i) == 'a'){
                count++;
            }
        }

        System.out.println(count);
        
        
    }
}

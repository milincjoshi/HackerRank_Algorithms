import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Mars_Exploration {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        
        
        int unaffected = 0;
        for(int i=0; i<S.length(); i=i+3){
            if(S.charAt(i) == 'S'){
                unaffected++;
            }
            if(S.charAt(i+1) == 'O'){
                unaffected++;
            }
            if(S.charAt(i+2) == 'S'){
                unaffected++;
            }
           
                 
        }
        
        System.out.println(S.length() - unaffected);
    }
}

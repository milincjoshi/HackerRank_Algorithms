import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CamelCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        

        int word_count = 0;
        for(int i=0; i<s.length(); i++){
            if((int)s.charAt(i) >=65 &&(int)s.charAt(i) <=90){
                 word_count++;
            }
        }
        word_count++;
        System.out.println(word_count);
    }
}

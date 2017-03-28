import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Find_Digits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            
            try{
                
                String x = Integer.toString(Integer.valueOf(n));
                int counter = 0;
                for(int i=0; i<x.length(); i++){
                    if(x.charAt(i) == '0'){
                        continue;
                    }
                    if(n%Integer.parseInt(x.charAt(i)+"") == 0){
                        counter++;
                    }
                }
                System.out.println(counter);
            }
            catch(ArithmeticException ex){
                //ex.printStackTrace();
                continue;
            }
            
        }
        
        
    }
}

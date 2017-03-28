import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Library_Fine {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();
        
        if(y1<y2){
            System.out.println(0);
        }
        
        if(y1 == y2){
            if(m1<m2){
                System.out.println(0);
            }
            if(m1 == m2){
                if(d1<=d2){
                    System.out.println(0);
                }
                else //  days late
                {
                    System.out.println(15 * (d1-d2) );
                }
            }
            if(m1>m2) // month late
            {
                System.out.println(500 * (m1-m2) );
            }
        }
        if(y1>y2) // year late
        {
            System.out.println(10000 * (y1-y2) );
        }
    }
}

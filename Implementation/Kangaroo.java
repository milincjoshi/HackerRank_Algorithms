import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kangaroo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        
        boolean meet = false;
        int i=0;
        while(i<=10000){
             
            if(x1 == x2){
                meet = true;
                break;
            }
            x1+=v1;
            x2+=v2;
            i++;
        }
        
        if(meet){System.out.println("YES");}
        else{System.out.println("NO");}
    }
}
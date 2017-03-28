import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=n;i++){
            
            for(int space=0;space<n-i;space++){
                System.out.print(" ");
            }
            for(int hash=0;hash<i;hash++){
                System.out.print("#");
            }
            System.out.print("\n");
            
            //int 6
            //5 spaces 0 #
            //4 spaces 1 #
            //3 spaces 2 #
            //2 spaces 3 #
            //1 spaces 4 #
            //0 spaces 5 #
        }
    }
}

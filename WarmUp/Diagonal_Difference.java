import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Diagonal_Difference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        
        int diagonal1 = 0;
        for(int i=0;i<n;i++){
            diagonal1 = diagonal1 + a[i][i];
        }
        //System.out.println("diagonal1 "+diagonal1);
        int diagonal2 = 0;
        for(int i=0; i<n;i++){
            diagonal2 = diagonal2 + a[i][n-i-1];
        }
        //System.out.println("diagonal2 "+diagonal2);
        int diff = Math.abs(diagonal1 - diagonal2);
        System.out.println(diff);
    }
}

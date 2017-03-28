import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Extra_Long_Factorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        System.out.println(factorial(BigInteger.valueOf(n)));
    
    }
    
 
    static BigInteger factorial(BigInteger n){
        if(n.equals(BigInteger.ONE)){
            return BigInteger.ONE;
        }
        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Time_Conversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
    
        int hours,minutes, seconds;
        String[] time_arr = time.split(":");
        if(time.contains("AM")){
            hours = Integer.parseInt(time_arr[0]);
            minutes = Integer.parseInt(time_arr[1]);
            seconds = Integer.parseInt(time_arr[2].substring(0,2));
            if(hours == 12){
                hours = 0;
            }
        }
        else{
            hours = Integer.parseInt(time_arr[0]);
            minutes = Integer.parseInt(time_arr[1]);
            seconds = Integer.parseInt(time_arr[2].substring(0,2));
            if(hours != 12){
                hours = hours+12;
            }
        }
        System.out.println(String.format("%02d", hours)+":"+String.format("%02d", minutes)+":"+String.format("%02d", seconds));
    }
}

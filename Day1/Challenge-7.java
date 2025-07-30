//check whether the time is valid or not using conditional construct.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String time=scanner.nextLine();
        String[] t=time.split(":");
        
        int hour=Integer.parseInt(t[0]);
        int min=Integer.parseInt(t[1]);
        int sec=Integer.parseInt(t[2]);
        
        if(hour>=0 && hour<24 && min>=0 && min<60 && sec>=0 && sec<60)
            System.out.print("Valid");
        else
            System.out.print("Not Valid");
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

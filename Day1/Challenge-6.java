//check whether the given year is leap year or not using conditional construct
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        if(a%400==0)
            System.out.print("Leap year");
        else if(a%100==0)
            System.out.print("Not a Leap year");
        else if(a%4==0)
            System.out.print("Leap year");
        else
            System.out.print("Not a Leap year");
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

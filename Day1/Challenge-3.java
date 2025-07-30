//determine the sign of the input using conditional constructs.

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
        if(a>0)
            System.out.print("Positive");
        else if(a<0)
            System.out.print("Negative");
        else
            System.out.print("Zero");
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

//check the number is divisible by 3 or not using conditional construct.
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
        if(a%3==0)
            System.out.print("The number is divisible by 3");
        else
            System.out.print("The number is not divisible by 3 and gives a remainder "+ a%3);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

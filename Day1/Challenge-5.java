//check the number is either divisible by 3 or divisible by 5 and display the corresponding message


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
        if(a%3==0 && a%5==0)
            System.out.print("HiHello");
        else if(a%3==0)
            System.out.print("Hi");
        else if(a%5==0)
            System.out.print("Hello");
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

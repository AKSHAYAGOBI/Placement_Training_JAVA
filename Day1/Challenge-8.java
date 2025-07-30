//find given a specific date ,check whether the date is valid or not. Year will be in range 1900 to 9999

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        String[] parts = date.split("/");

        if (parts.length != 3) {
            System.out.println("Invalid");
            return;
        }

        try {
            int day = Integer.parseInt(parts[0]);
            int month = Integer.parseInt(parts[1]);
            int year = Integer.parseInt(parts[2]);

            if (year < 1900 || year > 9999 || month < 1 || month > 12) {
                System.out.println("Invalid");
                return;
            }

            int[] daysInMonth = {31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30,
                                 31, 31, 30, 31, 30, 31};

            if (day >= 1 && day <= daysInMonth[month - 1]) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid");
        }
    }

    public static boolean isLeapYear(int year) {
        // Leap year logic
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

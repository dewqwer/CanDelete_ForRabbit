/*2.6 (Sum the digits in an integer) Write a program that reads an integer between 0 and
1000 and adds all the digits in the integer. For example, if an integer is 932, the
sum of all its digits is 14.
Hint: Use the % operator to extract digits, and use the / operator to remove the
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
*/

import java.util.Scanner;

class EX2_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int number = sc.nextInt();

        while (number < 0 || number > 1000) {
            System.out.print("Enter a number between 0 and 1000: ");
            number = sc.nextInt();
        }
        int ones = 0, tens = 0, hundreds;
        if (number >= 100) {
            ones = number % 10;
            number = number / 10;
        }
        if (number >= 10) {
            tens = number % 10;
            number = number / 10;
        }
        hundreds = number % 10;
        number = number / 10;

        int sum = ones + tens + hundreds;

        System.out.println("The sum of the digits is " + sum);

    }

}
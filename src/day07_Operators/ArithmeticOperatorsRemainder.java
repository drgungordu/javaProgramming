package day07_Operators;

public class ArithmeticOperatorsRemainder {

    public static void main(String[] args) {


        int num1 = 10;
        int num2 = 3;

        // 10 divide by 3 is equal to 3 with a remainder of 1
        // remainder = numerator - ( denominator * result )


        int division = num1/num2;
        int remainder = num1 % num2 ;

        System.out.println(num1 + " divided by "+ num2 + " is equal to "+ division + " with a remainder of " + remainder);

    }
}

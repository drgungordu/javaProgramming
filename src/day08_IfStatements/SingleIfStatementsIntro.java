package day08_IfStatements;

public class SingleIfStatementsIntro {


    public static void main(String[] args) {






        int number = 301;

        /*System.out.println("Odd Number");
        System.out.println("Even Number");*/


        boolean evenNumber = number%2 ==0;

        if (evenNumber){
            System.out.println(number + " is even number");

        }

        if (!evenNumber){

            System.out.println(number + " is odd number");
        }
/*
            boolean oddNumber = number%2 != 0;
        if (oddNumber){
            System.out.println(number + " is odd number");
        }
*/


        int n = -200;

        if (n>0){
            System.out.println(n + " is positive ");
        }
        if (n<0){
            System.out.println(n + " is negative");
        }
        if (n==0){
            System.out.println(n + " is Zero");
        }

    }
}

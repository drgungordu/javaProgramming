package day10_NestedIf;

public class TernariesInfo {
    public static void main(String[] args) {


        int n =100;

        if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        System.out.println("--------------------------------------");

        String result1 =(n%2==0)? "Even" : "Odd";
        System.out.println(result1);


        System.out.println("--------------------------------------");

        int age = 13;

        if(age>=21){
            System.out.println("Eligible");
        }else {
            System.out.println("Not Eligible");
        }
        System.out.println("--------------------------------------");

        //  String result2 = (age>=21)?  "Eligible" : "Not Eligible";

        System.out.println((age>=21)?  "Eligible" : "Not Eligible");



        System.out.println("--------------------------------------");


        int number = 100;

        if(number>0){
            System.out.println("Positive");
        } else if (number<0) {
            System.out.println("Negative");
        }else {
            System.out.println("Zero");
        }


        System.out.println("--------------------------------------");

        String result3 = (number>0)? "Positive" : (number<0)?  "Negative" : "Zero";
        System.out.println(result3);

        System.out.println((number>0)? "Positive" : (number<0)?  "Negative" : "Zero");




    }

}
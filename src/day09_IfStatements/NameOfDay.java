package day09_IfStatements;

public class NameOfDay {


    public static void main(String[] args) {


        int n = 5;
        String day;

        if (n == 1) {
            day = "Monday";
            //System.out.println("Monday");
        } else if (n == 2) {
            //System.out.println("Tuesday");
            day = "Tuesday";
        } else if (n == 3) {
            //System.out.println("Wednesday");
            day = "Wednesday";
        } else if (n == 4) {
            day = "Thursday";
            //System.out.println("Thursday");
        } else if (n == 5) {
            day = " Friday";
            //System.out.println("Friday");
        } else if (n == 6) {
            day = " Saturday";
            //System.out.println("Saturday");
        } else {
            day = "Sunday";
            //System.out.println("Sunday");
        }
        System.out.println("day = " + day);
    }
}

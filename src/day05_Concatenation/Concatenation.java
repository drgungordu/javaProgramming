package day05_Concatenation;

public class Concatenation {


    public static void main(String[] args) {
        int age = 33,
                weight = 80,
                height = 180;


        String name = " Ali" ;



        System.out.println("My name  is " + name + " my age is "+ age + 5);

        System.out.println("My name  is " + name + " my age is "+ (age + 5) );

        System.out.println( age + " my age " + " name = " + name);

        System.out.println( age + 5 + " my age " + " name = " + name);

        String names = " Ahmet ",
                surname = " Bilgin",
                city = " Batman";

        String info= "names = " + names + surname+ city;
        System.out.println("names = " + names + surname+ city);
        System.out.println("info = " + info);

        System.out.println((int)(10.0/3));
    }
}

package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int num1 = +25; // num1 > 0
        int num2 = -25; // num2 < 0

        System.out.println(--num1); //pre increment / decrement = immediately increase or decrease before value
        System.out.println(++num1);

        System.out.println(num2);

        int a = 15;

        System.out.println(a--);//post increment / decrement = increase or decrease next step follow before value
        System.out.println(a++);
        System.out.println(a++);


    }

}
/*
pre increment / decrement = immediately increase or decrease before value

int b = 25;
sout ( ++b) = 26
sout ( --b) = 25

post increment / decrement = increase or decrease next step follow before value

int a = 20;
sout (a++) = 20
sout(a--) = 21
sout(a++) = 20

incremetn
 */
package day10_NestedIf;

public class NestedIfIntro {


    public static void main(String[] args) {

        int score =400;
        if (score >=0 && score <=100){

            if (score >= 60){
                System.out.println("Passed");
            }else {
                System.out.println("failed");
            }


        }else{
            System.out.println("Invalid Score");
        }

        System.out.println("---------------------------------");


        int score2 =81;
        String result = "";

        if (score2 >=0 && score2 <=100){

            if (score2 >= 60){
                result= "Passed";
            }else {
                result= "failed";
            }


        }else{
            result= "Invalid Score";
        }

        System.out.println(result);
    }
}

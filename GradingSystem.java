// program to compute the grade of a student

public class GradingSystem {

    public char Grade(int score){
    
        if (score >= 70 && score <= 100){         
            return 'A';
        }
        else if (score >=60 && score <= 69){
            return 'B';
        }
        else if (score >= 50 && score <= 59){
            return 'C';
        }
        else if (score >= 45 && score <= 49){
            return 'D';
        }
        else if (score >= 40 && score <= 44){
            return 'E';
        }
        else {
            return 'F';
        }
    }
    public static void main (String[]args){

        GradingSystem saliu = new GradingSystem();

        // print

        System.out.print(saliu.Grade(30));
    }
}

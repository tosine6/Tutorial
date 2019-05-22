// program to compute the grade of a student

public class GradingSystem {

    public char Grade(int score){
    
        if (score >= 70 && score <= 100){         
            return 'A';
        }
        else if (score >=60){
            return 'B';
        }
        else if (score >= 50){
            return 'C';
        }
        else if (score >= 45){
            return 'D';
        }
        else if (score >= 40){
            return 'E';
        }
        else {
            return 'F';
        }
    }

    public String Remark(char grade){
        String remark;

        switch (grade){
            case 'A':
            remark = "excellent";
            break;

            case 'B':
            remark = "verygood";
            break;

            case 'C':
            remark = "good";
            break;

            case 'D':
            remark = "poor";
            break;

            default:
            remark = "Advice to withdraw";
        }
    return remark;
    }
    public static void main (String[]args){

        GradingSystem saliu = new GradingSystem();
        GradingSystem comment = new GradingSystem();

        // print

        System.out.printf("Your grade is %s" + " and you're %s", saliu.Grade(30), comment.Remark('F'));
    }
}

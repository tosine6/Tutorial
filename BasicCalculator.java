// program to create a simplle calculator

public class BasicCalculator{

    private int number1;
    private int number2;
    private String operator;

public int sum(int number1, int number2){
    int result = number1 + number2;
        return result;
}
public int multiplication(int number1, int number2){
    int result = number1 * number2;
        return result;
}
public int division(int number1, int number2){
    int result = number1 / number2; 
        return result;
}
}

class BasicTest{

    public static void main (String[] args){

        BasicCalculator casio = new BasicCalculator();
        BasicCalculator purpo = new BasicCalculator();

        casio.sum(5,6);
        casio.multiplication(5,6);
        casio.division(5,6);

        purpo.sum(10,5);
        purpo.multiplication(10,5);
        purpo.division(10,5);

        System.out.printf("sum %d%n%d%n", casio.sum(5,6), purpo.sum(10,5));


    }
}
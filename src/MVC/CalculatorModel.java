package MVC;

// The Model performs all the calculations needed
// and that is it. It doesn't know the View
// exists

public class CalculatorModel {

    // Holds the value of the sum of the numbers
    // entered in the view

    private int calculationValue;

    public void addTwoNumbers(int firstNumber, int secondNumber){

        calculationValue = firstNumber + secondNumber;

    }

    //to be implemented in the JFrame
    public void multiplyTwoNumbers(int firstNumber, int secondNumber){

        calculationValue = secondNumber * firstNumber;

    }

    public int getCalculationValue(){

        return calculationValue;

    }

}
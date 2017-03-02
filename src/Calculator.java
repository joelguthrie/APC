import java.util.Scanner;

/**
 * Created by Joel on 2/28/2017.
 */
public class Calculator {
    public static void main(String[] args) {
        try{
            //create three variables for the basic math
            Scanner input = new Scanner(System.in);
            Controller calculate = new Controller();
            //two number variables
            Integer firstNumber;
            Integer secondNumber;
            //variable for the math sign
            String operator;
            //gather the first number
            System.out.println("Enter a number ");
            firstNumber = Integer.parseInt(input.nextLine());
            //gather what math operator is needed
            System.out.println("Enter the math you would like to do (+, -, *, /) ");
            operator = input.nextLine();
            //gather the second number
            System.out.println("Enter a number ");
            secondNumber = Integer.parseInt(input.nextLine());

            System.out.println("The result is");
            //do the apropriate math as called by this class
            calculate.handleOperator(operator,firstNumber,secondNumber);

        }catch (NumberFormatException ex) {
            System.out.println(" ");
            System.out.println("Please Enter Valid Numbers");
            System.out.println(" ");
            Scanner input = new Scanner(System.in);
            Controller calculate = new Controller();
            Integer input1;
            Integer input2;

            String operator;

            System.out.println("Enter a number ");
            input1 = Integer.parseInt(input.nextLine());

            System.out.println("Enter the math operation (+, -, *, /) ");
            operator = input.nextLine();

            System.out.println("Enter a number ");
            input2 = Integer.parseInt(input.nextLine());

            System.out.println("The result is");

            calculate.handleOperator(operator,input1,input2);
        }
    }
}

import java.util.HashMap;
/**
 * Created by Joel on 2/28/2017.
 */
public class Controller {
    public static HashMap<String, math> key = new HashMap <String, math>();

    public void Controller(){

    }
        //this is the main bulk! this is where we decide what math is to be done!
    public static void handleOperator(String operator, Integer firstNumber, Integer secondNumber){
        //changes the operater into the function we actually want to do
        key.put("+", new add());
        key.put("-", new subtract());
        key.put("/", new divide());
        key.put("*", new multiply());
        // this is the operation that changes the input into the function
        math handler = key.get(operator);
        //pass the numbers into the function and complete the function
        handler.execute(firstNumber, secondNumber);
    }
}

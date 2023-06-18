import org.openqa.selenium.WebDriver;

import java.util.function.Function;

/**
 * Function Interface
 * @paramFunction() ->
 */

public class FunctionInterface {


    public static void main(String[] args)
    {
        Function<String, Integer> func = x -> x.length();

        int len = func.apply("Sachin");
        System.out.println(len);



    }
}

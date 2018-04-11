import branch.IfElse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.util.function.Predicate;

public class IfElse2Test {

    private final transient Logger logger = LoggerFactory.getLogger(getClass());


    @Test
    public void ifElseReturnTrueValue() {

        /*given*/
        var zero = 0;
        Predicate<Integer> predicate = integer -> integer == 0;

        /*when*/
        IfElse testResult = new IfElse(zero, predicate, "left", "right");

        /*then*/
        logger.info("result={}", testResult.result());
    }

    @Test
    public void ifElseReturnFalseValue() {

        /*given*/
        Integer one = 1;
        Predicate<Integer> predicate = integer -> integer == 0;

        /*when*/
        IfElse<Integer, String> testResult = new IfElse(one, predicate, "left", "right");

        /*then*/
        logger.info("result={}", testResult.result());
    }

}

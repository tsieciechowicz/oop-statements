import branch.Branch;
import branch.If;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class If2Test {
    private final transient Logger logger = LoggerFactory.getLogger(getClass());


    @Test
    public void ifFindCorrectBranch() {

        /*given*/
        var ten = 20;
        var branches = new ArrayList<Branch<Integer, String>>();
        branches.add(new Branch((Predicate<Integer>) o -> o == 0, (Supplier<String>) () -> "first branch"));
        branches.add(new Branch((Predicate<Integer>) o -> o == 10, (Supplier<String>) () -> "second branch"));
        branches.add(new Branch((Predicate<Integer>) o -> o == 20, (Supplier<String>) () -> "third branch"));

        /*when*/
        If testResult = new If(ten, branches);

        /*then*/
        logger.info("result={}", testResult.result());
    }
}

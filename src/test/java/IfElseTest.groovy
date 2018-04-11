import branch.IfElse
import spock.lang.Specification

class IfElseTest extends Specification {

    def "correct ifElse behaviour"() {
        given:
        Integer zero = 0

        when:
        IfElse<Integer, String> testResult = new IfElse(
                zero,
                { input -> input == 0 },
                "left",
                "right"
        )

        then:
        testResult.result() == "left"
    }
}

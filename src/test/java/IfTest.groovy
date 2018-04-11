import branch.Branch
import branch.If
import spock.lang.Specification

class IfTest extends Specification {

    def "correct if behaviour"() {
        given:
        Integer ten = 10
        Collection branches = new ArrayList<Branch<Integer, String>>()
        branches.add(new Branch({ integer -> integer == 0 }, { p -> "firstBranch" }))
        branches.add(new Branch({ integer -> integer == 10 }, { p -> "secondBranch" }))
        branches.add(new Branch({ integer -> integer == 20 }, { p -> "thirdBranch" }))

        when:
        If<Integer, String> testResult = new If(ten, branches)

        then:
        testResult.result() == "secondBranch"
    }
}

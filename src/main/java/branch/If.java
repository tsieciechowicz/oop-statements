package branch;

import abstraction.Resulted;

import java.util.Collection;

public final class If<T, R> implements Resulted<R> {

    private final T inputValue;
    private final Collection<Branch<T, R>> branches;

    public If(T inputValue, Collection<Branch<T, R>> branches) {
        this.inputValue = inputValue;
        this.branches = branches;
    }

    @Override
    public R result() {
        for (Branch<T, R> branch : branches) {
            if (branch.matches(inputValue)) {
                return branch.result().get();
            }
        }

        //replace it
        return null;
    }
}

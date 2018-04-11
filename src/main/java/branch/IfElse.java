package branch;

import abstraction.Resulted;

import java.util.function.Predicate;

public final class IfElse<T, R> implements Resulted<R> {

    private final T inputValue;
    private final Predicate<T> predicate;
    private final R left;
    private final R right;

    public IfElse(T inputValue, Predicate<T> predicate, R left, R right) {
        this.inputValue = inputValue;
        this.predicate = predicate;
        this.left = left;
        this.right = right;
    }

    @Override
    public R result() {
        return predicate.test(inputValue) ? left : right;
    }
}

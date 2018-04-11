package branch;

import java.util.function.Predicate;
import java.util.function.Supplier;

public final class Branch<T, R> {
    private final Predicate<T> predicate;
    private final Supplier<R> result;

    public Branch(Predicate<T> predicate, Supplier<R> result) {
        this.predicate = predicate;
        this.result = result;
    }

    boolean matches(T inputValue) {
        return predicate.test(inputValue);
    }

    Supplier<R> result() {
        return result;
    }
}

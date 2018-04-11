package collection;

import abstraction.CollectionResulted;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

final class CollectionFilter<T> implements CollectionResulted<T> {
    private final Collection<T> collection;
    private Predicate<T> predicate;

    public CollectionFilter(Collection<T> collection, Predicate<T> predicate) {
        this.collection = collection;
        this.predicate = predicate;
    }

    @Override
    public Collection<T>  result() {
        var restrictedCollection = new ArrayList<T>();

        for (T t : collection) {
            if (predicate.test(t)) {
                restrictedCollection.add(t);
            }
        }

        return restrictedCollection;
    }
}

package abstraction;

import java.util.Collection;
import java.util.Collections;

public interface CollectionResulted<T> {
    Collection<T> result();

    class Fake implements CollectionResulted<String> {
        @Override
        public Collection<String> result() {
            return Collections.EMPTY_LIST;
        }
    }
}

package phones.tags;

import org.jetbrains.annotations.NotNull;
import phones.Phone;

public abstract class Tag<T> {

    protected final T value;

    public Tag(T value) {
        this.value = value;
    }

    public abstract boolean find(@NotNull Phone phone);
}

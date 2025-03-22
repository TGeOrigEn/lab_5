package phones.tags;

import org.jetbrains.annotations.NotNull;
import phones.Phone;

public class MemorySizeTag extends Tag<Integer> {

    public MemorySizeTag(int value) {
        super(value);
    }

    @Override
    public boolean find(@NotNull Phone phone) {
        return value == phone.getMemorySize();
    }
}

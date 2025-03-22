package phones.tags;

import org.jetbrains.annotations.NotNull;
import phones.Phone;

public class ModelTag extends Tag<String> {

    public ModelTag(String value) {
        super(value);
    }

    @Override
    public boolean find(@NotNull Phone phone) {
        return value.equals(phone.getModel());
    }
}

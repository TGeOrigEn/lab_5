package phones.tags;

import org.jetbrains.annotations.NotNull;
import java.awt.Color;
import phones.Phone;

public class ColorTag extends Tag<Color> {

    public ColorTag(Color value) {
        super(value);
    }

    @Override
    public boolean find(@NotNull Phone phone) {
        return value.equals(phone.getColor());
    }
}

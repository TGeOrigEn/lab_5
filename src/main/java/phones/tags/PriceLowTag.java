package phones.tags;

import org.jetbrains.annotations.NotNull;
import phones.Phone;

public class PriceLowTag extends Tag<Double> {

    public PriceLowTag(double value) {
        super(value);
    }

    @Override
    public boolean find(@NotNull Phone phone) {
        return false;
    }
}

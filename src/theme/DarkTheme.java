package theme;

import theme.ConcreteProducts.DarkButton;
import theme.ConcreteProducts.DarkCheckbox;

public class DarkTheme implements ThemeAbstractFactoryInterface{
    public ButtonInterface createButton() {
        return new DarkButton();
    }

    public CheckboxInterface createCheckbox() {
        return new DarkCheckbox();
    }
}

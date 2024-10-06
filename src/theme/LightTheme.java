package theme;

import theme.ConcreteProducts.LightButton;
import theme.ConcreteProducts.LightCheckbox;

public class LightTheme implements ThemeAbstractFactoryInterface{
    public ButtonInterface createButton() {
        return new LightButton();
    }

    public CheckboxInterface createCheckbox() {
        return new LightCheckbox();
    }
}

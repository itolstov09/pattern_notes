package com.company.creational.abstract_factory.factory;

import com.company.creational.abstract_factory.button.Button;
import com.company.creational.abstract_factory.button.MacOsButton;
import com.company.creational.abstract_factory.checkbox.Checkbox;
import com.company.creational.abstract_factory.checkbox.MacOsCheckbox;

public class MacOsGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOsCheckbox();
    }
}

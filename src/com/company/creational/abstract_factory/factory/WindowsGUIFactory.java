package com.company.creational.abstract_factory.factory;

import com.company.creational.abstract_factory.button.Button;
import com.company.creational.abstract_factory.button.WIndowsButton;
import com.company.creational.abstract_factory.checkbox.Checkbox;
import com.company.creational.abstract_factory.checkbox.WindowsCheckbox;

public class WindowsGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WIndowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

package com.company.creational.abstract_factory.factory;

import com.company.creational.abstract_factory.button.Button;
import com.company.creational.abstract_factory.checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

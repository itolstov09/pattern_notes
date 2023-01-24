package com.company.creational.abstract_factory;

import com.company.creational.abstract_factory.button.Button;
import com.company.creational.abstract_factory.checkbox.Checkbox;
import com.company.creational.abstract_factory.factory.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}

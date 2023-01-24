package com.company.creational.factory_method.factory;

import com.company.creational.factory_method.button.Button;

public abstract class Dialog {
    public void renderWindow(){
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}

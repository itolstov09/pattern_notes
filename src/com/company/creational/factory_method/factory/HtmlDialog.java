package com.company.creational.factory_method.factory;

import com.company.creational.factory_method.button.Button;
import com.company.creational.factory_method.button.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}

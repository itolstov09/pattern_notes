package com.company.creational.abstract_factory;

import com.company.creational.abstract_factory.factory.GUIFactory;
import com.company.creational.abstract_factory.factory.MacOsGUIFactory;
import com.company.creational.abstract_factory.factory.WindowsGUIFactory;

import java.util.Locale;

public class Demo {

    public static void main(String[] args) {
        Application application = configureApplication();
        application.paint();

    }

    private static Application configureApplication() {
        String systemName = System.getProperty("os.name").toLowerCase(Locale.ROOT);
        GUIFactory factory;
        if (systemName.contains("mac")) {
            factory = new MacOsGUIFactory();
        } else if (systemName.contains("win")) {
            factory = new WindowsGUIFactory();
        } else {
            throw new RuntimeException("Unsupported system");
        }

        return new Application(factory);
    }
}

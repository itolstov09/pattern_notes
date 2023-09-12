package com.company.behavioral.observer;

import com.company.behavioral.observer.listener.EmailNotificationListener;
import com.company.behavioral.observer.listener.FileLogListener;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();

        editor.eventManager.subscribe("open", new FileLogListener("observerLog.txt"));
        editor.eventManager.subscribe("close", new EmailNotificationListener("test@mail.com"));

        try {
            editor.openFile("observer.txt");
            editor.saveFile();
        } catch (RuntimeException runtimeException) {
            runtimeException.printStackTrace();
        }
    }
}

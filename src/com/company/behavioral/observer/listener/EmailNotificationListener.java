package com.company.behavioral.observer.listener;

import java.io.File;

public class EmailNotificationListener implements EventListener {
    private final String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.printf(
                "Email to %s: \"Someone has performed %s operation with following file: %s\"",
                this.email, eventType, file.getName()
        );
    }
}

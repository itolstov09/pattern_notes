package com.company.behavioral.observer.listener;

import java.io.File;

public class FileLogListener implements EventListener {
    private final File log;

    public FileLogListener(String filePath) {
        this.log = new File(filePath);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.printf(
                "Save log to %s: \"Someone has performed %s operation with following file: %s\"",
                this.log, eventType, file.getName()
        );
    }
}

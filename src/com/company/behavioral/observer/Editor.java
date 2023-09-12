package com.company.behavioral.observer;

import java.io.File;

public class Editor {
    private File file;
    public final EventManager eventManager;

    public Editor() {
        this.eventManager = new EventManager("open", "close");
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        this.eventManager.notify("open", this.file);
    }

    public void saveFile() {
        if (this.file == null) {
            throw new RuntimeException("You must open file first!");
        }

        this.eventManager.notify("close", file);
    }

}

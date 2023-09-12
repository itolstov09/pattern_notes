package com.company.behavioral.observer.listener;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}

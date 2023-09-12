package com.company.behavioral.observer;


import com.company.behavioral.observer.listener.EventListener;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    private final Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> listeners = this.listeners.get(eventType);
        listeners.add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> listeners = this.listeners.get(eventType);
        listeners.remove(listener);
    }

    public void notify(String eventType, File file) {
        List<EventListener> listeners = this.listeners.get(eventType);
        for (EventListener listener : listeners) {
            listener.update(eventType, file);
        }
    }
}

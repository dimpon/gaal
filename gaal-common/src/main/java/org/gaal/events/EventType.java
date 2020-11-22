package org.gaal.events;

import lombok.ToString;
import org.gaal.valueobjects.Cluster;

@ToString
public final class EventType<T> {
    private final String name;

    private EventType(String name) {
        this.name = name;
    }

    public static final EventType<String> INTERRUPT_JOB = new EventType<>("INTERRUPT_JOB");

    public static final EventType<Cluster> INTERRUPT_CLUSTER = new EventType<>("INTERRUPT_CLUSTER");
}

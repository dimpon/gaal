package org.gaal.events;

import lombok.Getter;
import lombok.ToString;


@ToString
@Getter
public class GenericEvent<T> {

    public final T payload;
    public final EventType<T> type;

    private GenericEvent(T payload, EventType<T> type) {
        this.payload = payload;
        this.type = type;
    }

    public static <T> GenericEvent<T> of(T payload, EventType<T> type){
        return new GenericEvent<>(payload,type);
    }

}

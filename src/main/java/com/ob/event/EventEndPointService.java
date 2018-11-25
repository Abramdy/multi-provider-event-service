package com.ob.event;

/**
 * Created by boris on 1/31/2017.
 */
public interface EventEndPointService {
    default void tellEvent(EventNode sender, EventNode recipient, Object event){}
    default void tellEvent(EventNode sender, String recipient, Object event){}
}

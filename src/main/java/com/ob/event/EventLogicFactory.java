package com.ob.event;

/**
 * Created by boris on 1/29/2017.
 */
public interface EventLogicFactory<T> {
    EventLogic<T> create();
}
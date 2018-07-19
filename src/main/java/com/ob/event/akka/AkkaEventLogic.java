package com.ob.event.akka;

import com.ob.event.*;

/**
 * Created by boris on 1/30/2017.
 */
public  abstract class AkkaEventLogic implements EventLogic {
    private String name;
    private EventNode eventNode;
    private final String withDispatcher;
    private final String withMailbox;

    protected AkkaEventLogic(String name) {
        this(name, null, null);
    }

    protected AkkaEventLogic(String name, String withDispatcher, String withMailbox) {
        this.name = name;
        this.withMailbox = withMailbox;
        this.withDispatcher = withDispatcher;

    }

    @Override
    public String name() {
        return name;
    }


    @Override
    public void onEventNode(EventNode eventNode) {
        this.eventNode = eventNode;
    }

    protected EventNodeObject getEventNodeObject(){
        return eventNode!=null?(EventNodeObject)eventNode:EventNodeObject.EMPTY;
    }

    protected EventService getService(){
        return getEventNodeObject().getEventService();
    }

    @Override
    public String toString() {
        return "{\"" + name + "\"}";
    }

    @Override
    public void release(){
        getEventNodeObject().release();
    }

    @Override
    public void tell(Object event, EventNode sender){
        getEventNodeObject().tell(event, sender);
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public String withDispatcher() {
        return withDispatcher;
    }

    @Override
    public String withMailbox() {
        return withMailbox;
    }

    static final Class[] EMPTY = new Class[0];
    @Override
    public Class[] getMatchers() {
        return EMPTY;
    }

    @Override
    public void tellSync(Object event) {

    }

    @Override
    public void onEvent(Object event, Class clazz) {

    }
}

package com.ob.event;

import java.util.concurrent.Callable;

/**
 * Created by boris on 1/29/2017.
 */
public interface ExecutableContext extends Service{
    <F> F execute(Callable callable);
}

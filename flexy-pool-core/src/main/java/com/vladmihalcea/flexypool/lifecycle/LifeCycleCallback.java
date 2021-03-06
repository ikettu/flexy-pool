package com.vladmihalcea.flexypool.lifecycle;

/**
 * <code>LifeCycleCallback</code> defines lifecycle listening hooks.
 *
 * @author Vlad Mihalcea
 * @since 1.0
 */
public interface LifeCycleCallback {

    /**
     * Starting callback.
     */
    void start();

    /**
     * Stopping callback.
     */
    void stop();
}

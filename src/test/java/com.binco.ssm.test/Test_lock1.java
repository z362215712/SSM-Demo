package com.binco.ssm.test;

import org.junit.Test;

/**
 * @author: Qiaoguo Zhang
 * @date: 2018/8/15 11:27
 * @description:
 */
public class Test_lock1 {

    @Test
    public void testGetUserById() {
        Lock lock = new Lock();
        try {
            lock.lock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test1() {
        Lock lock = new Lock();
        try {
            for (int i = 0; i < 3; i++) {
                lock.lock();

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Lock {
    boolean isLocked = false;
    Thread lockedBy = null;
    int lockedCount = 0;

    public synchronized void lock()
            throws InterruptedException {
        Thread thread = Thread.currentThread();
        while (isLocked && lockedBy == thread) {
            notify();
            wait();
        }
        isLocked = true;
        lockedCount++;
        lockedBy = thread;
    }

    public synchronized void unlock() {
        if (Thread.currentThread() == this.lockedBy) {
            lockedCount--;
            if (lockedCount == 0) {
                isLocked = false;
                notify();
            }
        }
    }
}

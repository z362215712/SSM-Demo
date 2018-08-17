package com.binco.ssm.test;

import org.springframework.beans.factory.BeanFactory;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test_Thread {
//    static Thread thread1 = new Thread(()-> {
//        System.out.println("thread1");
//    });
//
//
//    static Thread thread2 = new Thread(new Runnable() {
//        @Override
//        public void run() {
//            System.out.println("thread2");
//            this.notify();
//        }
//    });
//
//
//    static Thread thread3 = new Thread(new Runnable() {
//        @Override
//        public void run() {
//            System.out.println("thread3");
//        }
//    });


    static Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run() {
            synchronized (this){
                System.out.println("thread1");
                this.notify();
            }
        }
    });

    static Thread thread2 = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                thread2.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("thread2");
            this.notify();
        }
    });


    static Thread thread3 = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("thread3");
        }
    });

    public static void main(String[] args) {

    }

//
//    static Thread thread1 = new Thread(() -> System.out.println("thread1"));
//    static Thread thread2 = new Thread(() -> System.out.println("thread2"));
//    static Thread thread3 = new Thread(() -> System.out.println("thread3"));
//
//
//
////        方法2：
////        创建只有一个线程的线程池来操作不限数量的队列（FIFO）
//
//
//    static ExecutorService executorService = Executors.newSingleThreadExecutor();
//
//
//    public static void main(String[] args) throws InterruptedException {
//        //方法1：
//        thread1.start();
//        thread1.join();
//        thread2.start();
//        thread2.join();
//        thread3.start();
//
////        方法2
////        executorService.submit(thread1);
////        executorService.submit(thread2);
////        executorService.submit(thread3);
////        executorService.shutdown();
//
//    }
}

package org.threadTest;

public class NewThread {
    public static void main(String[] args) {
        //实例化Thread实例
//        Thread thread = new MyThread();
//        thread.start();

//        Thread thread = new Thread(new MyRunnable());
//        thread.start();
        //lambda简写
//        Thread thread = new Thread(()->{
//            System.out.println("start new Thread");
//        });
//        thread.start();
        System.out.println("main start...");
        Thread t = new Thread() {
            public void run() {
                System.out.println("thread run...");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {}
                System.out.println("thread end.");
            }
        };
        t.start();
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {}
        System.out.println("main end...");
    }
}


//线程执行指定代码
//1,从Thread派生一个自定义类，然后覆写run()方法

class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("start new Thread");
    }
}

//2,创建Thread实例时，传入一个Runnable实例：
class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("start new Thread");
        System.out.println("thread end");
    }
}
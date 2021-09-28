package com.example.springinitializr.juc.HM.demo.buis;

import java.util.concurrent.locks.StampedLock;

public class StampedThread {
    StampedLock lock = new StampedLock();
    void write(){
        long stamp = lock.writeLock();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.unlock(stamp);
    }
    void read(){
        //乐观读
        long stamp = lock.tryOptimisticRead();
        //判断是否有写在进行，没占用的话，得到执行，打印read
        if (lock.validate(stamp)){
            System.out.println("read");
        }
    }

    public static void main(String[] args) {
        StampedThread stampedThread = new StampedThread();
        Thread t1 = new Thread(()->{
            while (true) {
                stampedThread.write();
            }
        });
        Thread t2 = new Thread(()->{
            while (true){
                stampedThread.read();
            }
        });
        t1.setPriority(9);
        t2.setPriority(1);
        t1.start();
        t2.start();
        /**
         * 结果分析： read间隔性打出，提升了读操作的并发性 注意，StampedLock的使用有局限性！ 对于读多写少的场景 StampedLock 性能很好，简单的应用场景基本上可以替代 ReadWriteLock
         * StampedLock 在命名上并没有 Reentrant，StampedLock 是不可重入的！ StampedLock 的悲观读锁、写锁都不支持条件变量（无法使用Condition）
         */
    }
}

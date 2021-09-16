package com.example.springinitializr.juc.hanxunping.ticket;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author lyi
 * @version 1.0
 * 使用多线程，模拟三个窗口同时售票100张
 */
public class SellTicket {
    public static void main(String[] args) {
//        CpuNum cpuNum = new CpuNum();
//        cpuNum.testa();
        //测试
//        SellTicket01 sellTicket01 = new SellTicket01();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        SellTicket01 sellTicket03 = new SellTicket01();
//
//        //这里我们会出现超卖..
//        sellTicket01.start();//启动售票线程
//        sellTicket02.start();//启动售票线程
//        sellTicket03.start();//启动售票线程


        System.out.println("===使用实现接口方式来售票=====");
        SellTicket03 sellTicket02 = new SellTicket03();

        new Thread(sellTicket02).start();//第1个线程-窗口
        new Thread(sellTicket02).start();//第2个线程-窗口
        new Thread(sellTicket02).start();//第3个线程-窗口


    }
}


//使用Thread方式

class SellTicket01 extends Thread {

    private static int ticketNum = 100;//让多个线程共享 ticketNum

    @Override
    public void run() {
        while (true) {

            if (ticketNum <= 0) {
                System.out.println("售票结束...");
                break;
            }

            //休眠50毫秒, 模拟
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票"
                    + " 剩余票数=" + (--ticketNum));

        }
    }
}



//实现接口方式
class SellTicket02 implements Runnable {
    private int ticketNum = 100;//让多个线程共享 ticketNum

    @Override
    public void run() {
        while (true) {
            synchronized (this){
                if (ticketNum <= 0) {
                    System.out.println("售票结束...");
                    break;
                }

                //休眠50毫秒, 模拟
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票"
                        + " 剩余票数=" + (--ticketNum));//1 - 0 - -1  - -2
            }



        }
    }
}
//实现接口方式
class SellTicket03 implements Runnable {
    AtomicInteger atomicInteger = new AtomicInteger(100);
    //private int ticketNum = 100;//让多个线程共享 ticketNum
    @Override
    public void run() {
        while (true) {
            if ( atomicInteger.get() <= 0) {
                System.out.println("售票结束...");
                break;
            }

            //休眠50毫秒, 模拟
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            atomicInteger.getAndDecrement();
            System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票"
                    + " 剩余票数=" + ( atomicInteger.get()));//1 - 0 - -1  - -2
            atomicInteger.set( atomicInteger.get());

        }
    }
}
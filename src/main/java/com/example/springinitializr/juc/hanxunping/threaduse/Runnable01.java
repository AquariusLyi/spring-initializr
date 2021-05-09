package com.example.springinitializr.juc.hanxunping.threaduse;

/**
 * @author lyi
 * @version 1.0
 * main线程启动两个子线程
 */
public class Runnable01 {
    public static void main(String[] args) {
        a a1 = new a();
        b b1 = new b();
        Thread a = new Thread(a1);
        Thread b = new Thread(b1);
        a.start();
        b.start();
        //...

    }
}

class a implements Runnable{

    int count ;
    @Override
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName()+"正在输出"+(++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(count==10){
                break;
            }

        }
    }
}
class b implements Runnable{

    int count ;
    @Override
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName()+"正在输出"+(++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(count==5){
                break;
            }

        }
    }
}

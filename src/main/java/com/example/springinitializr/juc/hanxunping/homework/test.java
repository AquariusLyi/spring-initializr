package com.example.springinitializr.juc.hanxunping.homework;

public class test {
    public static void main(String[] args) {
        user a=new user();//用户A
        //user b=new user();//用户B
        Thread threada = new Thread(a);
        threada.start();
        Thread threadb= new Thread(a);
        threadb.start();
    }

}
class user extends Thread{
    public static int money = 10000;

    @Override
    public void run() {
        while (true){
            synchronized (this){
                if(money>=1000){
                    money = money-1000;
                    System.out.println(Thread.currentThread().getName()+"正在取钱,当前余额："+money);
                }else{
                    System.out.println(Thread.currentThread().getName()+"余额不足");
                    break;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }


    }
}

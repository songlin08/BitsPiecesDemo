package com.lin.thread;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        Thread A = new Thread(new ThreadDemo("A"));
        Thread B = new Thread(new ThreadDemo("B"));
        Thread C = new Thread(new ThreadDemo("C"));
        A.start();
        B.start();
        C.start();
        for (int i = 0; i < 50; i++) {
            if (i == 10){
                B.wait();
                A.join();
            }
            if (i == 30){
                B.notify();
            }
            Thread.sleep(500);
            System.out.println("主线程正在跑" + i + " 次数据");

        }
    }
    /**
     *
     2、线程睡眠：Thread.sleep(long millis)方法，
           使线程转到阻塞状态。millis参数设定睡眠的时间，以毫秒为单位。当睡眠结束后，就转为就绪（Runnable）状态。sleep()平台移植性好。

     3、线程等待：Object类中的wait()方法，
           导致当前的线程等待，直到其他线程调用此对象的 notify() 方法或 notifyAll() 唤醒方法。
           这个两个唤醒方法也是Object类中的方法，行为等价于调用 wait(0) 一样。
           注意：Obj.wait(),Obj.notify必须在synchronized(Obj){...}语句块内

     4、线程让步：Thread.yield() 方法，
           暂停当前正在执行的线程对象，把执行机会让给相同或者更高优先级的线程。

     5、线程加入：join()方法，等待其他线程终止。
           在当前线程中调用另一个线程的join()方法，则当前线程转入阻塞状态，直到另一个进程运行结束，当前线程再由阻塞转为就绪状态。

     6、线程唤醒：Object类中的notify()方法，
          唤醒在此对象监视器上等待的单个线程。如果所有线程都在此对象上等待，则会选择唤醒其中一个线程。
         选择是任意性的，并在对实现做出决定时发生。线程通过调用其中一个 wait 方法，在对象的监视器上等待。 直
         到当前的线程放弃此对象上的锁定，才能继续执行被唤醒的线程。被唤醒的线程将以常规方式与在该对象上主动同步的其他所有线程进行竞争；
         例如，唤醒的线程在作为锁定此对象的下一个线程方面没有可靠的特权或劣势。类似的方法还有一个notifyAll()，唤醒在此对象监视器上等待的所有线程。
     */
}

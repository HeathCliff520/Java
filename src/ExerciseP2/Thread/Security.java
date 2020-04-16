package ExerciseP2.Thread;

import java.util.Random;

public class Security implements Runnable {
    private int tickets=100;
    Object Lock_obj=new Object();
    @Override
    public void run() {
        while (true){
            //同步代码块机制，利用锁对象，要保证锁对象唯一
            synchronized (Lock_obj){
                Random rad=new Random();
                rad.setSeed(System.currentTimeMillis());
                try {
                    Thread.sleep(rad.nextInt(100));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"--->正在卖第"+tickets+"张票");
            }
            if (tickets>0)
                tickets--;
            else break;
        }
    }
}

package ExerciseP2.Thread;

import java.util.Random;

public class SecurityMethod implements Runnable {
    private int CommonCount=300;
    //使用同步方法进行数据保护：
        synchronized void SellCount(){
            Random rd=new Random();
            rd.setSeed(System.currentTimeMillis()+1254+1452);
            try {
                Thread.sleep(rd.nextInt(124));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"线程执行后--->此时的公共数据量是："+CommonCount);
        }
    @Override
    public void run() {
        for (;CommonCount>1;CommonCount--){
            SellCount();
        }
    }
}

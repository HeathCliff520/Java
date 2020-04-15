package ExerciseP2.Thread;

import javax.sound.midi.Soundbank;

public class MyThread extends Thread{
//分配线程的任务，重写run方法
    @Override
    public void run() {//重写run方法，即此线程要完成的任务
//设置当前线程名字(可以不用设置)：
        Thread.currentThread().setName("only print out somthing Thread");
        for (int i = 0; i < 100; i++){
            try {
                //调用sleep，以毫秒计时1000=1秒
                //sleep会报异常，要使用try catch机制；
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"正在执行任务");
        }

    }
}

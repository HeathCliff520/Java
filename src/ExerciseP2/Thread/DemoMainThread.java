package ExerciseP2.Thread;

import org.omg.PortableServer.THREAD_POLICY_ID;

public class DemoMainThread {
    public static void main(String[] args) {
//方法1.使用子类创建线程
        MyThread t1=new MyThread();
        t1.start();

//方法二，使用runnable的实现类创建线程；
        MyRunnable HelloR=new MyRunnable();
        //使用runnable对象构建线程
        Thread Mr=new Thread(HelloR);
        Mr.start();
//方法三 利用匿名创建线程
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("匿名线程正在执行…………");
                }

            }
        }.start();
//主线程中的代码
        TestMainThread();
    }

    private static void TestMainThread() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        }
    }
}

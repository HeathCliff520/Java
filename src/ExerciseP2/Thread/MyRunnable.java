package ExerciseP2.Thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        Thread.currentThread().setName("Runnable创建线程");
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        }
    }
}

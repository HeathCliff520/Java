package ExerciseP2.Thread;

public class ThreadSecurity {
    public static void main(String[] args) {
        //使用锁对象
        Security St=new Security();
        Thread Sell_01_Tickets=new Thread(St);
        Thread Sell_02_Tickets=new Thread(St);
        Thread Sell_03_Tickets=new Thread(St);
        Sell_01_Tickets.start();
        Sell_02_Tickets.start();
        Sell_03_Tickets.start();

        //使用同步方法
        SecurityMethod Stm=new SecurityMethod();
        Thread Tm1=new Thread(Stm);
        Thread Tm2=new Thread(Stm);
        Thread Tm3=new Thread(Stm);
        Tm1.start();
        Tm2.start();
        Tm3.start();
    }
}

package ExerciseP1.Day02.InterFace;

public interface FirstInterFace {
    //全部可以理解为抽象方法：
    public abstract void  show();
    abstract String scan(String _s);
    public int Myadd(int _a,int _b);
    void absMethod();
    //默认方法(有方法体)
    public default void mainDefault(){
        System.out.println("this is default method in InterFace");
    };

}

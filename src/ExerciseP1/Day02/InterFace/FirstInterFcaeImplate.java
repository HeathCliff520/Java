package ExerciseP1.Day02.InterFace;

public class FirstInterFcaeImplate  implements FirstInterFace{
    @Override
    public void show() {
        System.out.println("this is my first inteface!!!");
    }

    @Override
    public String scan(String _s) {
        return  _s;

    }

    @Override
    public int Myadd(int _a, int _b) {
        return _a+_b;
    }

    @Override
    public void absMethod() {
        System.out.println("this not use public and abstract");
    }

    //实现类可以有自己的方法：
    public void testCalldefaut(){
        System.out.println("+++++++++这里调用了接口的默认方法++++++++++++++++");
        mainDefault();
    }

    // not overwrite the interface default method;
    //but it still will work well
}

package ExerciseP1.Day02.InterFace;

public class FirstInterFcaeImplate2 implements FirstInterFace{
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

    @Override
    public void mainDefault() {
        System.out.println("this is implate2 to overwrite the default method");
    }
}

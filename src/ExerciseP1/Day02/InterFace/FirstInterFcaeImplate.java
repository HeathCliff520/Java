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
}

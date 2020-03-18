package ExerciseP1.Day02.InterFace;

public class CreatInterfaceClass {
    public static void main(String[] args) {
        //新建对象实现类1
        FirstInterFcaeImplate Inter = new FirstInterFcaeImplate();
        Inter.show();
        System.out.println(Inter.scan("Hello Interface"));
        System.out.println(Inter.Myadd(65,58));
        Inter.absMethod();
        Inter.mainDefault();
        Inter.testCalldefaut();
        //新建实现类2的对象
        FirstInterFcaeImplate2 Inter2 =new FirstInterFcaeImplate2();
        Inter2.mainDefault();
    }
}

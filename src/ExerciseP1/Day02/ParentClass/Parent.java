package ExerciseP1.Day02.ParentClass;

public class Parent {
    //这是一个父类
    String name="li";
    int ID;
    //构造

    public Parent() {
        System.out.println("这是父亲的空构造方法");
    }

    public Parent(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    //方法
    public void CoutName(){
        System.out.println(name);
    }
}

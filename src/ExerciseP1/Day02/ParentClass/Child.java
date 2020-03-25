package ExerciseP1.Day02.ParentClass;

public class Child extends Parent{
    String CName;
    int CID;
    //父类中的空构造依然会被执行
    public Child(String CName, int CID) {
        this.CName = CName;
        this.CID = CID;
    }

    public Child() {
        System.out.println("这是子类的空构造方法");
    }
}

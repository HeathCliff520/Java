package ExerciseP1.Day02.ParentClass;

public class CreatPCMain {
    public static void main(String[] args) {
        //继承父成员
        Child c= new Child();
        Parent p=new Parent();
        System.out.println("+++++++++++++++++++++++++++++");
        Dog dd=new Dog("旺财");
        dd.GoMethod();
        dd.WhatKindOf();
        dd.WhatName();
    }
}

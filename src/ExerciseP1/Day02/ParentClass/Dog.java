package ExerciseP1.Day02.ParentClass;

public class Dog extends Animal {
    String DogName;
    static String NameOfThisClass = "狗";
    int age;
    public Dog() {
       //super()函数是父类的空构造
        System.out.println("这里默认调用了super()函数");
    }

    public Dog(String Name) {
        DogName = Name;
    }

    public void ageover(){

    }
    //重写父类中的抽象方法
    @Override
    public void GoMethod() {
        System.out.println("在子类中实现父类的构造方法！！！");
    }

    @Override
    public void WhatKindOf() {
        //super关键字指代父类；
        System.out.println(NameOfThisClass+"是："+super.Kind);
    }
    @Override
    public void WhatName() {
        System.out.println(this.DogName+"是一只："+ NameOfThisClass);
    }

}

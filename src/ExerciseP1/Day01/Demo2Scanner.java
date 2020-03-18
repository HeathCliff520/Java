package ExerciseP1.Day01;

import java.util.Scanner;

/*
* 引用类型的使用与创建
* 导包
* 创建
* 使用
* */
public class Demo2Scanner {
    public static void main(String[] args) {
        //创建
        Scanner myinput = new Scanner(System.in);
        System.out.println("输入A：");
        int a = myinput.nextInt();
        System.out.println("输入B：");
        int b = myinput.nextInt();
        System.out.println("求和结果："+ (a+b));
        System.out.println("求和结果："+ (a+b));


    }


}

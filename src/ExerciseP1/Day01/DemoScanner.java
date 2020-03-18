package ExerciseP1.Day01;

import java.util.Scanner;

/*
* 引用类型的使用与创建
* 导包
* 创建
* 使用
* */
public class DemoScanner {
    public static void main(String[] args) {
        System.out.println("输入内容：");
        Scanner myinput = new Scanner(System.in);
        System.out.println("输入整数方法："+myinput.nextInt());
        //以空格区分单词
        System.out.println("输入字符串方法："+myinput.next());

        String getallline = myinput.nextLine();
        System.out.println("输入的字符串："+getallline);
    }


}

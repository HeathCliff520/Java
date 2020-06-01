package Javabase.IO.ByteStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;//OutputStream 超类
import java.nio.channels.FileChannel;

public class OutputStreamTest {
    /*OutputStream 超类，是抽象类，无法使用，要用子类*/
    //公共方法
    public static void main(String[] args) throws IOException {//抛出IO超类异常
        /*写入磁盘类*/
       //建立对象
        FileOutputStream fos;
        fos = new FileOutputStream("E:\\Code\\ProJect\\Java\\DataStructure\\src\\Javabase\\IO\\ByteStream\\HelloFOS.txt");
        //2.要字节
        String sr="hell stream!!!";
        //使用getBytes方法将字符串转为字节数组
        fos.write(sr.getBytes());
        //0-127 ,其他为系统默认字符集
        fos.write(112);//存入字节，以二进制保存
        fos.close();

        //构造可追加写的文件,每次运行都追加，不会覆盖以前内容
        FileOutputStream fos2=new FileOutputStream("E:\\Code\\ProJect\\Java\\DataStructure\\src\\Javabase\\IO\\ByteStream\\FOSAppend.txt",true);//是否追加
        fos2.write("hellow append\r\n".getBytes());
        fos2.write("追加\r\n".getBytes());
        //换行,win \r\n;linux \n;mac \r;
        fos2.write("he is a \r\n".getBytes());
        fos2.close();
    }

}

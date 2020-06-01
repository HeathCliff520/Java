package Javabase.IO.ByteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/*InputStream:这个抽象类是表示输入字节流的所有类的超类。
public abstract class InputStream extends Object implements Closeable
抽象类要使用其实现的子类
AudioInputStream
ByteArrayInputStream
FileInputStream
FilterInputStream
InputStream
ObjectInputStream
PipedInputStream
SequenceInputStream
StringBufferInputStream

基本输入流（字节输入）
FileInputStream -> InputStream
构造方法：
FileInputStream(File file)：读文件
FileInputStream(FileDescriptor fdObj)：
FileInputStream(String name)：读路径名
* */
public class InputStreamTest {
    public static void main(String[] args) throws IOException{
        FileInputStream FromDesk=new FileInputStream("E:\\Code\\ProJect\\Java\\DataStructure\\src\\Javabase\\IO\\ByteStream\\FOSAppend.txt");
        //读方法
        int read=0;
        while (read!=-1){
            read = FromDesk.read();//读1个字节,读取结束返回-1；
            System.out.print((char)read);
        }
    }
}

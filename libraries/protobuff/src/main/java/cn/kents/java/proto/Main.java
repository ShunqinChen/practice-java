package cn.kents.java.proto;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author Shunqin.Chen
 */
public class Main {
     public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");
        Hello message = Hello.newBuilder().setName("kents").build();

        // 序列化成字节数组
        byte[] result = message.toByteArray();
        System.out.println(result);

        // 反序列化成对象
        Hello hello = Hello.parseFrom(result);
        System.out.println("字节组反序列化结果:");
        System.out.println(hello);

        // 序列化成文件
        message.writeTo(new FileOutputStream("Hello.txt"));
        // 从文件读取反序列化
        Hello hello2 = Hello.parseFrom(new FileInputStream("Hello.txt"));
        System.out.println("从文件反序列化：");
        System.out.println(hello2);
    }
}
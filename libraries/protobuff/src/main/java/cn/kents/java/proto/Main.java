package cn.kents.java.proto;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

/**
 * @author Shunqin.Chen
 */
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");
        QueryUserPlotProto.QueryUserPlot queryUserPlot = QueryUserPlotProto.QueryUserPlot.newBuilder()
                .addPlotList(QueryUserPlotProto.QueryUserPlot.Plot.newBuilder().setPlotId(1).setUnlocked(false).build())
                .addPlotList(QueryUserPlotProto.QueryUserPlot.Plot.newBuilder().setPlotId(2).setUnlocked(true).build())
                .build();
        Hello message = Hello.newBuilder().setName("kents")
                .setData(queryUserPlot.toByteString())
                .build();

        // 序列化成字节数组
        byte[] result = message.toByteArray();
        System.out.println("1:" + result);

        // 反序列化成对象
        Hello hello = Hello.parseFrom(result);
        System.out.println("字节组反序列化结果:");
        /*实践证明如果嵌套类型是泛型无法直接打印*/
        System.out.println(Arrays.toString(hello.getData().toByteArray()));

        // 序列化成文件
        message.writeTo(new FileOutputStream("./Hello.txt"));
        // 从文件读取反序列化
        Hello hello2 = Hello.parseFrom(new FileInputStream("Hello.txt"));
        System.out.println("从文件反序列化：");
        System.out.println(hello2);
    }
}
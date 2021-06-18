package com.test.lambda;

import java.util.function.Consumer;

public class ConsumerSample {
    public static  void output(Consumer<String> consumer){
        String text = "测试文本";
        consumer.accept(text);
    }
    public static void main(String[] args) {
        output(n->System.out.println("向控制台打印"+n));
        output(n -> {
            System.out.println("向xxx网站发送数据包");
        });
    }
}

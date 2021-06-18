package com.test.lambda;

public class LambdaSample {
    public static void main(String[] args) {
        //1. 标准使用方式
        MathOperation addition = (Integer a, Integer b) -> {
            System.out.println("加法运算");
            return a + b + 0f;
        };
        System.out.println(addition.oprate(5, 3));
        // 2.Lambda 允许忽略参数类型
        MathOperation substraction = (a,b) -> a-b-0f;
        System.out.println(substraction.oprate(8, 1));
    }
}

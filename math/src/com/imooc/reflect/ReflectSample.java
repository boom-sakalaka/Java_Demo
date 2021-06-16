package com.imooc.reflect;

import java.util.Scanner;

/**
 * 初识反射的作用
 */
public class ReflectSample {
    /**
     * 传统的创建对象方式
     */
    public static void case1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入计算类名:");
        String op = scanner.next();
        System.out.print("请输入a:");
        int a = scanner.nextInt();
        System.out.print("请输入b:");
        int b = scanner.nextInt();
        MathOperation mathOperation = null;
        if(op.equals("Addition")){
            mathOperation = new Addition();
        }else if(op.equals("Subtraction")) {
            mathOperation = new Subtraction();
        }else if(op.equals("Multiplication")){
            mathOperation = new Multiplication();
        }else{
            System.out.println("无效的计算类");
            return;
        }
        float result = mathOperation.operate(a, b);
        System.out.println(result);
    }

    /**
     * 利用反射创建对象更加灵活
     */
    public static void case2(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入计算类名:");
        String op = scanner.next();
        System.out.print("请输入a:");
        int a = scanner.nextInt();
        System.out.print("请输入b:");
        int b = scanner.nextInt();
        MathOperation mathOperation = null;
        try {
            // newInstance 实例化对象
            mathOperation = (MathOperation) Class.forName("com.imooc.reflect." + op).newInstance();
        }catch(Exception e){
            System.out.println("无效的计算类");
            return;
        }
        float result = mathOperation.operate(a, b);
        System.out.println(result);
    }



    public static void main(String[] args) {
        ReflectSample.case2();
    }
}

package com.test.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * stream流对象的创建方式
 */
public class StreamGenerator {
    // 1.基于数组创建
    @Test
    public  void  generator1(){
        String[] arr = {"Lily", "Andy", "Jackson", "Smith"};
        Stream<String> stream =  Stream.of(arr);
        stream.forEach(s-> System.out.println(s));
    }

    // 2.基于集合创建
    @Test
    public void generator2 () {
        List<String> list = new ArrayList();
        list.add("lily");
        list.add("Andy");
        list.add("Jackson");
        list.add("Smith");
       Stream<String> stream =  list.stream();
        stream.forEach(s-> System.out.println(s));
    }

    // 3.利用generator方法创建无限长度流
    @Test
    public  void generator3 () {
        Stream<Integer> stream = Stream.generate(() -> new Random().nextInt(1000000));
        stream.limit(10).forEach(i-> System.out.println(i));
    }

    //4.基于迭代器创建流
    @Test
    public void generator4() {
       Stream<Integer> stream =  Stream.iterate(1,n->n+1);
       stream.limit(2).forEach(i-> System.out.println(i));
    }
    //5.基于字符序列创建流
    @Test
    public void generator5(){
        String str = "abcdefg";
        IntStream stream = str.chars();
        stream.forEach(c -> System.out.println((char) c));
    }
}

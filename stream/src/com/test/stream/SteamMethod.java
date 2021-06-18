package com.test.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SteamMethod {
    // 提取集合中所有偶数并求和
    @Test
    public  void case1() {
        List<String> list = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8");
       int sum = list.stream() // 获取stream
                .mapToInt(s -> Integer.parseInt(s)) // mapToInt 将每一个流中的数据转化为int
                .filter(n->n%2==0) // 对流中的数据进行过滤
                .sum();
        System.out.println(sum);
    }
    //所有名字首字母大写
    @Test
    public void case2(){
        List<String> list = Arrays.asList("lily","smith","jackson");
        List newList = list.stream()
                //按规则对每一个流数据进行转换
                .map(s->s.substring(0,1).toUpperCase() + s.substring(1))
                //.forEach(s-> System.out.println(s));
                //collect对流数据进行收集,生成新的List/Set
                .collect(Collectors.toList());
        System.out.println(newList);
    }

    //将所有奇数从大到小进行排序,且不许出现重复
    @Test
    public void case3(){
        List<Integer> list = Arrays.asList(1,60,38,21,51,60,51,73);
        List newList = list.stream().distinct()//去除重复的流数据
                .filter(n->n%2==1)
                .sorted((a,b)->b-a) //流数据排序
                .collect(Collectors.toList());
        System.out.println(newList);

    }
}

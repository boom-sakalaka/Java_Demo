package com.o.jedis;

import com.alibaba.fastjson.JSON;
import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CacheSample {
    public void CacheSample () {
        List<Goods> goodsList = new ArrayList();
        goodsList.add(new Goods(8818, "红富士苹果", "进口", 100f));
        goodsList.add(new Goods(8819, "水晶苹果", "进口", 30f));
        goodsList.add(new Goods(8820, "香蕉", "进口", 80f));

        Jedis jedis  = new Jedis("192.168.107.128",6379);
        try{
            jedis.auth("12345");
            jedis.select(3);
            System.out.println("redis连接成功");
            for (Goods goods : goodsList){
                String json = JSON.toJSONString(goods);
                System.out.println(json);
                String key = "goods:" + goods.getGoodsId();
                jedis.set(key, json);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            jedis.close();
        }
    }

    public static void main(String[] args) {
        new CacheSample().CacheSample();
        System.out.println("请输入要查询的商品编号");
        String goodsid = new Scanner(System.in).next();
        Jedis jedis  = new Jedis("192.168.107.128",6379);
        try{
            jedis.auth("12345");
            jedis.select(3);
            System.out.println("redis连接成功");
            String key = "goods:"+ goodsid;
            if(jedis.exists(key)){
                String json = jedis.get(key);
                System.out.println(json);
                Goods goods = JSON.parseObject(json, Goods.class);
                System.out.println(goods.getGoodsId());
            }else {
                System.out.println("您输入的商品编号不存在，请重新输入");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            jedis.close();
        }
    }
}

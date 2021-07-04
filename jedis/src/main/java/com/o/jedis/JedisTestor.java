package com.o.jedis;

import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JedisTestor {
    public static void main(String[] args) {
        Jedis jedis  = new Jedis("192.168.107.128",6379);
        try{
            jedis.auth("12345");
            jedis.select(2);
            System.out.println("redis连接成功");

            // 字符串
            jedis.set("sn", "7777-8888");
            String sn = jedis.get("sn");
            System.out.println(sn);

            jedis.mset(new String[]{"title", "婴幼儿奶粉", "num", "20"});
            List<String> mget = jedis.mget(new String[]{"sn", "title", "num"});
            System.out.println(mget);

            Long num = jedis.incr("num");
            System.out.println(num);

            // Hash
            jedis.hset("student:3312", "name", "张三");
            String name = jedis.hget("student:3312", "name");
            System.out.println(name);

            Map<String,String> studentMap = new HashMap();
            studentMap.put("name", "李四");
            studentMap.put("age", "18");
            studentMap.put("id", "3313");
            jedis.hmset("student:3313", studentMap);
            Map<String, String> stringStringMap = jedis.hgetAll("student:3313");
            System.out.println(stringStringMap);

            // list
            jedis.del("letter");
            jedis.rpush("letter", new String[]{"d","e","f"});
            jedis.lpush("letter", new String[]{"c", "b", "a"});
            List<String> letter = jedis.lrange("letter", 0, -1);
            System.out.println(letter);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            jedis.close();
        }
    }
}

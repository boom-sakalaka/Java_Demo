package com.io.spring.ioc.factory;

import com.io.spring.ioc.entity.Apple;

public class AppleStaticFactory {
    public  static Apple createSweetApple() {
        Apple apple = new Apple();
        apple.setTitle("红富士");
        apple.setColor("红色");
        apple.setOrigin("欧洲");
        return  apple;
    }
}

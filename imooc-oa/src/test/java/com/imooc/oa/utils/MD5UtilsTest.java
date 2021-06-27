package com.imooc.oa.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class MD5UtilsTest {

    @Test
    public void md5Digest() {
        System.out.println(MD5Utils.md5Digest("test"));
        System.out.println(MD5Utils.md5Digest("fest"));
        System.out.println(MD5Utils.md5Digest("te1t"));
        System.out.println(MD5Utils.md5Digest("tesd"));
    }
}
package com.imooc.oa.utils;

import org.apache.commons.codec.digest.DigestUtils;

public class MD5Utils {
    /**
     * 对源数据生成MD5摘要
     * @param source 源数据
     * @return MD5摘要
     */
    public static String md5Digest(String source){
        return DigestUtils.md5Hex(source);
    }

    /**
     * 对源数据加盐混淆后生成MD5摘要
     * @param source 源数据
     * @param salt 盐值
     * @return MD5摘要
     */
    public static String md5Digest(String source , Integer salt){
        //源数据混淆
        char[] ca = source.toCharArray();//字符数组
        for(int i = 0 ; i < ca.length ; i++){
            ca[i] = (char)(ca[i] + salt);
        }
        String target = new String(ca);
//        System.out.println(target);
        String md5 = DigestUtils.md5Hex(target);
        return md5;
    }

    public static void main(String[] args) {
        System.out.println(MD5Utils.md5Digest("test", 189));
        System.out.println(MD5Utils.md5Digest("test", 190));
        System.out.println(MD5Utils.md5Digest("test", 191));
        System.out.println(MD5Utils.md5Digest("test", 192));
        System.out.println(MD5Utils.md5Digest("test", 193));
        System.out.println(MD5Utils.md5Digest("test", 194));
        System.out.println(MD5Utils.md5Digest("test", 195));
        System.out.println(MD5Utils.md5Digest("test", 196));
        System.out.println(MD5Utils.md5Digest("test", 197));
        System.out.println(MD5Utils.md5Digest("test", 198));
        System.out.println(MD5Utils.md5Digest("test", 199));


    }
}

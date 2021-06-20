package com.test.mybatis.dto;

import com.test.mybatis.entity.Category;
import com.test.mybatis.entity.Goods;

public class GoodsDTO {
    private Goods goods = new Goods();
    private Category category = new Category();
    private String test;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }



    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}

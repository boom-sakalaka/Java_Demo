package com.o.jedis;

public class Goods {
    private Integer goodsId;
    private String goodsName;
    private String description;
    private Float price;

    public Goods() {}

    public Goods(Integer goodsId, String goodsName, String description, Float price) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.description = description;
        this.price = price;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}

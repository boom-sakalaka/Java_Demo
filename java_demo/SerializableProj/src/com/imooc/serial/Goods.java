package com.imooc.serial;

import java.io.Serializable;

public class Goods implements Serializable{
	private String goodsId;
	private String goodsName;
	private double price;
	
	public Goods () {}
	
	public Goods (String goodsId, String goodsName,double price) {
		this.setGoodsId(goodsId);
		this.setGoodsName(goodsName);
		this.setPrice(price);
	}
	
	public String getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "商品信息[编号:"+ goodsId +"],名称:"
				+ goodsName +",价格,:"+ price + "]";
	}
	
}

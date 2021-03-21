package com.imooc.set;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {
	public static void main(String [] args) {
		Map<String,String> FIFAEC = new HashMap<String,String>();
		FIFAEC.put("2014", "德国");
		FIFAEC.put("2010", "西班牙");
		FIFAEC.put("2006", "意大利");
		FIFAEC.put("2002", "巴西");
		FIFAEC.put("1998", "法国");
		
		Set<Entry<String,String>> entrySet = FIFAEC.entrySet();
		for(Entry<String,String> entry  : entrySet) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
	}
}

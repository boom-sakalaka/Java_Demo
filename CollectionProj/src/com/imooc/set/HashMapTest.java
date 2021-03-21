package com.imooc.set;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {
	public static void main(String [] args) {
		Map<String,String> FIFAEC = new HashMap<String,String>();
		FIFAEC.put("2014", "�¹�");
		FIFAEC.put("2010", "������");
		FIFAEC.put("2006", "�����");
		FIFAEC.put("2002", "����");
		FIFAEC.put("1998", "����");
		
		Set<Entry<String,String>> entrySet = FIFAEC.entrySet();
		for(Entry<String,String> entry  : entrySet) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
	}
}

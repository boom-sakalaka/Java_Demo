package com.imooc.test;

import com.imooc.player.PlayList;
import com.imooc.player.Song;

public class Test {
	// 对歌曲类进行测试
	public void testSong() {
		Song song1 = new Song("s001", "两只老虎","小太阳");
		Song song2 = new Song("s002","小燕子", "风车");
		Song song3 = new Song("s003","茉莉花","彩虹");
		Song song4 = new Song("s003","茉莉花","彩虹");
		System.out.println(song1);
		System.out.println(song2);
		System.out.println(song3);
		
		// 测试song1和song3这两个对象是否相等
		System.out.println("song1 == song3?" + (song1.equals(song3)));
		System.out.println("song3 == song4?" + (song3.equals(song4)));
	}
	
	public void testPlayList() {
		// 定义几个Song类对象
		Song song1 = new Song("s001", "两只老虎","小太阳");
		Song song2 = new Song("s002","小燕子", "风车");
		Song song3 = new Song("s003","茉莉花","彩虹");
		Song song4 = new Song("s003","茉莉花","彩虹");
		
		// 创建一个播放列表
		PlayList mainPlayList = new PlayList("主播放列表");
		mainPlayList.addToPlayList(song1);
		mainPlayList.addToPlayList(song2);
		mainPlayList.addToPlayList(song3);
		mainPlayList.addToPlayList(song4);
		
		// 显示播放列表的内容
		mainPlayList.displayAllSong();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		//test.testSong();
		test.testPlayList();
	}

}

package com.imooc.test;

import com.imooc.player.PlayList;
import com.imooc.player.PlayListCollection;
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
		
		//通过id查询歌曲信息
		Song song = mainPlayList.searchSongById("s002");
		if(song != null) {
			System.out.println("根据ID查询的歌曲信息为:");
			System.out.println(song);
		}else {
			System.out.println("该歌曲不存在!");
		}
		
		Song songTwo = mainPlayList.searchSongByName("茉莉花");
		if(songTwo != null) {
			System.out.println("根据名字查询的歌曲信息为:");
			System.out.println(songTwo);
		}else {
			System.out.println("该歌曲不存在!");
		}
		
		// 修改歌曲信息
		Song songUpdate = new Song("s005","蜗牛与黄鹂鸟","小太阳");
		mainPlayList.updateSong("s001", songUpdate);
		mainPlayList.displayAllSong();
		
		// 删除歌曲信息
		
		mainPlayList.deleteSong("s005");
		mainPlayList.displayAllSong();
	}
	
	public void testPlayListCollection() {
		// 定义几个Song类对象
		Song song1 = new Song("s001", "两只老虎","小太阳");
		Song song2 = new Song("s002","小燕子", "风车");
		Song song3 = new Song("s003","茉莉花","彩虹");
		
		// 创建主播放列表
		PlayList mainPlayList = new PlayList("主播放列表");
		// 将歌曲放入到播放列表中
		mainPlayList.addToPlayList(song1);
		mainPlayList.addToPlayList(song2);
		mainPlayList.addToPlayList(song3);
		mainPlayList.displayAllSong();
		
		// 定义一个新的播放列表 从主播放列表中的歌曲放入
		PlayList favouritePlayList = new PlayList("最喜欢的歌曲");
		favouritePlayList.addToPlayList(mainPlayList.getMusicList().get(0));
		favouritePlayList.addToPlayList(mainPlayList.getMusicList().get(1));
		favouritePlayList.displayAllSong();
		
		// 将两个播放列表添加到播放列表集合中
		PlayListCollection plc = new PlayListCollection();
		plc.addPlayList(mainPlayList);
		plc.addPlayList(favouritePlayList);
		plc.displayListName();
		// 格局播放列表的名称查询播放列表信息，并显示所有歌曲
		PlayList playList =  plc.searchPlayListByName("最喜欢的歌曲");
		playList.displayAllSong();
		
		// 删除播放列表信息
		System.out.println("删除前");
		plc.displayListName();
		plc.deletePlayList(favouritePlayList);
		System.out.println("删除后");
		plc.displayListName();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		//test.testSong();
		//test.testPlayList();
		test.testPlayListCollection();
	}

}

package com.imooc.player;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
	private String playListName; // 播放列表名称
	private List<Song> musicList; // 播放列表的歌曲集合
	
	public PlayList() {}
	
	/**
	 * 构造方法
	 * @param playListName 播放列表名称
	 */
	public PlayList(String playListName) {
		this.playListName = playListName;
		musicList = new ArrayList<Song> ();
	}
	
	/**
	 * 将歌曲添加到播放列表
	 * @param song 要添加的歌曲
	 */
	public void addToPlayList(Song song) {
		// 要排除重复添加的情况
		boolean flag = false; // 判断播放列表中的歌曲是否存在
		for(Song song1 : musicList) {
			if(song1.equals(song)) {
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println("该歌曲已经存在与播放列表中，添加失败!");
		}else {
			musicList.add(song);
		}
	}
	
	/**
	 * 显示播放列表中的所有歌曲
	 */
	public void displayAllSong() {
		System.out.println("播放列表中的所有歌曲为:");
		for(Song song: musicList) {
			System.out.println(song);
		}
	}
}

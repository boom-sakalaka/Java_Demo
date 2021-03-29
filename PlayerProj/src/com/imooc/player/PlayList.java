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
	 * 根据歌曲ID查询歌曲的信息
	 * @param id
	 * @return 歌曲类 Song
	 */
	public Song searchSongById(String id) {
		Song song = null;
		for(Song song1 : musicList) {
			if(song1.getId().equals(id)) {
				song = song1;break;
			}
		}
		return song;
	}
	
	/**
	 * 根据歌曲的名称查询歌曲
	 * @param name
	 * @return 歌曲类 Song
	 */
	public Song searchSongByName(String name) {
		Song song = null;
		for(Song song1 : musicList) {
			if(song1.getName().equals(name)) {
				song = song1;break;
			}
		}
		return song;
	}
	
	/**
	 * 根据ID 修改播放列表中的歌曲信息
	 * @param id 要修改的歌曲ID
	 * @param song 新的歌曲信息
	 */
	public void updateSong(String id, Song song) {
		Song song1 = searchSongById(id);
		if(song1 == null) {
			System.out.println("没有找到id为" + id + "对应的歌曲信息!");
		}else {
			musicList.remove(song1);
			musicList.add(song);
			System.out.println("修改成功!");
		}
	}
	
	/**
	 * 删除播放列表中的指定歌曲信息
	 * @param id
	 */
	public void deleteSong (String id) {
		Song song1 = searchSongById(id);
		if(song1 == null) {
			System.out.println("没有找到id为" + id + "对应的歌曲信息!");
		}else {
			musicList.remove(song1);
			System.out.println("删除成功!");
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

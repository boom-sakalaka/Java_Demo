package com.imooc.player;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
	private String playListName; // �����б�����
	private List<Song> musicList; // �����б�ĸ�������
	
	public PlayList() {}
	
	/**
	 * ���췽��
	 * @param playListName �����б�����
	 */
	public PlayList(String playListName) {
		this.playListName = playListName;
		musicList = new ArrayList<Song> ();
	}
	
	/**
	 * ��������ӵ������б�
	 * @param song Ҫ��ӵĸ���
	 */
	public void addToPlayList(Song song) {
		// Ҫ�ų��ظ���ӵ����
		boolean flag = false; // �жϲ����б��еĸ����Ƿ����
		for(Song song1 : musicList) {
			if(song1.equals(song)) {
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println("�ø����Ѿ������벥���б��У����ʧ��!");
		}else {
			musicList.add(song);
		}
	}
	
	/**
	 * ��ʾ�����б��е����и���
	 */
	public void displayAllSong() {
		System.out.println("�����б��е����и���Ϊ:");
		for(Song song: musicList) {
			System.out.println(song);
		}
	}
}

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
	 * ���ݸ���ID��ѯ��������Ϣ
	 * @param id
	 * @return ������ Song
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
	 * ���ݸ��������Ʋ�ѯ����
	 * @param name
	 * @return ������ Song
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
	 * ����ID �޸Ĳ����б��еĸ�����Ϣ
	 * @param id Ҫ�޸ĵĸ���ID
	 * @param song �µĸ�����Ϣ
	 */
	public void updateSong(String id, Song song) {
		Song song1 = searchSongById(id);
		if(song1 == null) {
			System.out.println("û���ҵ�idΪ" + id + "��Ӧ�ĸ�����Ϣ!");
		}else {
			musicList.remove(song1);
			musicList.add(song);
			System.out.println("�޸ĳɹ�!");
		}
	}
	
	/**
	 * ɾ�������б��е�ָ��������Ϣ
	 * @param id
	 */
	public void deleteSong (String id) {
		Song song1 = searchSongById(id);
		if(song1 == null) {
			System.out.println("û���ҵ�idΪ" + id + "��Ӧ�ĸ�����Ϣ!");
		}else {
			musicList.remove(song1);
			System.out.println("ɾ���ɹ�!");
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

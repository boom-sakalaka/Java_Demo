package com.imooc.test;

import com.imooc.player.PlayList;
import com.imooc.player.Song;

public class Test {
	// �Ը�������в���
	public void testSong() {
		Song song1 = new Song("s001", "��ֻ�ϻ�","С̫��");
		Song song2 = new Song("s002","С����", "�糵");
		Song song3 = new Song("s003","����","�ʺ�");
		Song song4 = new Song("s003","����","�ʺ�");
		System.out.println(song1);
		System.out.println(song2);
		System.out.println(song3);
		
		// ����song1��song3�����������Ƿ����
		System.out.println("song1 == song3?" + (song1.equals(song3)));
		System.out.println("song3 == song4?" + (song3.equals(song4)));
	}
	
	public void testPlayList() {
		// ���弸��Song�����
		Song song1 = new Song("s001", "��ֻ�ϻ�","С̫��");
		Song song2 = new Song("s002","С����", "�糵");
		Song song3 = new Song("s003","����","�ʺ�");
		Song song4 = new Song("s003","����","�ʺ�");
		
		// ����һ�������б�
		PlayList mainPlayList = new PlayList("�������б�");
		mainPlayList.addToPlayList(song1);
		mainPlayList.addToPlayList(song2);
		mainPlayList.addToPlayList(song3);
		mainPlayList.addToPlayList(song4);
		
		// ��ʾ�����б������
		mainPlayList.displayAllSong();
		
		//ͨ��id��ѯ������Ϣ
		Song song = mainPlayList.searchSongById("s002");
		if(song != null) {
			System.out.println("����ID��ѯ�ĸ�����ϢΪ:");
			System.out.println(song);
		}else {
			System.out.println("�ø���������!");
		}
		
		Song songTwo = mainPlayList.searchSongByName("����");
		if(songTwo != null) {
			System.out.println("�������ֲ�ѯ�ĸ�����ϢΪ:");
			System.out.println(songTwo);
		}else {
			System.out.println("�ø���������!");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		//test.testSong();
		test.testPlayList();
	}

}

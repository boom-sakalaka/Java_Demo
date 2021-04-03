package com.imooc.test;

import java.util.Scanner;

import com.imooc.player.PlayList;
import com.imooc.player.PlayListCollection;
import com.imooc.player.Song;

public class Test {
	// �Ը�������в���
	public void testSong() {
		Song song1 = new Song("s001", "��ֻ�ϻ�", "С̫��");
		Song song2 = new Song("s002", "С����", "�糵");
		Song song3 = new Song("s003", "����", "�ʺ�");
		Song song4 = new Song("s003", "����", "�ʺ�");
		System.out.println(song1);
		System.out.println(song2);
		System.out.println(song3);

		// ����song1��song3�����������Ƿ����
		System.out.println("song1 == song3?" + (song1.equals(song3)));
		System.out.println("song3 == song4?" + (song3.equals(song4)));
	}

	public void testPlayList() {
		// ���弸��Song�����
		Song song1 = new Song("s001", "��ֻ�ϻ�", "С̫��");
		Song song2 = new Song("s002", "С����", "�糵");
		Song song3 = new Song("s003", "����", "�ʺ�");
		Song song4 = new Song("s003", "����", "�ʺ�");

		// ����һ�������б�
		PlayList mainPlayList = new PlayList("�������б�");
		mainPlayList.addToPlayList(song1);
		mainPlayList.addToPlayList(song2);
		mainPlayList.addToPlayList(song3);
		mainPlayList.addToPlayList(song4);

		// ��ʾ�����б�������
		mainPlayList.displayAllSong();

		// ͨ��id��ѯ������Ϣ
		Song song = mainPlayList.searchSongById("s002");
		if (song != null) {
			System.out.println("����ID��ѯ�ĸ�����ϢΪ:");
			System.out.println(song);
		} else {
			System.out.println("�ø���������!");
		}

		Song songTwo = mainPlayList.searchSongByName("����");
		if (songTwo != null) {
			System.out.println("�������ֲ�ѯ�ĸ�����ϢΪ:");
			System.out.println(songTwo);
		} else {
			System.out.println("�ø���������!");
		}

		// �޸ĸ�����Ϣ
		Song songUpdate = new Song("s005", "��ţ������", "С̫��");
		mainPlayList.updateSong("s001", songUpdate);
		mainPlayList.displayAllSong();

		// ɾ��������Ϣ

		mainPlayList.deleteSong("s005");
		mainPlayList.displayAllSong();
	}

	public void testPlayListCollection() {
		// ���弸��Song�����
		Song song1 = new Song("s001", "��ֻ�ϻ�", "С̫��");
		Song song2 = new Song("s002", "С����", "�糵");
		Song song3 = new Song("s003", "����", "�ʺ�");

		// �����������б�
		PlayList mainPlayList = new PlayList("�������б�");
		// ���������뵽�����б���
		mainPlayList.addToPlayList(song1);
		mainPlayList.addToPlayList(song2);
		mainPlayList.addToPlayList(song3);
		mainPlayList.displayAllSong();

		// ����һ���µĲ����б� ���������б��еĸ�������
		PlayList favouritePlayList = new PlayList("��ϲ���ĸ���");
		favouritePlayList.addToPlayList(mainPlayList.getMusicList().get(0));
		favouritePlayList.addToPlayList(mainPlayList.getMusicList().get(1));
		favouritePlayList.displayAllSong();

		// �����������б����ӵ������б�������
		PlayListCollection plc = new PlayListCollection();
		plc.addPlayList(mainPlayList);
		plc.addPlayList(favouritePlayList);
		plc.displayListName();
		// ��ֲ����б������Ʋ�ѯ�����б���Ϣ������ʾ���и���
		PlayList playList = plc.searchPlayListByName("��ϲ���ĸ���");
		playList.displayAllSong();

		// ɾ�������б���Ϣ
		System.out.println("ɾ��ǰ");
		plc.displayListName();
		plc.deletePlayList(favouritePlayList);
		System.out.println("ɾ����");
		plc.displayListName();
	}

	// ���˵�
	public void mainMenu() {
		System.out.println("***************************");
		System.out.println("          **���˵�**       ");
		System.out.println("          1--�����б�����       ");
		System.out.println("          2--����������       ");
		System.out.println("          0--�˳�       ");
		System.out.println("***************************");
	}

	// �����б������˵�
	public void playListMenu() {
		System.out.println("****************************************************");
		System.out.println("        ******�����б�����******  ");
		System.out.println("        1--���������ӵ��������б�  ");
		System.out.println("        2--���������ӵ���ͨ�����б�  ");
		System.out.println("        3--ͨ������id��ѯ�����б��еĸ��� ");
		System.out.println("        4--ͨ���������Ʋ�ѯ�����б��еĸ���");
		System.out.println("        5--�޸Ĳ����б��еĸ���   ");
		System.out.println("        6--ɾ�������б��еĸ���   ");
		System.out.println("        7--��ʾ�����б��е����и���");
		System.out.println("        9--�Ż���һ���˵�    ");
		System.out.println("******************************************************");
	}

	// �������˵�
	public void playerMenu() {
		System.out.println("*****************************************************");
		System.out.println("              *****����������******");
		System.out.println("        1--�򲥷������Ӳ����б�  ");
		System.out.println("        2--�Ӳ�����ɾ�������б�  ");
		System.out.println("        3--ͨ�����ֲ�ѯ�����б� ");
		System.out.println("        4--��ʾ���в����б�����");
		System.out.println("        9--������һ���˵�   ");
		System.out.println("*****************************************************");
	}

	// ������
	public void test() {
		Test tt = new Test();
		Scanner sc = new Scanner(System.in);
		int input = 0, input1 = 0, input2 = 0;
		
		//����һ�������б�����(������)
		PlayListCollection plc = new PlayListCollection();
		//�����������б�
		PlayList mainPlayList = new PlayList("�������б�");
		//���������б����ӵ�������
		plc.addPlayList(mainPlayList);
		PlayList favouritePlayList = null;
		while (true) {
			tt.mainMenu();
			System.out.println("�������Ӧ���ֽ��в�����");
			input = sc.nextInt();
			if (input == 0) {
				break;
			}

			switch (input) {
			case 1:
				// �����б�����
				while (true) {
					tt.playListMenu();
					System.out.println("�������Ӧ�����ֶԲ����б����й�����");
					input1 = sc.nextInt();
					if (input1 == 9) {
						break;
					}
					switch (input1) {
					case 1:
						System.out.println("���������ӵ��������б�"); 
						System.out.println("������Ҫ���ӵĸ�������");
						int count = sc.nextInt();
						for(int i=1;i<=count;i++) {
							System.out.println("�������" + i+ "�׸���:");
							System.out.println("�����������id:");
							String strId = sc.next();
							System.out.println("���������������:");
							String strName = sc.next();
							System.out.println("�������ݳ���:");
							String strSinger = sc.next();
							// �������������
							Song song = new Song(strId,strName,strSinger);
							mainPlayList.addToPlayList(song);
						}
						//mainPlayList.displayAllSong();
						break;
					case 2:
						System.out.println("���������ӵ���ͨ�����б�");
						System.out.println("������Ҫ���ӵĲ����б�����:");
						String sName = sc.next();
						// ���������жϲ����б��Ƿ��ڲ������д���
						favouritePlayList = plc.searchPlayListByName(sName);
						if(favouritePlayList == null) {
							System.out.println("�ò����б������ڣ����Ƚ������б����ӵ���������!");
						}else {
							System.out.println("������Ҫ���ӵĸ�������");
							int count1 = sc.nextInt();
							for(int i=1;i<=count1;i++) {
								System.out.println("�������" + i+ "�׸���:");
								System.out.println("�����������id:");
								String strId = sc.next();
								
								// �����жϸ�id�ĸ����Ƿ����������б��д���
								Song song =  mainPlayList.searchSongById(strId);
								if(song == null) {
									// ������������ڣ��򴴽��µ����ӣ��������ӵ��������б�
									System.out.println("�ø������������б��в����ڣ��������������������Ϣ!");	
									System.out.println("���������������:");
									String strName = sc.next();
									System.out.println("�������ݳ���:");
									String strSinger = sc.next();
									// �������������
									song = new Song(strId,strName,strSinger);
									// �ֱ𽫸������ӵ���ͨ�����б����������б�
									favouritePlayList.addToPlayList(song);
									mainPlayList.addToPlayList(song);
								}else {
									// ������������������ŷ�������ֱ�����ӵ����ڵĲ����б�
									favouritePlayList.addToPlayList(song);
								}
							}
							// ��ʾ�����б��ľ�����Ϣ
							System.out.println("�������б�");
							mainPlayList.displayAllSong();
							System.out.println("��ͨ�����б�");
							favouritePlayList.displayAllSong();
						}
						break;
					case 3:
						System.out.println("ͨ������id��ѯ�����б��еĸ���");
						System.out.println("������Ҫ��ѯ�Ĳ����б�����:");
						String strPlayListName1 = sc.next();
						//��ѯ�����б��Ƿ����
						PlayList pl = plc.searchPlayListByName(strPlayListName1);
						if(pl == null) {
							System.out.println("�ò����б�������");break;
						}else {
							System.out.println("������Ҫ��ѯ�ĸ���id��");
							String strId1 = sc.next();
							Song s = pl.searchSongById(strId1);
							if(s==null) {
								System.out.println("�ø����ڲ����б�"+ strPlayListName1 +"�в�����");
							}else {
								System.out.println("�ø�����ϢΪ:");
								System.out.println(s);
							}
						}
						break;
					case 4:
						System.out.println("ͨ���������Ʋ�ѯ�����б��еĸ���");
						break;
					case 5:
						System.out.println("�޸Ĳ����б��еĸ���");
						break;
					case 6:
						System.out.println("ɾ�������б��еĸ��� ");
						break;
					case 7:
						System.out.println("��ʾ�����б��е����и���");
						break;
					default:
						System.out.println("������û�ж�Ӧ����");
						break;
					}
				}
				break;
			case 2:
				// ����������
				while (true) {
					tt.playerMenu();
					System.out.println("�������Ӧ�����ֶԲ��������й�����");
					input2 = sc.nextInt();
					if (input2 == 9)
						break;
					switch (input2) {
					case 1:
						System.out.println("�򲥷������Ӳ����б�");
						System.out.println("����Ҫ���ӵ��б�����:");
						String playerName = sc.next();
						// ����һ���µĲ����б�����
						favouritePlayList = new PlayList(playerName);
						// �������б����ӵ�������Map
						plc.addPlayList(favouritePlayList);
						break;
					case 2:
						System.out.println("�Ӳ�����ɾ�������б�");
						break;
					case 3:
						System.out.println("ͨ�����ֲ�ѯ�����б���Ϣ");
						break;
					case 4:
						System.out.println("��ʾ���в����б�����");
						break;
					default:
						System.out.println("������û�ж�Ӧ����");
						break;
					}
				}
				break;
			default:
				System.out.println("������û�ж�Ӧ����");
				break;
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test tt = new Test();
		// test.testSong();
		// test.testPlayList();
		tt.test();
	}

}

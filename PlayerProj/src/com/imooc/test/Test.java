package com.imooc.test;

import java.util.Scanner;

import com.imooc.player.PlayList;
import com.imooc.player.PlayListCollection;
import com.imooc.player.Song;

public class Test {
	// 对歌曲类进行测试
	public void testSong() {
		Song song1 = new Song("s001", "两只老虎", "小太阳");
		Song song2 = new Song("s002", "小燕子", "风车");
		Song song3 = new Song("s003", "茉莉花", "彩虹");
		Song song4 = new Song("s003", "茉莉花", "彩虹");
		System.out.println(song1);
		System.out.println(song2);
		System.out.println(song3);

		// 测试song1和song3这两个对象是否相等
		System.out.println("song1 == song3?" + (song1.equals(song3)));
		System.out.println("song3 == song4?" + (song3.equals(song4)));
	}

	public void testPlayList() {
		// 定义几个Song类对象
		Song song1 = new Song("s001", "两只老虎", "小太阳");
		Song song2 = new Song("s002", "小燕子", "风车");
		Song song3 = new Song("s003", "茉莉花", "彩虹");
		Song song4 = new Song("s003", "茉莉花", "彩虹");

		// 创建一个播放列表
		PlayList mainPlayList = new PlayList("主播放列表");
		mainPlayList.addToPlayList(song1);
		mainPlayList.addToPlayList(song2);
		mainPlayList.addToPlayList(song3);
		mainPlayList.addToPlayList(song4);

		// 显示播放列表的内容
		mainPlayList.displayAllSong();

		// 通过id查询歌曲信息
		Song song = mainPlayList.searchSongById("s002");
		if (song != null) {
			System.out.println("根据ID查询的歌曲信息为:");
			System.out.println(song);
		} else {
			System.out.println("该歌曲不存在!");
		}

		Song songTwo = mainPlayList.searchSongByName("茉莉花");
		if (songTwo != null) {
			System.out.println("根据名字查询的歌曲信息为:");
			System.out.println(songTwo);
		} else {
			System.out.println("该歌曲不存在!");
		}

		// 修改歌曲信息
		Song songUpdate = new Song("s005", "蜗牛与黄鹂鸟", "小太阳");
		mainPlayList.updateSong("s001", songUpdate);
		mainPlayList.displayAllSong();

		// 删除歌曲信息

		mainPlayList.deleteSong("s005");
		mainPlayList.displayAllSong();
	}

	public void testPlayListCollection() {
		// 定义几个Song类对象
		Song song1 = new Song("s001", "两只老虎", "小太阳");
		Song song2 = new Song("s002", "小燕子", "风车");
		Song song3 = new Song("s003", "茉莉花", "彩虹");

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
		PlayList playList = plc.searchPlayListByName("最喜欢的歌曲");
		playList.displayAllSong();

		// 删除播放列表信息
		System.out.println("删除前");
		plc.displayListName();
		plc.deletePlayList(favouritePlayList);
		System.out.println("删除后");
		plc.displayListName();
	}

	// 主菜单
	public void mainMenu() {
		System.out.println("***************************");
		System.out.println("          **主菜单**       ");
		System.out.println("          1--播放列表管理       ");
		System.out.println("          2--播放器管理       ");
		System.out.println("          0--退出       ");
		System.out.println("***************************");
	}

	// 播放列表管理菜单
	public void playListMenu() {
		System.out.println("****************************************************");
		System.out.println("        ******播放列表管理******  ");
		System.out.println("        1--将歌曲添加到主播放列表  ");
		System.out.println("        2--将歌曲添加到普通播放列表  ");
		System.out.println("        3--通过歌曲id查询播放列表中的歌曲 ");
		System.out.println("        4--通过歌曲名称查询播放列表中的歌曲");
		System.out.println("        5--修改播放列表中的歌曲   ");
		System.out.println("        6--删除播放列表中的歌曲   ");
		System.out.println("        7--显示播放列表中的所有歌曲");
		System.out.println("        9--放回上一级菜单    ");
		System.out.println("******************************************************");
	}

	// 播放器菜单
	public void playerMenu() {
		System.out.println("*****************************************************");
		System.out.println("              *****播放器管理******");
		System.out.println("        1--向播放器添加播放列表  ");
		System.out.println("        2--从播放器删除播放列表  ");
		System.out.println("        3--通过名字查询播放列表 ");
		System.out.println("        4--显示所有播放列表名称");
		System.out.println("        9--返回上一级菜单   ");
		System.out.println("*****************************************************");
	}

	// 主流程
	public void test() {
		Test tt = new Test();
		Scanner sc = new Scanner(System.in);
		int input = 0, input1 = 0, input2 = 0;
		
		//创建一个播放列表容器(播放器)
		PlayListCollection plc = new PlayListCollection();
		//创建主播放列表
		PlayList mainPlayList = new PlayList("主播放列表");
		//将主播放列表添加到播放器
		plc.addPlayList(mainPlayList);
		PlayList favouritePlayList = null;
		while (true) {
			tt.mainMenu();
			System.out.println("请输入对应数字进行操作：");
			input = sc.nextInt();
			if (input == 0) {
				break;
			}

			switch (input) {
			case 1:
				// 播放列表管理
				while (true) {
					tt.playListMenu();
					System.out.println("请输入对应的数字对播放列表进行管理：");
					input1 = sc.nextInt();
					if (input1 == 9) {
						break;
					}
					switch (input1) {
					case 1:
						System.out.println("将歌曲添加到主播放列表"); 
						System.out.println("请输入要添加的歌曲数量");
						int count = sc.nextInt();
						for(int i=1;i<=count;i++) {
							System.out.println("请输入第" + i+ "首歌曲:");
							System.out.println("请输入歌曲的id:");
							String strId = sc.next();
							System.out.println("请输入歌曲的名称:");
							String strName = sc.next();
							System.out.println("请输入演唱者:");
							String strSinger = sc.next();
							// 创建歌曲类对象
							Song song = new Song(strId,strName,strSinger);
							mainPlayList.addToPlayList(song);
						}
						//mainPlayList.displayAllSong();
						break;
					case 2:
						System.out.println("将歌曲添加到普通播放列表");
						System.out.println("请输入要添加的播放列表名称:");
						String sName = sc.next();
						// 根据名称判断播放列表是否在播放器中存在
						favouritePlayList = plc.searchPlayListByName(sName);
						if(favouritePlayList == null) {
							System.out.println("该播放列表不存在，请先将播放列表添加到播放器中!");
						}else {
							System.out.println("请输入要添加的歌曲数量");
							int count1 = sc.nextInt();
							for(int i=1;i<=count1;i++) {
								System.out.println("请输入第" + i+ "首歌曲:");
								System.out.println("请输入歌曲的id:");
								String strId = sc.next();
								
								// 首先判断该id的歌曲是否在主播放列表中存在
								Song song =  mainPlayList.searchSongById(strId);
								if(song == null) {
									// 如果歌曲不存在，则创建新的添加，并且添加到主播放列表
									System.out.println("该歌曲在主播放列表中不存在，继续输入歌曲的其它信息!");	
									System.out.println("请输入歌曲的名称:");
									String strName = sc.next();
									System.out.println("请输入演唱者:");
									String strSinger = sc.next();
									// 创建歌曲类对象
									song = new Song(strId,strName,strSinger);
									// 分别将歌曲添加到普通播放列表和主播放列表
									favouritePlayList.addToPlayList(song);
									mainPlayList.addToPlayList(song);
								}else {
									// 如果歌曲存在与主播放方法，则直接添加到现在的播放列表
									favouritePlayList.addToPlayList(song);
								}
							}
							// 显示播放列表的具体信息
							System.out.println("主播放列表");
							mainPlayList.displayAllSong();
							System.out.println("普通播放列表");
							favouritePlayList.displayAllSong();
						}
						break;
					case 3:
						System.out.println("通过歌曲id查询播放列表中的歌曲");
						System.out.println("请输入要查询的播放列表名称:");
						String strPlayListName1 = sc.next();
						//查询播放列表是否存在
						PlayList pl = plc.searchPlayListByName(strPlayListName1);
						if(pl == null) {
							System.out.println("该播放列表不存在");break;
						}else {
							System.out.println("请输入要查询的歌曲id：");
							String strId1 = sc.next();
							Song s = pl.searchSongById(strId1);
							if(s==null) {
								System.out.println("该歌曲在播放列表"+ strPlayListName1 +"中不存在");
							}else {
								System.out.println("该歌曲信息为:");
								System.out.println(s);
							}
						}
						break;
					case 4:
						System.out.println("通过歌曲名称查询播放列表中的歌曲");
						break;
					case 5:
						System.out.println("修改播放列表中的歌曲");
						break;
					case 6:
						System.out.println("删除播放列表中的歌曲 ");
						break;
					case 7:
						System.out.println("显示播放列表中的所有歌曲");
						break;
					default:
						System.out.println("该数字没有对应操作");
						break;
					}
				}
				break;
			case 2:
				// 播放器管理
				while (true) {
					tt.playerMenu();
					System.out.println("请输入对应的数字对播放器进行管理：");
					input2 = sc.nextInt();
					if (input2 == 9)
						break;
					switch (input2) {
					case 1:
						System.out.println("向播放器添加播放列表");
						System.out.println("输入要添加的列表名称:");
						String playerName = sc.next();
						// 创建一个新的播放列表对象
						favouritePlayList = new PlayList(playerName);
						// 将播放列表添加到播放器Map
						plc.addPlayList(favouritePlayList);
						break;
					case 2:
						System.out.println("从播放器删除播放列表");
						break;
					case 3:
						System.out.println("通过名字查询播放列表信息");
						break;
					case 4:
						System.out.println("显示所有播放列表名称");
						break;
					default:
						System.out.println("该数字没有对应操作");
						break;
					}
				}
				break;
			default:
				System.out.println("该数字没有对应操作");
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

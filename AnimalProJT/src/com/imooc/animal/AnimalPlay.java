package com.imooc.animal;

import java.util.List;

public class AnimalPlay {
	public void toPlay(List<? extends Animal> list) {
		for(Animal an : list) {
			an.play();
		}
	}
}

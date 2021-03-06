package main;

import java.util.ArrayList;
import java.util.List;

import animal.Animal;
import animal.Cat;
import animal.Cow;
import animal.Dog;
import factory.AnimalFactory;

public class MainClass {
	public static void main(String[] args) {
		/*
		 * Factory : object 공장
		 * 			원하는 object를 생성하기 위한 pattern
		 * animal - interface
		 * cat, dog, cow - class 
		 * 
		 *  factory
		 */
		
		List<Animal> list = new ArrayList<Animal>();
		
		
		Animal ani = null;
		
		ani = new AnimalFactory().create("고양이");
		list.add(ani);

		ani = new AnimalFactory().create("황소");
		list.add(ani);

		ani = new AnimalFactory().create("고양이");
		list.add(ani);

		ani = new AnimalFactory().create("황소");
		list.add(ani);

		ani = new AnimalFactory().create("강아지");
		list.add(ani);

		for (int i = 0; i < list.size(); i++) {
			Animal a = list.get(i);
			a.printDescripts();
			
			if( a instanceof Cat) {
				((Cat)a).catMathod();
			} else if(a instanceof Dog) {
				Dog d = (Dog)a;
				d.dogMethod();
			} else if(a instanceof Cow) {
				Cow c = (Cow)a;
				c.cowMethod();
			}
		}
//		ani.printDescripts();
//		Cat cat = (Cat)ani;
//		cat.catMathod();
	}
}

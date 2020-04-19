package core.gamestates;

import java.util.Random;

import animals.*;

import core.GameState;
import world.Map;
import graphics.*;

//import innerclasses.controller.*;

public class GS_Game extends GameState {
	
	public Map map;
	
	Lion [] lion =  new Lion [3];

	public Animal animal1,animal2,animal3,animal4;
	
	public GS_Game() {
		Random r = new Random ();
		map = new Map(20,20);
		for (int i=0;i<3;i++) {
			lion [i] =  new Lion (r.nextInt(200), r.nextInt(120));
		}
		
		//animal = new Lion(40,40);
		animal1 = new Elephant(35,90);
		animal2 = new Zebra(160,84);
		animal3 = new Antelope(180,90);
		animal4 = new Giraffe(80,100);
	}
	
	public void update() {
		for (int i=0;i<3;i++) {
			lion [i].randMovment();
		}
		//animal[].control();
		animal1.randMovment();
		animal2.randMovment();
		animal3.randMovment();
		animal4.randMovment();
	}
	
	public void render(Screen s) {
		s.clear(0x0000FF);
		
		map.render(s);
		for (int i=0;i<3;i++) {
			lion [i].render(s);
		}
		//animal[].render(s);
		animal1.render(s);
		animal2.render(s);
		animal3.render(s);
		animal4.render(s);
	}
}

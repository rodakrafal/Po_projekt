package core.gamestates;


import java.awt.event.KeyEvent;



import core.GameState;
import world.Map;
import graphics.Screen;
import graphics.Spread;
import graphics.Spreadsheet;
import input.Keyboard;

public class Gs_Game extends GameState {
	
	float x=40, y=40;
	
	public static final Spread s = new Spread (0,0,16,Spreadsheet.def);
	public Map map;
	
	public Gs_Game() {
		map = new Map(20,20);
	
	}
	
	public void update() {
		float speed=0.5f;
		if(Keyboard.getKey(KeyEvent.VK_W)) {
			y-=speed;
		}
		else if(Keyboard.getKey(KeyEvent.VK_S)) {
			y+=speed;
		}
		if(Keyboard.getKey(KeyEvent.VK_A)) {
			x-=speed;
		}
		else if(Keyboard.getKey(KeyEvent.VK_D)) {
			x+=speed;
		}
	}
	
	public void render(Screen s) {
		s.clear(0x0000FF);
		
		map.render(s);
		
		s.renderSpread((int)x, (int)y, this.s);
	}
}
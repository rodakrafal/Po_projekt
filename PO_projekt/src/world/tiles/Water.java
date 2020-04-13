package world.tiles;

import graphics.Screen;
import graphics.Spread;
import graphics.Spreadsheet;
import world.Tile;

public class Water extends Tile {
public static final Spread texture = new Spread(32,16,16,16,Spreadsheet.def);
	
	public Water() {
		id=3;
	}
	
	public void render(Screen s, int x, int y) {
		s.renderSpread(x*16, y*16, texture);
		
		
	}
}
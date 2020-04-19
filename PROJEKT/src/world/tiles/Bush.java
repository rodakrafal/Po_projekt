package world.tiles;

import graphics.Screen;
import graphics.Spread;
import graphics.Spreadsheet;
import world.Tile;

public class Bush extends Tile {

	public static final Spread texture = new Spread(16,16,16,16,Spreadsheet.def);
	
	public Bush() {
		id=2;
	}
	
	public void render(Screen s, int x, int y) {
		s.renderSpread(x*16, y*16, texture);
		
		
	}
	
}

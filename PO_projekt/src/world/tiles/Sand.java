package world.tiles;

import graphics.*;
import world.Tile;

public class Sand extends Tile {
	
	public static final Spread texture = new Spread(0,16,16,16,Spreadsheet.def);
	 
	public Sand() {
		id  = 1;
	}
	
	public void render(Screen s, int x, int y) {
		s.renderSpread(x*16, y*16, texture);
		
		
	}
	
	
}
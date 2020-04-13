package world;

import graphics.Screen;

public class Map {
	
	public final int WIDTH,HEIGHT;
	
	public Tile[][] tiles;
	
	public Map(int w, int h) {
		WIDTH = w;
		HEIGHT = h;
		tiles = new Tile[w][h];
		
		clear(1);
	}
	
	public void clear(int id) {
		
		for(int y = 0 ; y < HEIGHT ; ++y) {
			for(int x = 0; x < WIDTH ; ++x) {
				tiles[x][y] = Tile.getTile(id);
			}
		}
	}
	
	public void render(Screen s) {
		for(int y = 0 ; y < HEIGHT ; ++y) {
			for(int x = 0; x < WIDTH ; ++x) {
				tiles[x][y].render(s, x, y);
			}
	}
	
}
}
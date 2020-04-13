package world;


import graphics.Screen;
import world.tiles.*;

public class Tile {

	public int id;
	
	public static Tile getTile(int id) {
	if(id==1)return new Sand();
	if(id==2) return new Bush();
	else return new Water();
	}
	
	public void update() {}
	
	public void render(Screen s ,int x, int y) {}
	
}
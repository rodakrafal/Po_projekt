package animals;

import graphics.Screen;

public abstract class Animal {
	
	public Animal() {}
	
	public void render(Screen s) {}
	
	public void update() {}
	
	public void randMovment() {}
	
	public void setX() {}
	
	public void setY() {}
	
	public abstract int getX();
	
	public abstract int getY();
	
	public abstract float getSurRat();
}

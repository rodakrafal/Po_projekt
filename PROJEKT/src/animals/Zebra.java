package animals;

import java.util.Random;

import graphics.*;


public class Zebra extends Animal{
	
public static final Spread skin = new Spread (48,0,16,Spreadsheet.def);
	
	private float x,y,
	speed=0.5f,
	surRat=13f;
	
	public Zebra(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void randMovment() {
		
		Random r = new Random ();
		int z;
//		if(Keyboard.getKey(KeyEvent.VK_W)) {
//			y-=speed;
//		}
//		else if(Keyboard.getKey(KeyEvent.VK_S)) {
//			y+=speed;
//		}
//		else {
				z=r.nextInt(70);
				if(z==1)y-=speed+2;
				else if(z==2)y+=speed+2;
				else if(z==3)x-=speed+2;
				else if(z==4)x+=speed+2;
				
		}
//		if(Keyboard.getKey(KeyEvent.VK_A)) {
//			x-=speed;
//		}
//		else if(Keyboard.getKey(KeyEvent.VK_D)) {
//			x+=speed;	
//		}
	
	public void setX(int x) {
		this.x=x;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
	public void setPos(int x,int y) {
		setX(x);
		setY(y);
	}
	
	public int getX(){
		return (int)this.x;
	}
	
	public int getY() {
		return(int)this.y;
	}
	
	public void render(Screen s) {
		
		s.renderSpread((int)x, (int)y, this.skin);
		
	}
	
	public float getSurRat() {
		return surRat;
	}
}

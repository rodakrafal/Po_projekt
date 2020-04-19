package input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener{

	private static final int count = 200;
	private static boolean keys [] = new boolean[count];
	private static boolean keys_prev[] = new boolean [count];
	
	public Keyboard() {
		for(int i = 0; i < count ; ++i) {
			keys[i]=false;
		}
		for(int i = 0; i < count ; ++i) {
			keys_prev[i]=false;
		}
	}

	public void keyTyped(KeyEvent e) {
		
		
	}

	public void update() {
		for (int i = 0 ; i < count ; ++i ) {
			if(!keys[i]) {
				keys_prev[i]=false;
			}
		}
	}
	
	public static boolean getKey(int key) {
		return keys[key];
	}
	
	public static boolean getKeyOnce(int key) {
		if(!keys_prev[key] && keys[key]) {
			keys_prev[key]=true;
			return true;
		}
		return false;
	}
	
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()]=true;
		
	}

	
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()]=false;
		
	}
	
}

package core.gamestates;

import java.awt.event.KeyEvent;

import core.GameState;
import core.GameStateManager;
import graphics.Screen;
import graphics.Spread;
import graphics.Spreadsheet;
import input.Keyboard;


public class GS_Menu extends GameState {
	
	public static final Spread s_start = new Spread(0,32,64,16, Spreadsheet.def);
	public static final Spread s_credits = new Spread(0,48,80,16,Spreadsheet.def);
	public static final Spread s_exit = new Spread(0,64,48,16,Spreadsheet.def);
	public static final Spread s_pointer = new Spread(0,80,16,16,Spreadsheet.def);
	
	private int choose = 0;
	private float pointerPosition = 0;
	
	public GS_Menu() {
		
	}
	
	public void update() {
		if(Keyboard.getKey(KeyEvent.VK_ENTER)){
			if(choose==0) GameStateManager.ChangeGameState(GameStateManager.GAME_STATE_GAME);	//Start
			if(choose==2) GameStateManager.ChangeGameState(GameStateManager.GAME_STATE_EXIT);  //Exit
			
		}
		
		if(Keyboard.getKeyOnce(KeyEvent.VK_DOWN)) choose++;
		if(Keyboard.getKeyOnce(KeyEvent.VK_UP)) choose--;
		
		if(choose > 2 ) choose = 0;
		if(choose < 0 ) choose = 2;
		
		if(choose==0) setPointer(40);	//Start
		if(choose==1) setPointer(60);   //Credits
		if(choose==2) setPointer(80);   //Exit
		
		
	}
	
	private void setPointer (int d) {
		pointerPosition += (d-pointerPosition)/4;
	}
	
	public void render(Screen s) {
		s.clear(0x000000);
		s.renderSpread(18, 40, s_start);
		s.renderSpread(18, 60, s_credits);
		s.renderSpread(18, 80, s_exit);
		s.renderSpread(0, (int)pointerPosition, s_pointer);
	}
}

package graphics;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

public class Screen {
	
	public final int WIDTH;
	public final int HEIGHT;
	
	private BufferedImage image;
	private int[] pixels;
	

	public Screen(int w, int h) {
		WIDTH = w;
		HEIGHT = h;
		image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		pixels = ((DataBufferInt)image.getRaster().getDataBuffer()).getData();
	}
	
	
	public void clear(int color) {
		for(int i = 0; i < WIDTH * HEIGHT ; ++i) {
			pixels[i] = color;
		}
	}
	
	public BufferedImage getImage() {
		return image;
	}
	
	
	public void renderSpread(int px, int py, Spread s) {
		for(int y = 0; y < s.height ; ++y)
			for(int x = 0; x< s.width; ++x) {
				 pixel(px+x,py+y,s.sp.pixels[s.x+x+(s.y+y)*s.sp.WIDTH]);
			}
	}
	
	public void renderSpread(int px, int py, int sx, int sy, int size, Spreadsheet s) {
		for(int y = 0; y < size ; ++y)
			for(int x = 0; x< size; ++x) {
				 pixel(px+x,py+y,s.pixels[sx+x+(sy+y*s.WIDTH)]);
			}
	}
	
	
	private void pixel(int x, int y, int color) {
		if(x<0 || x>=WIDTH || y<0 || y>= HEIGHT ||  color == 0xFFFF00FF) return;
		
		pixels[x+y*WIDTH]=color;
	}
	
}

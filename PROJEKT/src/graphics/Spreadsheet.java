package graphics;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Spreadsheet {
	
	public static final Spreadsheet def = new Spreadsheet("/Spreadsheet.png");
	
	public int WIDTH, HEIGHT;
	public int[] pixels; 
	
	public Spreadsheet (String path) {
		try {
			BufferedImage image = ImageIO.read(Spreadsheet.class.getResource(path));
			WIDTH = image.getWidth();
			HEIGHT = image.getHeight();
			pixels = new int [WIDTH*HEIGHT];
			
			image.getRGB(0,0,WIDTH,HEIGHT,pixels,0,WIDTH);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}

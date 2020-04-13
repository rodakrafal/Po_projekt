package graphics;

public class Spread {
	public int x,y,width,height;
	public Spreadsheet sp;
	
	public Spread(int x, int y, int width, int height, Spreadsheet sp) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height= height;
		this.sp=sp;
	}
	
	public Spread(int x, int y, int size, Spreadsheet sp) {
		this.x = x;
		this.y = y;
		this.width = size;
		this.height= size;
		this.sp=sp;
	}
}
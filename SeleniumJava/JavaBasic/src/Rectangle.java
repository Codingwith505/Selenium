
public class Rectangle {

	private int Length;
	private int Width;
	
	
	public int getLength() {
		return Length;
	}
	public void  setLength(int length) {
		this.Length = length;
	}
	
	public int getWidth() {
		return Width;
	}
	public void setWidth(int width) {
		this.Width = width;
	}
	
	public void display(int length, int width) {
		System.out.println("Rectangle Dimesion");
		System.out.println("Length:"+ length);
		System.out.println("Width:"+ width);
	}
	
	public int intergerarea(int length, int width) {
		
		
		return length*width;
	}
}

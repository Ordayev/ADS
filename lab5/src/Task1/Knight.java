package Task1;

public class Knight implements Moveable, Figure{
	private int x = 6;
	private int y = 1;
	int dirX;
	int dirY;
	
	public Knight(int x, int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public int position() {
		return ((x + dirX) * (y * dirY))%3;
	}

}

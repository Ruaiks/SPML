package strips;

public abstract class Piece {
	private int position; //0 is topleft, 3 topright, 5 middle, etc.
	public Piece(int position) {
		this.position = position;
	}
	
	public abstract int getKind(); //Should be 0 if circle and 1 if cross
}

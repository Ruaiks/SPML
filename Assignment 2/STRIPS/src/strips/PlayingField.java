package strips;

public class PlayingField {
	private Field topLeft, topMiddle, topRight, middleLeft, middleMiddle, middleRight, bottomLeft, bottomMiddle, bottomRight;
	private boolean isDone; 
	
	public PlayingField(int topLeft, int topMiddle, int topRight, int middleLeft, int middleMiddle, int middleRight, int bottomLeft, int bottomMiddle, int bottomRight) {
		this.topLeft = new Field(topLeft);
		this.topMiddle = new Field(topMiddle);
		this.topRight = new Field(topRight);
		this.middleLeft = new Field(middleLeft);
		this.middleRight = new Field(middleRight);
		this.bottomLeft = new Field(bottomLeft);
		this.bottomMiddle = new Field(bottomMiddle);
		this.bottomRight = new Field(bottomRight);
	}
	
	public boolean getFinishedState() {
		return isDone;
	}
	
	public void placePiece(Field field, Piece piece) {
		
	}
	
}

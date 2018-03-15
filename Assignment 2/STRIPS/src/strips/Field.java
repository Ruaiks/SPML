package strips;

public class Field {
	private boolean isEmpty, hasCircle, hasCross;
	
	public Field() {
		isEmpty = true;
		hasCircle = false;
		hasCross = false;
	}
	
	/*
	 * 0 is empty, 1 is circle, 2 is cross
	 */
	public Field(int contents) {
		switch (contents) {
		case 0:
			isEmpty = true;
			hasCircle = false;
			hasCross = false;
			break;
		case 1:
			isEmpty = false;
			hasCircle = true;
			hasCross = false;
			break;
		case 2:
			isEmpty = false;
			hasCross = true;
			hasCircle = false;
			break;
		default:
			throw new IllegalArgumentException("You can only fill a field with a cross or a circle.");
		}
	}
	
	/**
	 * 
	 * @return 0 if empty, 1 if circle, 2 if cross, -1 if none, which shouldn't happen.
	 */
	public int getContents() {
		if (isEmpty)
			return 0;
		if (hasCircle)
			return 1;
		if (hasCross)
			return 2;
		return -1;
	}
}

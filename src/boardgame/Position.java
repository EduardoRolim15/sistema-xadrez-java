package boardgame;

public class Position {
	
	private int row;
	private int column;
	
	public Position(int row, int column) {
		this.row = row;
		column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		column = column;
	}

	@Override
	public String toString() {
		return row + ", " + column;
	}
	
}


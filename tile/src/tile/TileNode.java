package tile;

public class TileNode {
	private boolean isGolden;
	private TileNode east;
	private TileNode west;
	private TileNode north;
	private TileNode south;
	public TileNode(char value) {
		this.value=value;
	}
	
	public char value;
	
	public char getValue() {
		return value;
	}
	public void setValue(char value) {
		this.value = value;
	}
	public boolean isGolden() {
		return isGolden;
	}
	public void setGolden(boolean isGolden) {
		this.isGolden = isGolden;
	}
	public TileNode getEast() {
		return east;
	}
	public void setEast(TileNode east) {
		this.east = east;
	}
	public TileNode getWest() {
		return west;
	}
	public void setWest(TileNode west) {
		this.west = west;
	}
	public TileNode getNorth() {
		return north;
	}
	public void setNorth(TileNode north) {
		this.north = north;
	}
	public TileNode getSouth() {
		return south;
	}
	public void setSouth(TileNode south) {
		this.south = south;
	}

}

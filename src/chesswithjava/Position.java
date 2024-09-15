package chesswithjava;

public class Position {
	//input N1f3 -> "N1" "f" "3"
	public char pos1;
	public char pos2;
	public int index_x;
	public int index_y;
	
	int[] Alpabet = {1,2,3,4,5,6,7,8};
	
	Position(char pos1, char pos2){
		this.pos1=pos1;
		this.pos2=pos2;
		this.index_x = (int) (pos1-'a')-1;
		this.index_y = (int) (pos2-'0')-1;
	}
	
	public boolean equals(Position position) {
		if((this.index_x==position.index_x)&&(this.index_y==position.index_y)) {
			return true;
		}
		return false;
	}
}

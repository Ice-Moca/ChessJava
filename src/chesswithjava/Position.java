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
		this.index_x = (int) (pos1 - 'a');
		this.index_y = (int) (pos2-'0');
	}
	
	
	
}

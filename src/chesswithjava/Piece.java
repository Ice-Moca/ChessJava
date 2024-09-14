package chesswithjava;

public abstract class Piece {
	private final PieceType pieceType;
    private final PlayerType playerType;
    public Position pos;

    //Piece 선언
    Piece(PieceType pieceType, PlayerType playerType,Position pos) {
        this.pieceType = pieceType;
        this.playerType = playerType;
        this.pos=pos;
    }
    
    //Getter method
    public PieceType getPieceType() {
        return pieceType;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }
    //Piece 입력된 자리가 자기자신의 자리인지 확인
    public boolean Stable(Position Targetposition){
		if(this.pos.index_x==Targetposition.index_x && this.pos.index_y==Targetposition.index_y) {
			return false;
		}
		else {
			return true;
		}
    }
    //Piece 이동가능한지 확인
    public boolean moveAble(Board board, PlayerType playeType, Position Targetposition){
		
		return false;
    }
    
    //Piece 공격가능한지 확인 
	public boolean Attackable(Board board, PlayerType playeType, Position Targetposition) {
		
		return false;
    }
    
    //이동 시 King이 check되는지 확인
	public boolean CheckIfMoved(Board board, PlayerType playeType, Position Targetposition){
		
    	return false;
    }
    
    //확인 후 진짜 이동
    public void Move(Board board, PlayerType playeType, Position Targetposition) {
    	
    }    
    
}

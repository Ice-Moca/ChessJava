package chesswithjava;

import static chesswithjava.PieceType.*;

public class PieceBishop extends Piece {

	PieceBishop(PlayerType playerType,Position pos) {
		super(Bishop, playerType, pos);
		// TODO Auto-generated constructor stub
	}

	//Piece 이동가능한지 확인
	@Override
    public boolean moveAble(Board board, PlayerType playeType, Position Targetposition){
		//대각선인지
		
		//중간에 다른 기물이 있는지
		
		return false;
    }
    
    //Piece 공격가능한지 확인 
	@Override
	public boolean Attackable(Board board, PlayerType playeType, Position Targetposition) {
		//대각선인지
		
		//중간에 다른 기물이 있는지
		
		return false;
    }
    
    //이동 시 King이 check되는지 확인
	@Override
	public boolean CheckIfMoved(Board board, PlayerType playeType, Position Targetposition){
    	return false;
    }
    
    //확인 후 진짜 이동
	@Override
    public void Move(Board board, PlayerType playeType, Position Targetposition) {
    	
    }
}

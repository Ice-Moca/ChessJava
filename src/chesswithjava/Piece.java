package chesswithjava;

import chesswithjava.PieceType.*;
import chesswithjava.PlayerType.*;

public abstract class Piece {
	private final PieceType pieceType;
    private final PlayerType playerType;

    //Piece 선언
    Piece(PieceType pieceType, PlayerType playerType) {
        this.pieceType = pieceType;
        this.playerType = playerType;
    }
    
    //Getter method
    public PieceType getPieceType() {
        return pieceType;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }
    
    //Piece 이동가능한지 확인
    public boolean moveAble(Board board, PlayerType playeTtype, Position position, Position Targetposition){
		return false;
    	
    }
    
    //Piece 공격가능한지 확인 
    public boolean Attackable(Board board, PlayerType playeTtype, Position position, Position Targetposition) {
    	return false;
    }
    
    //이동 시 King이 check되는지 확인
    public boolean CheckIfMoved(Board board, PlayerType playeTtype, Position position, Position Targetposition){
    	return false;
    }
    
    //확인 후 진짜 이동
    public void Move(Board board, PlayerType playeTtype, Position position, Position Targetposition) {
    	
    }
    
    
}

package chesswithjava;

import static chesswithjava.PieceType.*;
import static chesswithjava.PlayerType.*;

public class PiecePawn extends Piece {
	public int moved =0;
	
	PiecePawn(PieceType pieceType, PlayerType playerType,Position pos) {
		super(Pawn, playerType, pos);
		// TODO Auto-generated constructor stub
	}

	//Piece 이동가능한지 확인
	@Override
	public boolean moveAble(Board board, PlayerType playeType, Position Targetposition){
		//이동하려는 칸이 빈칸인가?
		if(board.getPiece(Targetposition).getPieceType() == Empty ) {
		}
		else {
			return false;
		}
		if( playeType == White ) {
			if((Targetposition.index_x==this.pos.index_x) && (Targetposition.index_y-this.pos.index_y==1)) {
				moved =1;
				return true;
			}
			if((Targetposition.index_x==this.pos.index_x) && (Targetposition.index_y-this.pos.index_y==2) && (moved == 0)) {
				moved =1;
				return true;
			}
		}
		if( playeType == Black ) {
			if((Targetposition.index_x==this.pos.index_x) && (Targetposition.index_y-this.pos.index_y==-1)) {
				moved =1;
				return true;
			}
			if((Targetposition.index_x==this.pos.index_x) && (Targetposition.index_y-this.pos.index_y==-2) && (moved == 0)) {
				moved =1;
				return true;
			}
		}
		return false;
	}

	//Piece 공격가능한지 확인
	@Override
	public boolean Attackable(Board board, PlayerType playeType, Position Targetposition) {
		//이동하려는 칸이 상대인가?
		if(board.getPiece(Targetposition).getPieceType() != Empty ) {
			if(board.getPiece(Targetposition).getPlayerType() == chesswithjava.PlayerType.getPlayer2TypeByPlayer1(playeType)) {
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
		if( playeType == White ) {
			if((Math.abs(Targetposition.index_x-this.pos.index_x)==1) && (Targetposition.index_y-this.pos.index_y==1)) {
				moved =1;
				return true;
			}
		}
		if( playeType == Black ) {
			if((Math.abs(Targetposition.index_x-this.pos.index_x)==1) && (Targetposition.index_y-this.pos.index_y==-1)) {
				moved =1;
				return true;
			}
		}
		//앙파상 구현
		
		return false;
	}
}

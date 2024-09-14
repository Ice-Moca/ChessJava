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
		//이동하려는 칸이 빈칸인가?
		if(board.getPiece(Targetposition).getPieceType() == Empty ) {
			
		}
		else {
			return false;
		}
			
		//대각선인지
		if((Math.abs(Targetposition.index_x-this.pos.index_x)==Math.abs(Targetposition.index_y-this.pos.index_y))&this.Stable(Targetposition)) {
			//중간에 다른 기물이 있는지Targetposition
			int xDiff=Targetposition.index_x-this.pos.index_x;
			int yDiff=Targetposition.index_y-this.pos.index_y;
			
			if(xDiff>yDiff) {
				for(int i = 1; i<=xDiff; i++) {
					if(board.getBoard()[this.pos.index_x+i][this.pos.index_y-i].getPieceType() == Empty ) {
						
					}
					else {
						return false;
					}					
				}
				return true;
			}
			else if(xDiff<yDiff) {
				for(int i = 1; i<=yDiff; i++) {
					if(board.getBoard()[this.pos.index_x-i][this.pos.index_y+i].getPieceType() == Empty ) {
						
					}
					else {
						return false;
					}					
				}
				return true;
			}
			else if(xDiff>0) {
				for(int i = 1; i<=xDiff; i++) {
					if(board.getBoard()[this.pos.index_x+i][this.pos.index_y+i].getPieceType() == Empty ) {
						
					}
					else {
						return false;
					}					
				}
				return true;
			}
			else {
				for(int i = 1; i<=-xDiff; i++) {
					if(board.getBoard()[this.pos.index_x-i][this.pos.index_y-i].getPieceType() == Empty ) {
						
					}
					else {
						return false;
					}					
				}
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
			if(board.getPiece(Targetposition).getPlayerType() == PlayerType.getPlayer2TypeByPlayer1(playeType)) {
				
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
			
		//대각선인지
		if((Math.abs(Targetposition.index_x-this.pos.index_x)==Math.abs(Targetposition.index_y-this.pos.index_y))&this.Stable(Targetposition)) {
			//중간에 다른 기물이 있는지Targetposition
			int xDiff=Targetposition.index_x-this.pos.index_x;
			int yDiff=Targetposition.index_y-this.pos.index_y;
			
			if(xDiff>yDiff) {
				for(int i = 1; i<=xDiff; i++) {
					if(board.getBoard()[this.pos.index_x+i][this.pos.index_y-i].getPieceType() == Empty ) {
						
					}
					else {
						return false;
					}					
				}
				return true;
			}
			else if(xDiff<yDiff) {
				for(int i = 1; i<=yDiff; i++) {
					if(board.getBoard()[this.pos.index_x-i][this.pos.index_y+i].getPieceType() == Empty ) {
						
					}
					else {
						return false;
					}					
				}
				return true;
			}
			else if(xDiff>0) {
				for(int i = 1; i<=xDiff; i++) {
					if(board.getBoard()[this.pos.index_x+i][this.pos.index_y+i].getPieceType() == Empty ) {
						
					}
					else {
						return false;
					}					
				}
				return true;
			}
			else {
				for(int i = 1; i<=-xDiff; i++) {
					if(board.getBoard()[this.pos.index_x-i][this.pos.index_y-i].getPieceType() == Empty ) {
						
					}
					else {
						return false;
					}					
				}
				return true;
			}
		}
		return false;
    }
    
    
    //확인 후 진짜 이동
	@Override
    public void Move(Board board, PlayerType playeType, Position Targetposition) {
    	this.pos = Targetposition;
    	//보드에서 board(targetpostition)=board(position)이 되도록 수정;
    }
}

package chesswithjava;

import static chesswithjava.PieceType.*;

public class PieceKing extends Piece {
	public int AbleCastling = 1;

	PieceKing(PieceType pieceType, PlayerType playerType,Position pos) {
		super(King, playerType, pos);
		// TODO Auto-generated constructor stub
	}
	//Piece 이동가능한지 확인
	@Override
	public boolean moveAble(Board board, PlayerType playeType, Position Targetposition){

		int dx = Math.abs(Targetposition.index_x - this.pos.index_x);
		int dy = Math.abs(Targetposition.index_y - this.pos.index_y);

		// King 사각형 내부에 있는지 check
    	if (dx <= 1 && dy <= 1 && this.Stable(Targetposition)) {
			if (board.getPiece(Targetposition).getPieceType() == PieceType.Empty ||
					board.getPiece(Targetposition).getPlayerType() != playeType) {
				return true; // Move is valid
			}
		}

		// 캐슬링 확인
    	if (AbleCastling == 1) {
			Position leftRookPosition = new Position('a','1'); // Assuming column 0 for left rook
			Position rightRookPosition = new Position('h','1'); // Assuming column 7 for right rook

			// Check castling to the left
			if (Targetposition.equals(new Position('c','1')) &&
				board.getPiece(leftRookPosition).getPieceType() == PieceType.Rook &&
				AbleCastling == 1) {
				// Check if the spaces between King and Rook are empty
				if (board.getPiece(new Position('d','1')).getPieceType() == PieceType.Empty) { 
					// No attack on the target position
					AbleCastling =2;
					return true; // Castling to the left is valid
				}
			}

			// Check castling to the right
			if (Targetposition.equals(new Position('e','1')) &&
				board.getPiece(rightRookPosition).getPieceType() == PieceType.Rook &&
				AbleCastling == 1) {
			// Check if the spaces between King and Rook are empty
				if (board.getPiece(new Position('f','1')).getPieceType() == PieceType.Empty ) { // No attack on the target position
					AbleCastling =2;
					return true; // Castling to the right is valid
				}
			}
		}
    	return false; // Move is invalid
    }

	//Piece 공격가능한지 확인
	@Override
	public boolean Attackable(Board board, PlayerType playeType, Position Targetposition) {

		int dx = Math.abs(Targetposition.index_x - this.pos.index_x);
		int dy = Math.abs(Targetposition.index_y - this.pos.index_y);

		// King 사각형 내부에 있는지 check
    	if (dx <= 1 && dy <= 1 && this.Stable(Targetposition)) {
			if (board.getPiece(Targetposition).getPlayerType() == PlayerType.getPlayer2TypeByPlayer1(playeType) ||
					board.getPiece(Targetposition).getPlayerType() != playeType) {
				return true; // Move is valid
			}
		}
    	return false; // Move is invalid
	}

	
}

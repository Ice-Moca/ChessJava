package chesswithjava;

import static chesswithjava.PieceType.Empty;

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
    	 return !(this.pos.equals(Targetposition));
    }
    //Piece 이동가능한지 확인
    public boolean moveAble(Board board, PlayerType playeType, Position Targetposition){

        return false;
    }
    
    //Piece 대각 이동가능한지 확인
    public boolean DiagonalAble(Board board, PlayerType playeType, Position Targetposition){
    	//대각선인지
    	 if (Math.abs(Targetposition.index_x - this.pos.index_x) == Math.abs(Targetposition.index_y - this.pos.index_y)) {
             int xDirection = Integer.compare(Targetposition.index_x, this.pos.index_x);
             int yDirection = Integer.compare(Targetposition.index_y, this.pos.index_y);

             int x = this.pos.index_x + xDirection;
             int y = this.pos.index_y + yDirection;
             
             while (x != Targetposition.index_x && y != Targetposition.index_y) {
                 if (board.getBoard()[x][y].getPieceType() != Empty) {
                     return false;
                 }
                 x += xDirection;
                 y += yDirection;
             }
             return true;
         }
         return false;
    }
    
    //Piece 수평수직 이동가능한지 확인
    public boolean LineMoveAble(Board board, PlayerType playerType, Position targetPosition) {
        // Check if the target position is either on the same row or column
        if ((targetPosition.index_x == this.pos.index_x ) ^( targetPosition.index_y == this.pos.index_y) ) {
            // Check horizontal movement
            if (targetPosition.index_y == this.pos.index_y) {
                int startX = Math.min(this.pos.index_x, targetPosition.index_x);
                int endX = Math.max(this.pos.index_x, targetPosition.index_x);
                
                for (int x = startX + 1; x < endX; x++) {
                    if (board.getBoard()[x][this.pos.index_y].getPieceType() != Empty) {
                        return false;
                    }
                }
                return true;
            }

            // Check vertical movement
            if (targetPosition.index_x == this.pos.index_x) {
                int startY = Math.min(this.pos.index_y, targetPosition.index_y);
                int endY = Math.max(this.pos.index_y, targetPosition.index_y);
                
                for (int y = startY + 1; y < endY; y++) {
                    if (board.getBoard()[this.pos.index_x][y].getPieceType() != Empty) {
                        return false;
                    }
                }
                return true;
            }
        }
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
		this.pos = Targetposition;
		//보드에서 board(targetpostition)=board(position)이 되도록 수정;
	}

}
package chesswithjava;

public class Board {
	 private static final int MAX_NUM_OF_LINE = 8;

	 private final Piece[][] board = {};
//	 private final Rule rule;
//	 private final ChessBoardSetting chessBoardSetting;
//	 private final ChessPromotionManager chessPromotionManager;
	 
	 public static int getMaxNumOfLine() {
	      return MAX_NUM_OF_LINE;
	 }

	 public Piece[][] getBoard() {
	      return board.clone();
	 }
	 
	 public Piece[][] getInitialBoard(){
		 Piece[][] initalboard = new Piece[Board.getMaxNumOfLine()][Board.getMaxNumOfLine()];
		 //초기 보드 for loop으로 생성
		 return initalboard;
	 }
	 
}

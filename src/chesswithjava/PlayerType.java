package chesswithjava;

public enum PlayerType {
	//종류 None은 Board에서 빈칸을 위한 색
	White, Black, None;
	
	//상대 편 색을 확인하고 나의 색을 리턴한다.
	public static PlayerType getPlayer2TypeByPlayer1(PlayerType player1type) {
		return player1type == White ? Black : White;
	}
}

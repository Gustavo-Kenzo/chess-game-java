package boardgame;

public class Piece {
	protected Position position; //posicao deve ser nula ao criar a peca
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
	

}

package util;

public class Board {

    private Cell[][] board;

    public Board(int rows, int cols){
        this.board = new Cell[rows][cols];
        for (int i=0; i<rows; i++ ){
            for (int j=0; j<cols; j++){
                board[i][j] = new Cell(new Coordinate(i,j));
            }
        }
    }

    public Cell getCell(int x, int y){
        return this.board[x][y];
    }

    public void putPieces(Piece[] pieces, int[][] coordinates){
        if (pieces.length != coordinates.length) return;

        for (int i=0; i< pieces.length; i++){
            int x = coordinates[i][0];
            int y = coordinates[i][1];
            this.board[x][y].setPiece(pieces[i]);
        }
    }

}

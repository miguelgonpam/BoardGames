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

}

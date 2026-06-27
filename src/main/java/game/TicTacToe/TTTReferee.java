package game.TicTacToe;

import lombok.*;
import util.*;

import java.util.Arrays;

@Getter
@Setter
public class TTTReferee implements Referee{

    private Color turn;
    private Board board;

    public TTTReferee(){
        this.turn = Color.WHITE;
        Board board = new Board(3,3);
    }

    public boolean legalMove(@NonNull Player player, Cell start, @NonNull Cell end){
        if (player.getColor() == null) return false;

        TTTPiece piece = new TTTPiece(player.getColor());

        return (end.getPiece() == null);
    }

    public void move(@NonNull Player player, Cell start, @NonNull Cell end){
        TTTPiece piece = new TTTPiece(player.getColor());
        end.setPiece(piece);
        turn = (turn == Color.WHITE)?Color.BLACK:Color.WHITE;
    }

    public boolean isWinner(Color color) {
        int[][][] possible_wins = {
                {{0, 0}, {0, 1}, {0, 2}},
                {{1, 0}, {1, 1}, {1, 2}},
                {{2, 0}, {2, 1}, {2, 2}},
                {{0, 0}, {1, 0}, {2, 0}},
                {{0, 1}, {1, 1}, {2, 1}},
                {{0, 2}, {1, 2}, {2, 2}},
                {{0, 0}, {1, 1}, {2, 2}},
                {{0, 2}, {1, 1}, {2, 0}},
        };
         int equal_count;
         for (int[][] possibility : possible_wins){
             equal_count = 0;
             for (int[] cell : possibility){
                 TTTPiece piece = (TTTPiece) board.getCell(cell[0], cell[1]).getPiece();
                 if (piece != null && piece.getColor().equals(color)) {equal_count++;}
             }
             if (equal_count == 3) return true;
         }

         return false;
    }
}

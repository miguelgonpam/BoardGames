package game.TicTacToe;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import util.Color;
import util.Piece;

@Getter
@Setter
@AllArgsConstructor
public class TTTPiece implements Piece {
    private Color color;
}

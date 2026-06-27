package util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cell {

    private Coordinate coord;

    private Piece piece;

    public Cell(Coordinate coord){
        this.coord = coord;
    }





}

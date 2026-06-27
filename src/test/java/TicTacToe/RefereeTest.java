package TicTacToe;

import game.TicTacToe.TTTReferee;
import org.junit.jupiter.api.Test;
import util.Color;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class RefereeTest {

    @Test
    void testInitialState() {
        TTTReferee referee = new TTTReferee();

        assertFalse(referee.isWinner(Color.WHITE));
        assertFalse(referee.isWinner(Color.BLACK));
    }

    @Test
    void testLegalMove(){
        TTTReferee referee = new TTTReferee();

    }

    @Test
    void testIsWinner(){

    }
}

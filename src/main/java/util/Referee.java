package util;

public interface Referee {

    boolean legalMove(Player player, Cell start, Cell end);

    void move(Player player, Cell start, Cell end);
}

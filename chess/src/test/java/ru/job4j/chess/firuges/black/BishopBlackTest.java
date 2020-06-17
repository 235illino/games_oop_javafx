package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class BishopBlackTest extends TestCase {

    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.B1);
        assertThat(Cell.B1, is(bishopBlack.position()));
    }

    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.B1);
        assertThat(Cell.A2, is(bishopBlack.copy(Cell.A2).position()));
    }

    public void testWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.G5);
        Cell[] cells = bishopBlack.way(Cell.G5, Cell.C1);
        Cell[] exp = {Cell.F4, Cell.E3, Cell.D2, Cell.C1};
        assertThat(cells, is(exp));
    }

    @Test (expected = IllegalStateException.class)
    public void testWayW() {
        BishopBlack bishopBlack = new BishopBlack(Cell.G5);
        Cell[] cells = bishopBlack.way(Cell.G5, Cell.G6);
        Cell[] exp = {Cell.F4, Cell.E3, Cell.D2, Cell.C1};
        assertThat(cells, is(exp));
    }

}
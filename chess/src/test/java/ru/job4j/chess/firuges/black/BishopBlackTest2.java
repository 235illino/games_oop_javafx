package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest2 extends TestCase {

    @Test(expected = IllegalStateException.class)
    public void testName() {
        BishopBlack bishopBlack = new BishopBlack(Cell.G5);
        Cell[] cells = bishopBlack.way(Cell.G5, Cell.G6);
        Cell[] exp = {Cell.F4, Cell.E3, Cell.D2, Cell.C1};
        assertThat(cells, is(exp));
    }
}
package cn.edu.jnu.cnedujnux2021102259;

import org.junit.Test;

import static org.junit.Assert.*;

import junit.framework.TestCase;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BowlingGameTest extends TestCase {
    private Game g;

    protected void setUp() throws Exception {
        g = new Game();
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++)
            g.roll(pins);
    }

    public void testGutterGame() throws Exception {
        rollMany(20, 0);
        assertEquals(0, g.score());
    }

    public void testAllOnes() throws Exception {
        rollMany(20,1);
        assertEquals(20, g.score());
    }

    public void testOneStrike() throws Exception {
        g.roll(10); // strike
        g.roll(3);
        g.roll(4);
        rollMany(16, 0);
        assertEquals(24, g.score());
    }


    private void rollSpare() {
        g.roll(5);
        g.roll(5);
    }


}


import static org.junit.Assert.*;

/**
 * Created by CM on 15/02/2018.
 */
public class WindTest {
    @org.junit.Test (expected = IllegalArgumentException.class)
    public void speedminimum() throws Exception {
        Wind.getWarning(Integer.MIN_VALUE);
    }

    @org.junit.Test (expected = IllegalArgumentException.class)
    public void speedminus1() throws Exception {
        Wind.getWarning(-1);
    }

    @org.junit.Test
    public void speed0() throws Exception {
        assertEquals(Wind.Warning.NONE, Wind.getWarning(0));
    }

    @org.junit.Test
    public void speed1() throws Exception {
        assertEquals(Wind.Warning.NONE, Wind.getWarning(1));
    }

    @org.junit.Test
    public void speed59() throws Exception {
        assertEquals(Wind.Warning.NONE, Wind.getWarning(59));
    }

    @org.junit.Test
    public void speed60() throws Exception {
        assertEquals(Wind.Warning.YELLOW, Wind.getWarning(60));
    }

    @org.junit.Test
    public void speed61() throws Exception {
        assertEquals(Wind.Warning.YELLOW, Wind.getWarning(61));
    }

    @org.junit.Test
    public void speed79() throws Exception {
        assertEquals(Wind.Warning.YELLOW, Wind.getWarning(79));
    }

    @org.junit.Test
    public void speed80() throws Exception {
        assertEquals(Wind.Warning.ORANGE, Wind.getWarning(80));
    }

    @org.junit.Test
    public void speed81() throws Exception {
        assertEquals(Wind.Warning.ORANGE, Wind.getWarning(81));
    }

    @org.junit.Test
    public void speed99() throws Exception {
        assertEquals(Wind.Warning.ORANGE, Wind.getWarning(99));
    }

    @org.junit.Test
    public void speed100() throws Exception {
        assertEquals(Wind.Warning.RED, Wind.getWarning(100));
    }

    @org.junit.Test
    public void speed101() throws Exception {
        assertEquals(Wind.Warning.RED, Wind.getWarning(101));
    }

    @org.junit.Test
    public void speed119() throws Exception {
        assertEquals(Wind.Warning.RED, Wind.getWarning(119));
    }

    @org.junit.Test
    public void speed120() throws Exception {
        assertEquals(Wind.Warning.BLACK, Wind.getWarning(120));
    }

    @org.junit.Test
    public void speed121() throws Exception {
        assertEquals(Wind.Warning.BLACK, Wind.getWarning(121));
    }

    @org.junit.Test
    public void speed500() throws Exception {
        assertEquals(Wind.Warning.BLACK, Wind.getWarning(500));
    }

    @org.junit.Test (expected = IllegalArgumentException.class)
    public void speed501() throws Exception {
        Wind.getWarning(501);
    }

    @org.junit.Test (expected = IllegalArgumentException.class)
    public void speedMaximum() throws Exception {
        Wind.getWarning(Integer.MAX_VALUE);
    }
}
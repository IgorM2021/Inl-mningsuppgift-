import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestConverter {

    @Test
    public void testConvertE() {
        String actual = morsekod.geteng("*");
        assertEquals("E", actual);
    }

    @Test
    public void testConvertK() {
        String actual = morsekod.geteng("-*-");
        assertEquals("K", actual);
    }

    @Test
    public void testConvertD() {
        String actual = morsekod.geteng("-**");
        assertEquals("D", actual);
    }

    @Test
    public void testConvertWords() {
        String actual = morsekod.getFullString("*--- *- --*");
        assertEquals("JAG", actual);
    }

    @Test
    public void testConvertEngToMor() {
        String actual = morsekod.getFullMorse("DU");
        assertEquals("-** **-", actual);
    }

    @Test
    public void testSpaceWord() {
        String actual = morsekod.getFullMorse("SOLEN SKINER IDAG");
        assertEquals("** -** *- --*   *** --- *-** * -*   *** -*- ** -* * *-*", actual);
    }

}
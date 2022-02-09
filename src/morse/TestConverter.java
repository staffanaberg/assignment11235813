package morse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestConverter {

    //* -> E
    //En metod där jag kan skicka in * (String) och få ut E (String)
    //Skapa ett objekt, komma åt metoden, jämföra resultatet (E)
    @Test
    public void testStarToE() {
        Converter converter = new Converter();
        String actual = converter.toEnglish("*");

        assertEquals("E", actual);
    }

    @Test
    public void testDashToT() {
        Converter converter = new Converter();
        String actual = converter.toEnglish("-");

        assertEquals("T", actual);
    }

    @Test
    public void testTToDash() {
        Converter converter = new Converter();
        String actual = converter.toEnglish("T");

        assertEquals("-", actual);
    }
    @Test
    public void testAt() {
        Converter converter = new Converter();
        String actual = converter.toEnglish("@");

        assertEquals("-", actual);
    }

    @Test
    public void testHEJ() {
        Converter converter = new Converter();
        String actual = converter.toEnglish("HEJ");

        assertEquals("-", actual);
    }

}

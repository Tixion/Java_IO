import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SymbolsInArrayTest {
    @Test
    public void writeArrayTest() throws IOException {
        int[] arr = {2, 3, 5, 7};
        char[] expected = {'2', ' ', '3', ' ', '5', ' ', '7', ' '};
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        SymbolsInArray.writeArray(charArrayWriter, arr);
        assertArrayEquals(expected, charArrayWriter.toCharArray());
    }

    @Test
    public void readArrayTest() throws IOException {
        int[] expected = {2, 3, 5, 7};
        char[] symbols = {'2', ' ', '3', ' ', '5', ' ', '7', ' '};
        int[] arr = new int[4];
        CharArrayReader charArrayReader = new CharArrayReader(symbols);
        SymbolsInArray.readArray(charArrayReader, arr);
        assertArrayEquals(expected, arr);
    }
}

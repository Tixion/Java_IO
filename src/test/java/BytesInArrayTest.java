import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BytesInArrayTest {
    @Test
    public void writeBytesArrayTest() throws IOException {
        int[] arr = new int[]{10, 11, 12};
        byte[] expected = {0, 0, 0, 10, 0, 0, 0, 11, 0, 0, 0, 12};
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        BytesInArray.writeBytesArray(outputStream, arr);
        assertArrayEquals(expected, outputStream.toByteArray());
    }

    @Test
    public void readBytesInArrayTest() throws IOException {
        int[] expected = {10, 11, 12};
        byte[] buf = {0, 0, 0, 10, 0, 0, 0, 11, 0, 0, 0, 12};
        int[] arr = new int[3];
        ByteArrayInputStream inputStream = new ByteArrayInputStream(buf);
        BytesInArray.readBytesInArray(inputStream, arr);
        assertArrayEquals(expected, arr);
    }
}

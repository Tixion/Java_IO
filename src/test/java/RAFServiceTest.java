import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.*;

public class RAFServiceTest {
    @Test
    public void readArrRandomFileTest() throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile("C:\\2.txt", "rw")) {
            int[] arr = {1, 2, 3, 4, 5};
            RAFService.writer(raf, arr);
            int[] result = RAFService.reader(raf, 2);
            int[] expected = {2, 3, 4, 5};
            assertArrayEquals(expected, result);
        }
    }
}

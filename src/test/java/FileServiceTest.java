import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FileServiceTest {
    @Test
    public void getListFileWithExtensionTest() {
        File file = new File("C://");
        String[] arrFile = file.list(new ExtensionFilter(".txt"));
        String[] expected = new String[4];
        expected[0] = "1.txt";
        expected[1] = "2.txt";
        expected[2] = "3.txt";
        expected[3] = "4.txt";
        assertArrayEquals(expected, arrFile);
    }
}

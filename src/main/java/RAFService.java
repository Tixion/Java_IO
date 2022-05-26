import java.io.*;

public class RAFService {
    public static void writer(RandomAccessFile raf, int [] arr) throws IOException {
        for (int elem: arr) {
            raf.writeInt(elem);
        }
    }

    public static int[] reader(RandomAccessFile raf, int pointer) throws IOException {
        int[] result = new int[(int) (raf.length() / Integer.BYTES - pointer + 1)];
        raf.seek((long)(pointer - 1) * Integer.BYTES);

        int i = 0;
        while (raf.getFilePointer() < raf.length()) {
            result[i] = raf.readInt();
            i++;
        }

        //for(int i = 0; i < (int) (raf.length() / Integer.BYTES); i++){
        //    result[i] = raf.readInt();
        //}

        return result;
    }
}
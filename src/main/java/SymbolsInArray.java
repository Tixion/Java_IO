import java.io.*;
//import java.util.Arrays;

public class SymbolsInArray {
    public static void writeArray(Writer writer, int [] arr) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            for (int i : arr) {
                bufferedWriter.write(String.valueOf(i));
                bufferedWriter.write(" ");
            }
        }
    }

    public static void readArray(Reader reader, int [] arr) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(reader)) {
            String[] str = bufferedReader.readLine().split(" ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
        }
    }
}
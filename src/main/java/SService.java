import java.io.*;

public class SService {
    public static void serializeHouse(OutputStream outputStream, House house) throws IOException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {
            objectOutputStream.writeObject(house);
        }
    }

    public static House deserializeHouse(InputStream inputStream) throws IOException, ClassNotFoundException {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {
            House house = (House) objectInputStream.readObject();
            return house;
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
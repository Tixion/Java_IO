import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class JSonSerializeHouse {
    public static void serializeObjectJson(House house, Writer writer) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(writer, house);
    }

    public static House deserializeObjectJson(Reader reader) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        House houseResult = mapper.readValue(reader, House.class);
        return houseResult;
    }
}
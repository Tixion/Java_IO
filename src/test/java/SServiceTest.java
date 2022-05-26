import java.io.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class SServiceTest {
    @Test
    public void serializableHouseTest() throws ClassNotFoundException {
        Date date1 = new Date(2001, 12, 1);
        Date date2 = new Date(2003, 8, 19);
        Date date3 = new Date(2002, 5, 27);
        Date date4 = new Date(1972, 2, 11);
        Person person1 = new Person("Сив", "Алексеев", "Дмитриевич", date1);
        Person person2 = new Person("Шут", "Захаров", "Андреевич", date2);
        Person person3 = new Person("Мура", "Муратов", "Мучачович", date3);

        List<Person> listPerson1 = new ArrayList<>();
        listPerson1.add(person1);
        listPerson1.add(person2);

        List<Person> listPerson2 = new ArrayList<>();
        listPerson2.add(person3);

        Flat flat1 = new Flat(1, 100, listPerson1);
        Flat flat2 = new Flat(1, 99, listPerson2);
        Person master = new Person("Людмила", "Людмилова", "Николаевна", date4);

        List<Flat> listFlat = new ArrayList<>();
        listFlat.add(flat1);
        listFlat.add(flat2);

        House house = new House("numberID101", "Kolotushkina_17a", master, listFlat);

        try (OutputStream outputStream = new FileOutputStream("C:\\1.txt");
             InputStream inputStream = new FileInputStream("C:\\1.txt")) {

            SService.serializeHouse(outputStream, house);

            House houseResult = (House) SService.deserializeHouse(inputStream);

            assertEquals(house.toString(), houseResult.toString());
        } catch (IOException e) {
            System.out.println("ERROR" + e);
        }
    }
}

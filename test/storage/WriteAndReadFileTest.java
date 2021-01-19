package storage;

import model.Person;
import model.Pharmacist;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WriteAndReadFileTest {
    final static String FILE_NAME1 = "test.txt";
    List<Person> personList = new ArrayList<>();
    Pharmacist pharmacist = new Pharmacist("hanoi");

    @Test
    void writeFile() {
        personList.add(pharmacist);
        List<Person> expectedResult = personList;
        WriteAndReadFile.writeFile(FILE_NAME1,personList);
        List<Person> result = personList;
        assertEquals(expectedResult,result);

    }

    @Test
    void readFile() {
        personList.add(pharmacist);
        List<Person> expectedResult = personList;
        List<Person> result = (List<Person>) WriteAndReadFile.readFile(FILE_NAME1);
        assertEquals(expectedResult.toString(),result.toString());
    }
}
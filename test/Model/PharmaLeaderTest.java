package Model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Period;

import static org.junit.jupiter.api.Assertions.*;

class PharmaLeaderTest {

    @Test
    @DisplayName("Test 0")
    void getSalaryTest0() {
        Person pharmaLeader = new PharmaLeader("");
        double expectedResult = 0;
        double result = (pharmaLeader.getSalary());
        assertEquals(expectedResult,result);
    }
    @Test
    @DisplayName("Đại học")
    void getSalaryTestUniversity(){
        Person pharmaLeader = new PharmaLeader("Đại học");
        double expectedResult = 10000000;
        double result = pharmaLeader.getSalary();
        assertEquals(expectedResult,result);
    }
    @Test
    @DisplayName("Cao đẳng")
    void getSalaryTestByDegreeIsColleges(){
        Person pharmaLeader = new PharmaLeader("Cao đẳng");
        double expectedResult = 7000000;
        double result = pharmaLeader.getSalary();
        assertEquals(expectedResult,result);
    }
}
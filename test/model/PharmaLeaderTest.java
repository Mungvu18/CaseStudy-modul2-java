package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PharmaLeaderTest {

    @Test
    @DisplayName("Test 0")
    void getSalaryTest0() {
        String degree = "";
        Person pharmaLeader = new PharmaLeader(degree);
        double expectedResult = 0;
        double result = (pharmaLeader.getSalary());
        assertEquals(expectedResult,result);
    }
    @Test
    @DisplayName("Đại học")
    void getSalaryTestUniversity(){
        String degree = "Đại học";
        Person pharmaLeader = new PharmaLeader(degree);
        double expectedResult = 10000000;
        double result = pharmaLeader.getSalary();
        assertEquals(expectedResult,result);
    }
    @Test
    @DisplayName("Cao đẳng")
    void getSalaryTestByDegreeIsColleges(){
        String degree = "Cao đẳng";
        Person pharmaLeader = new PharmaLeader(degree);
        double expectedResult = 7000000;
        double result = pharmaLeader.getSalary();
        assertEquals(expectedResult,result);
    }
}
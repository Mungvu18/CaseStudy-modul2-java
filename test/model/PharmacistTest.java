package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PharmacistTest {

    @Test
    @DisplayName("Hà Nôi và TPHCM")
    void getSalaryByAreaWorkIsHaNoiOrTPHCM() {
        Pharmacist pharmacist = new Pharmacist("hà nội");
        Pharmacist pharmacist1 = new Pharmacist("TPHCM");
        double expectedResult = 6000000;
        double result = pharmacist.getSalary();
        double result1 = pharmacist1.getSalary();
        assertEquals(expectedResult,result);
        assertEquals(expectedResult,result1);
    }
    @Test
    @DisplayName("Other")
    void getSalaryByAreaWorkIsOther(){
        Pharmacist pharmacist = new Pharmacist("");
        double expectedResult = 5000000;
        double result = pharmacist.getSalary();
        assertEquals(expectedResult,result);
    }
}
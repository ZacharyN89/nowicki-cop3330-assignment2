package ex34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class employeeListTest {

    @Test
    void arraySize() {
        employeeList workers = new employeeList();
        workers.makeList();
        assertEquals(5,workers.arraySize());
    }
}
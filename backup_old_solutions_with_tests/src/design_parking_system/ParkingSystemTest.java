package design_parking_system;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParkingSystemTest {

    @Test
    public void test() {
        ParkingSystem sut = new ParkingSystem(1, 1, 0);
        assertTrue(sut.addCar(1));
        assertTrue(sut.addCar(2));
        assertFalse(sut.addCar(3));
        assertFalse(sut.addCar(1));
    }
}

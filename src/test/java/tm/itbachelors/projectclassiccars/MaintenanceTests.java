package tm.itbachelors.projectclassiccars;

// Talha Arif - r1066207

import tm.itbachelors.projectclassiccars.model.Maintenance;
import tm.itbachelors.projectclassiccars.model.Staff;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
public class MaintenanceTests {
    @Test
    public void testDefaultConstructor() {
        Maintenance m = new Maintenance();
        assertNull(m.getType());
        assertEquals(0, m.getDuration());
        assertEquals(0.0, m.getHourlyRate());
        assertNull(m.getResponsible());
    }

    @Test
    public void testConstructorWithType() {
        Maintenance m = new Maintenance("Tyre Change");
        assertEquals("Tyre Change", m.getType());
    }

    @Test
    public void testFullConstructor() {
        Maintenance m = new Maintenance("Brake Check", 120, 30.0);
        assertEquals("Brake Check", m.getType());
        assertEquals(120, m.getDuration());
        assertEquals(30.0, m.getHourlyRate());
    }

    @Test
    public void testSetType() {
        Maintenance m = new Maintenance();
        m.setType("Wiper Replacement");
        assertEquals("Wiper Replacement", m.getType());
    }

    @Test
    public void testSetDuration() {
        Maintenance m = new Maintenance();
        m.setDuration(90);
        assertEquals(90, m.getDuration());
    }

    @Test
    public void testSetHourlyRate() {
        Maintenance m = new Maintenance();
        m.setHourlyRate(22.5);
        assertEquals(22.5, m.getHourlyRate());
    }

    @Test
    public void testGetPrice() {
        Maintenance m = new Maintenance("Battery Check", 120, 30.0);
        assertEquals(60.0, m.getPrice(), 0.001);
    }

    @Test
    public void testGetPriceHalfHour() {
        Maintenance m = new Maintenance("Quick Check", 30, 20.0);
        assertEquals(10.0, m.getPrice(), 0.001);
    }

    @Test
    public void testSetAndGetResponsible() {
        Staff staff = new Staff("Marco", "Rossi");
        Maintenance m = new Maintenance("Paint Job", 60, 20.0);
        m.setResponsible(staff);
        assertEquals(staff, m.getResponsible());
    }
}

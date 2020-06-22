import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    management.Manager manager;

    @Before
    public void before() {
        manager = new management.Manager("Victor", "sg45634874", 100000, "DevOps");
    }

    @Test
    public void managerHasName(){
    assertEquals("Victor", manager.getName());
    }

    @Test
    public void managerHasNiNumber(){
        assertEquals("sg45634874", manager.getNiNumber());
    }

    @Test
    public void managerHasSalary(){
        assertEquals(100000, manager.getSalary(), 0.01);
    }

    @Test
    public void managerHasDeptName(){
        assertEquals("DevOps", manager.getDeptName());
    }

    @Test
    public void managerCanRaiseSalary(){
        manager.raiseSalary(100.00);
        assertEquals(100100, manager.getSalary(), 0.01);
    }

    @Test
    public void managerCanGiveBonus(){
        manager.payBonus();
        assertEquals(101000, manager.salary());
    }

}

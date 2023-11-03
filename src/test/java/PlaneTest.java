import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane1;

    @Before
    public void before(){
        plane1 = new Plane(PlaneType.AIRBUSA380);
    }

    @Test
    public void hasCapacity(){
        assertEquals(700, plane1.getPlaneType().getCapacity());
    }

    @Test
    public void hasWeight(){
        assertEquals(1200000, plane1.getPlaneType().getTotalWeight());
    }
}

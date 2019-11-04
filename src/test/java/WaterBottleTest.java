import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {
    WaterBottle myWaterBottle;

    @Before
    public void before() {
        myWaterBottle = new WaterBottle(100);
    }

    @Test
    public void getVolume() {
        assertEquals(100, myWaterBottle.getVolume());
    }

    @Test
    public void canDrink() {
        myWaterBottle.drink();
        assertEquals(90, myWaterBottle.getVolume());
    }

    @Test
    public void canEmpty() {
        myWaterBottle.empty();
        assertEquals(0, myWaterBottle.getVolume());
    }

    @Test
    public void canFill() {
        myWaterBottle.empty();
        myWaterBottle.fill();
        assertEquals(100, myWaterBottle.getVolume());
    }
}

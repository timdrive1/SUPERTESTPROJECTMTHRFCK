import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TrackingServiceTests {

    private TrackingService service;

    @Before
    public void setUp(){
        service = new TrackingService();
    }

    @Test
    public void  NewTrackingServiceTotalZero(){
        assertEquals("Tracking service total was not zero", 0, service.getTotal());
    }
    @Test
    public void WhenAddingProteinTotalIncreasesByThatAmount(){
        service.addProtein(10);
        assertEquals("Protein amount was not correct", 10, service.getTotal());
    }
    @Test
    public void WhenRemovingProteinTotalRemainZero(){
        service.removeProtein(5);
        assertEquals(0, service.getTotal());
    }

}

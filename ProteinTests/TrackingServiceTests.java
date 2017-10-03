import org.junit.*;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class TrackingServiceTests {

    private TrackingService service;

    @BeforeClass
    public  static void before(){
        System.out.println("Before Class");
    }

    @AfterClass
    public static void after(){
        System.out.println("After Class");
    }

    @Before
    public void setUp(){
        System.out.println("Before");
        service = new TrackingService();
    }

    @After
    public void tearDown(){
        System.out.println("After");
    }

    @Test
    @Category({GoodCategories.class, BadCategories.class})
    public void  NewTrackingServiceTotalZero(){
        assertEquals("Tracking service total was not zero", 0, service.getTotal());
    }
    @Test
    @Ignore
    public void WhenAddingProteinTotalIncreasesByThatAmount(){
        service.addProtein(10);
        assertEquals("Protein amount was not correct", 10, service.getTotal());
    }
    @Test
    @Category(GoodCategories.class)
    public void WhenRemovingProteinTotalRemainZero(){
        service.removeProtein(5);
        assertEquals(0, service.getTotal());
    }
    @Test
    public void Null(){
        assertNull(service.historyItem);
    }

    @Test
    public void True(){
        assertTrue(service.isGoalMet());
    }
    @Test
    public void notNull(){
        assertNotNull(service);
    }

    @Test(expected = InvalidGoalException.class)
    public void WhenGoalIsSetToLessThnZeroExceptionIsThrown() throws InvalidGoalException {
        service.setGoal(-5);

    }

    @Test
    @Category(GoodCategories.class)
    public void History(){
        service.addProtein(20);
        service.removeProtein(10);
        System.out.println(service.getHistory());

    }
    @Test(timeout = 200)
    public void BadTest(){
        for (int i = 0; i < 1000000000 ; i++) {
            service.addProtein(1);

        }

    }

}

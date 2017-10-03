import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class PatameterizedTests {

    private static TrackingService service = new TrackingService();
    private int input;
    private int expected;

    @Parameterized.Parameters
    public static List<Object[]> data(){
        return Arrays.asList(new Object[][]{
            {5, 5},
            {5, 10},
            {-12, 0},
            {50, 50},
            {1, 51}
        });
    }
    public PatameterizedTests(int input, int expected){
        this.input = input;
        this.expected = expected;

    }
    @Test
    public void tests(){
        if(input>=0){
            service.addProtein(input);
        }
        else service.removeProtein(-input);
        assertEquals(expected, service.getTotal());
    }
}

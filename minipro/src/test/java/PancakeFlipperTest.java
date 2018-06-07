import junit.framework.TestCase;
import org.junit.Test; 
import java.util.*;
import java.io.*;

public class PancakeFlipperTest extends TestCase { 
    @Test 
    public void testPancakeFlipperHasAShowStart() {
        PancakeFlipper classUnderTest = new PancakeFlipper();
        assertNotNull("app should have a showStart", classUnderTest.showStart());
        System.out.println("This test method should be run");
    }
    
    @Test 
    public void testPancakeFlipperUseFlipper () throws FileNotFoundException{
        // Scanner in = new Scanner(new BufferedReader(new FileReader( "input.txt")));
        InputStream inputStream = getClass().getResourceAsStream("/input.txt");
        Scanner in = new Scanner(inputStream);
        InputStream inputStream2 = getClass().getResourceAsStream("/expected.txt");
        Scanner expected = new Scanner(inputStream2);
        // Scanner expected = new Scanner(new BufferedReader(new FileReader( "expected.txt")));
        int t = in.nextInt(); 
        PancakeFlipper classUnderTest = new PancakeFlipper();
        for (int i = 1; i <= t; ++i) {
            String s=in.next();
            int k=in.nextInt();
            String res = classUnderTest.useFlipper(s, k);
            assertEquals(expected.next(), res);
        }
    }
}
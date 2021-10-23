

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TinhTongTest {

    public TinhTongTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of findGreatestCommonDivisor method, of class MathUtils.
     */
    @Test
    public void test2Zero() {
        System.out.println("Test a = 0 and b = 0");
        int a = 0;
        int b = 0;
        TinhTong instance = new TinhTong();
        int expResult = 0;
        int result = instance.findGreatestCommonDivisor(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void test1Zero1() {
        System.out.println("Test a = 0 and b != 0");
        int a = 0;
        int b = 5;
        TinhTong instance = new TinhTong();
        int expResult = 5;
        int result = instance.findGreatestCommonDivisor(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void test2NumberEqual() {
        System.out.println("Test a = b");
        int a = 5;
        int b = 5;
        TinhTong instance = new TinhTong();
        int expResult = 5;
        int result = instance.findGreatestCommonDivisor(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testNormalValue() {
        System.out.println("Test a = 14 and b = 24");
        int a = 14;
        int b = 24;
        TinhTong instance = new TinhTong();
        int expResult = 2;
        int result = instance.findGreatestCommonDivisor(a, b);
        assertEquals(expResult, result);
    }
}


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UocChungLNTest {

    public UocChungLNTest() {
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
        UocChungLN instance = new UocChungLN();
        int expResult = 0;
        int result = instance.findGreatestCommonDivisor(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void test1Zero1() {
        System.out.println("Test a = 0 and b != 0");
        int a = 0;
        int b = 5;
        UocChungLN instance = new UocChungLN();
        int expResult = 5;
        int result = instance.findGreatestCommonDivisor(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void test2NumberEqual() {
        System.out.println("Test a = b");
        int a = 5;
        int b = 5;
        UocChungLN instance = new UocChungLN();
        int expResult = 5;
        int result = instance.findGreatestCommonDivisor(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testNormalValue() {
        System.out.println("Test a = 14 and b = 24");
        int a = 14;
        int b = 24;
        UocChungLN instance = new UocChungLN();
        int expResult = 2;
        int result = instance.findGreatestCommonDivisor(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void test50with50() {
        System.out.println("Test a = 50 and b = 50");
        int a = 50;
        int b = 50;
        UocChungLN instance = new UocChungLN();
        int expResult = 50;
        int result = instance.findGreatestCommonDivisor(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void test50with1() {
        System.out.println("Test a = 50 and b = 1");
        int a = 50;
        int b = 1;
        UocChungLN instance = new UocChungLN();
        int expResult = 1;
        int result = instance.findGreatestCommonDivisor(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void test50with2() {
        System.out.println("Test a = 50 and b = 2");
        int a = 50;
        int b = 2;
        UocChungLN instance = new UocChungLN();
        int expResult = 2;
        int result = instance.findGreatestCommonDivisor(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void test50with98() {
        System.out.println("Test a = 50 and b = 98");
        int a = 50;
        int b = 98;
        UocChungLN instance = new UocChungLN();
        int expResult = 2;
        int result = instance.findGreatestCommonDivisor(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void test50with100() {
        System.out.println("Test a = 50 and b = 100");
        int a = 50;
        int b = 100;
        UocChungLN instance = new UocChungLN();
        int expResult = 50;
        int result = instance.findGreatestCommonDivisor(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void test1with50() {
        System.out.println("Test a = 1 and b = 50");
        int a = 1;
        int b = 50;
        UocChungLN instance = new UocChungLN();
        int expResult = 1;
        int result = instance.findGreatestCommonDivisor(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void test2with50() {
        System.out.println("Test a = 2 and b = 50");
        int a = 2;
        int b = 50;
        UocChungLN instance = new UocChungLN();
        int expResult = 2;
        int result = instance.findGreatestCommonDivisor(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void test99with50() {
        System.out.println("Test a = 99 and b = 50");
        int a = 99;
        int b = 50;
        UocChungLN instance = new UocChungLN();
        int expResult = 1;
        int result = instance.findGreatestCommonDivisor(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void test98with50() {
        System.out.println("Test a = 98 and b = 50");
        int a = 98;
        int b = 50;
        UocChungLN instance = new UocChungLN();
        int expResult = 2;
        int result = instance.findGreatestCommonDivisor(a, b);
        assertEquals(expResult, result);
    }
}
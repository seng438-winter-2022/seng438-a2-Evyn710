package org.jfree.data.test; 
 
import static org.junit.Assert.*; 
import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;



public class RangeTests {

    private Range negativeRange;
    private Range positiveRange;
    private Range zeroRange;
    private Range mixedRange;

    public RangeTests() {
        

    }
    @Before
    public void setUp() throws Exception { 
        negativeRange = new Range(-0.4,-0.1);
        positiveRange = new Range(8.01,24.11);
        zeroRange = new Range(0,0);
        mixedRange = new Range(-1,2);;
    }

    @Test
    public void testNegativeRangeGetUpper(){
        assertEquals(-0.1,negativeRange.getUpperBound(),.000000001d);

    }
    @Test
    public void testPositiveRangeGetUpper(){
        assertEquals(24.11,positiveRange.getUpperBound(),.000000001d);

    }
    
    @Test
    public void testZeroRangeGetUpper(){
        assertEquals(0,zeroRange.getUpperBound(),.000000001d);

    }
    
    @Test
    public void testMixedRangeGetUpper(){
        assertEquals(2,mixedRange.getUpperBound(),.000000001d);

    }

    @Test
    public void testNegativeRangeGetLower(){
        assertEquals(-0.4,negativeRange.getLowerBound(),.000000001d);

    }
    
    @Test
    public void testPositiveRangeGetLower(){
        assertEquals(8.01,positiveRange.getLowerBound(),.000000001d);

    }

    @Test
    public void testZeroRangeGetLower(){
        assertEquals(0,zeroRange.getLowerBound(),.000000001d);

    }
    @Test
    public void testMixedRangeGetLower(){
        assertEquals(-1,mixedRange.getLowerBound(),.000000001d);

    }

    @Test
    public void testPositiveRangeGetLength(){
        assertEquals(16.10,positiveRange.getLength(),.000000001d);

    }

    @Test
    public void testZeroRangeGetLength(){
        assertEquals(0,zeroRange.getLength(),.000000001d);

    }
    @Test
    public void testMixedRangeGetLength(){
        assertEquals(3,mixedRange.getLength(),.000000001d);

    }
    

}
 
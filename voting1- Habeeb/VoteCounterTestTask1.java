

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class VoteCounterTest.
 *
 * @author  (Habeeb)
 * @version (30/10/21)
 */
public class VoteCounterTestTask1
{
    /**
     * Default constructor for test class VoteCounterTest
     */
    public VoteCounterTestTask1()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testTask1CanCreate()
    {
        VoteCounter v = new VoteCounter("C1","C2");
    }
    
    @Test
    public void testTask1Getters()
    {
        VoteCounter v = new VoteCounter("C1","C2");
        assertEquals(v.getCandidate1(),"C1");
        assertEquals(v.getCandidate2(),"C2");
        assertEquals(v.getCompleted(),false);
        v.setCompleted(true);
        assertEquals(v.getCompleted(),true);
    }
    
  
}


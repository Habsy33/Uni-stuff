

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * The test class VoteCounterTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class VoteCounterTestTask2
{
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    /**
     * Default constructor for test class VoteCounterTest
     */
    public VoteCounterTestTask2()
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
    public void testTask2CanVote()
    {
        VoteCounter v = new VoteCounter("C1","C2");
        assertEquals(v.vote(1),"your vote has been cast");
        assertEquals(v.vote(1),"your vote has been cast");
        assertEquals(v.vote(2),"your vote has been cast");
        assertEquals(v.getCandidate1Votes(),2);
        assertEquals(v.getCandidate2Votes(),1);
    }
    
    @Test
    public void testTask2CanValidateInput()
    {
        VoteCounter v = new VoteCounter("C1","C2");
        assertEquals(v.vote(3),"invalid choice, no vote cast");
    }
    
    @Test
    public void testTask2CanPrint()
    {
        VoteCounter v = new VoteCounter("C1","C2");
        v.vote(1);
        v.vote(1);
        v.vote(2);
        v.setCompleted(true);
        
        System.setOut(new PrintStream(outputStreamCaptor));
        v.printResults();
        assertEquals("CANDIDATE - C1\nreceived 66.7 percent of the votes\nCANDIDATE - C2\nreceived 33.3 percent of the votes", 
        outputStreamCaptor.toString().trim());
        System.setOut(standardOut);
    }
    
}


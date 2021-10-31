

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
public class VoteCounterTestTask3
{
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    /**
     * Default constructor for test class VoteCounterTest
     */
    public VoteCounterTestTask3()
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
    public void testTask3NotPrintedIfNoVotes()
    {
        VoteCounter v = new VoteCounter("C1","C2");
        v.vote(1);
        v.vote(1);
        v.vote(2);
        
        System.setOut(new PrintStream(outputStreamCaptor));
        v.printResults();
        assertEquals("", 
        outputStreamCaptor.toString().trim());
        System.setOut(standardOut);
    }
    
    @Test
    public void testTask3NotPrintedIfNotComplete()
    {
        VoteCounter v = new VoteCounter("C1","C2");
        v.setCompleted(true);
        
        System.setOut(new PrintStream(outputStreamCaptor));
        v.printResults();
        assertEquals("", 
        outputStreamCaptor.toString().trim());
        System.setOut(standardOut);
    }
    
    @Test
    public void testTask3CantVoteIfComplete()
    {
        VoteCounter v = new VoteCounter("C1","C2");
        v.vote(1);
        v.vote(1);
        v.vote(2);
        v.setCompleted(true);
        v.vote(2);
        assertEquals("sorry, voting is completed",v.vote(2));
    }
}


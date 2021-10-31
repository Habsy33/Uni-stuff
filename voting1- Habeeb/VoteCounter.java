public class VoteCounter
{
 
private String candidateOne;
private String candidateTwo;
private int Candidate1Votes;
private int Candidate2Votes;
private boolean completed;

public VoteCounter(String CANDIDATE1, String CANDIDATE2 )
{
this.candidateOne = CANDIDATE1;
this.candidateTwo = CANDIDATE2;
this.Candidate1Votes = 0;
this.Candidate2Votes = 0;
this.completed = false;

}
    
public VoteCounter( )
{
this.candidateOne = "CANDIDATE1";
this.candidateTwo = "CANDIDATE2";
this.Candidate1Votes = 0;
this.Candidate2Votes = 0;
this.completed = false;
}

public String getCandidate1()
 {
 return this.candidateOne;
 } 
 
public String getCandidate2()
 {
 return this.candidateTwo;
 } 
 
public boolean getCompleted()
 {
 return this.completed;
 } 
 
 public void setCompleted(boolean completed){
    this.completed = completed;}
    
public class vote
{

private int VoteNumberOne;
private int VoteNumberTwo;

public vote( int VoteNumber1, int VoteNumber2)
{
this.VoteNumberOne = VoteNumber1;
this.VoteNumberTwo = VoteNumber2;
}



}
}



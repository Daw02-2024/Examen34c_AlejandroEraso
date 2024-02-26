package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RockPaperScissorsTest {
	

	@Test
	void testRockPaperScissors() {
		String gameresult;
		String user="";
		String comp="";
	if (user == comp) gameresult = "tie";
	}
	
	@Test
	void testRockWin() {
		String gameresult;
		String user="Rock";
		String comp="Scissors";
	if (user.equals("Rock") && comp.equals("Scissors")) gameresult = "Win";
	}
	
	@Test
	void testPaperWin() {
		String gameresult;
		String user="Paper";
		String comp="Rock";
	if (user.equals("Paper") && comp.equals("Rock")) gameresult = "Win";
	}
	
	@Test
	void testScissorsWin() {
		String gameresult;
		String user="Scissors";
		String comp="Paper";
	if (user.equals("Scissors") && comp.equals("Paper")) gameresult = "Win";
	}
	
	

}

import java.util.Random;

//This class will represent the computer who is playing with the user.
public class Computer {
	// This function helps the computer do the selection among ROCK,
	// PAPER,SCISSORS
	// we have used Random class from java.util.
	public int getInput() {
		Random random = new Random();
		int input = random.nextInt(3) + 1;
		return input;
	}
}
import java.util.Random;

//This class will represent the computer who is playing with the user.
public class Computer {
	public int chooseComputerWeapon() {
		Random random = new Random();
		int input = random.nextInt(3) + 1;
		return input;
	}
}
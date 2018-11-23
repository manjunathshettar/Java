import java.util.Scanner;
/* RockPaperScissors program with Math.random as computer choice
 * @author Manjunath Shettar
 * @since 9/18/2016
 */
public class RockPaperScissors {

	private String enter;
	private Scanner scanner;
	private int choice;
	private int comp;
	public RockPaperScissors() {
		scanner = new Scanner(System.in);
		enter = "";
	}
	public static void main(String[] args) {
		RockPaperScissors player = new RockPaperScissors();
		player.run();
	}
	public void run() {
		System.out.println("Welcome to RPS! Press R for rock, S for scissors or P for paper.");
		enter = scanner.nextLine();
		while(!isValid(enter))
			run();
		comp = compute();
		determine(choice, comp);
	}
	public boolean isValid(String e) {
		if(e.equalsIgnoreCase("Rock") || e.equals("Scissors") || e.equals("Paper")) {
			System.out.println("I guess you didn't read the instructions. I'll overlook it this time.");
		}
		if(e.equalsIgnoreCase("Rock") || e.equalsIgnoreCase("R")){
			choice = 1; //1 = rock
			return true;
		}
		else if(e.equalsIgnoreCase("Scissors") || e.equalsIgnoreCase("S")) {
			choice = 2; //2 = scissors
			return true;
		}
		else if(e.equalsIgnoreCase("Paper") || e.equalsIgnoreCase("P")) {
			choice = 3; //3 = paper
			return true;
		}
		return false;
	}
	public int compute() {
		int c= (int)(Math.random()*3);
		return c;
	}
	public void determine(int y, int z) {
		//player win
		if( (y == 1 && z == 2)
			|| (y == 2 && z == 3)
			|| (z == 3 && y == 2) ) {
			System.out.println("Congrats! You have won!");
		}
		else if( (y == 2 && z == 1) ||
				 (y==3 && z == 2) ||
				 (y == 1 && z == 3) ) {
			System.out.println("Bummer! You lost.");
		}
		else {
			System.out.println("Tie!");
		}
		System.out.println("Press x to keep playing");
		if(scanner.nextLine().equalsIgnoreCase("x")) {
			run();
		}
	}

}

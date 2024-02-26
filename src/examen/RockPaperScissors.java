

package examen;

import java.util.*;

/**
 * @author daw102
 * @version 1.0
 * @since 26/02/2024
 * 
 */
public class RockPaperScissors {
	private static int keyboard = 0;
	private static Scanner scanner = new Scanner(System.in);
	/**"Array de String que guarda la lista de opciones disponibles"*/
	public static List<String> optionList;
	/**"Constructor por defecto"*/
	public RockPaperScissors() {
	
	}
/**Metodo MAIN
 *@param args "" */
	public static void main(String[] args) {
		optionList = Arrays.asList("Rock", "Paper", "Scissors");
		do {
			System.out.println("Welcome to Rock, Paper, Scissors!");
			System.out.print("Enter your choice (Rock(1), Paper(2), or Scissors(3)): ");
			keyboard = scanner.nextInt();
			scanner.nextLine();
		} while (keyboard < 1 || keyboard > 3);
		String computerChoice = optionList.get(new Random().nextInt(3));
		String userChoice = optionList.get(keyboard - 1);
		System.out.println("Your chose: " + userChoice + "\nComputer chose: " + computerChoice);
		System.out.println(RockPaperScissors.checkGame(computerChoice, userChoice));
		scanner.close();
	}
	/**@return "Dependiendo de lo elija el usuario, win, loose o tie"
	 * @param userChoice "Eleccion del usuario"
	 * @param computerChoice "Eleccion del oponente"*/
	public static String checkGame(String userChoice, String computerChoice) {
		String gameResult = "";
		if (userChoice.equals(computerChoice)) {
			gameResult = "It's a tie!";
		} else if (userChoice.equals("Rock") && computerChoice.equals("Scissors")) {
			gameResult = "You win this round!"; /**@return Devuelve win si tiene roca y el oponente tijera*/
		} else if (userChoice.equals("Paper") && computerChoice.equals("Rock")) { // @return Devuelve win si el usuario
																					// tiene papel y el oponente piedra
			gameResult = "You win this round!";
		} else if (userChoice.equals("Scissors") && computerChoice.equals("Paper")) { // @return Devuelve win si el
																						// usuario tiene tijeras y el
																						// oponente papel
			gameResult = "You win this round!";
		} else {
			gameResult = "Computer wins this round!"; // @return Si el oponente tiene tu contra, el gna
		}
		return gameResult;
	}
}
import java.lang.Integer;
import java.util.Scanner;
import java.util.Random;

/**
*	Classe pour gerer une partie
*/

public class Partie{

	public Partie(){
		int nb;
		System.out.println("Choisissez le nombre de joueur entre 3 et 4");
		while(true){
			Scanner sc = new Scanner(System.in);
			String tmp = sc.nextLine();
			nb = Integer.parseInt(tmp);
			if(nb <= 4 && nb >= 3 ){
				StockageJeu jeu = StockageJeu.initialize(nb);
				break;
			} else {
				System.out.println("Choisissez le nombre de joueur entre 3 et 4");
			}

			


		}
		
	}

	private int de(){
		Random rand = new Random();
		int nombreR = rand.nextInt()%4;
		return nombreR;

	}



}
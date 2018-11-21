
/**
*	Classe represenant la grille du jeu
*	@author Ranto
*/

public class StockageJeu{

	/**
	*	Classe du jeu
	*/
	private static StockageJeu jeu = null;


	/**
	*	Represente la grille du jeu
	*/
	private Case[][] cases;

	/**
	*	Constructeur
	*/
	private StockageJeu(){
		
	}

	/**
	*	Singleton
	*/
	public static StockageJeu initialize(){
		if(jeu == null){
			jeu = new StockageJeu();
		}

		return jeu;
	}




}
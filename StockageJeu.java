
/**
*	Classe represenant l'etat du jeu'
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
		cases = new Case[7][7];
		
	}

	/**
	*	Singleton
	*	@return jeu qui est unique
	*/
	public static StockageJeu initialize(){
		if(jeu == null){
			jeu = new StockageJeu();
		}

		return jeu;
	}

	




}

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
	*	Represente les joueurs
	*/
	private static Joueur[] joueurs;

	/**
	*	Represente Assam le pion
	*/
	private static Assam pion;


	/**
	*	Represente la grille du jeu
	*/
	public static Case[][] cases;

	/**
	*	Constructeur
	*/
	private StockageJeu(int nbJoueur){

		//initialise la grille
		cases = new Case[7][7];
		initialiseCases();
	
		//initialise les joueurs
		joueurs = new Joueur[nbJoueur];
		initialiseJoueurs();
		
	}

	/**
	*	Methode pour initialiser la grille
	*/
	private void initialiseCases(){
		for(int i = 0; i < 7; i++){
			for(int j = 0; j < 7; j++){
				cases[i][j] = new Case();
			}
		}
	}

	/**
	*	Methode pour initialiser les joueurs
	*/

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
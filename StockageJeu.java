
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
	
	/**
	*@param couleur c'est la couleur du tapis sur lequel assam est
	*@param x on met la position x de assam
	*@param y on met la position y de assam
	*@param dime on met la dime a 0;
	*@param visited on cree un tableau de booleen avec new
	*/
	public int payerDime(int couleur, int x, int y, int dime, boolean[][] visited){
		dime++;
		visited[x][y] = true;
		if(cases[x+1][y].getCouleurTapis()==couleur && !boolean[x+1][y]){
			dime = payerDime(couleur,x+1,y,dime,visited);
		}
		if(cases[x-1][y].getCouleurTapis()==couleur && !boolean[x-1][y]){
			dime = payerDime(couleur,x-1,y,dime,visited);
		}
		if(cases[x][y+1].getCouleurTapis()==couleur && !boolean[x][y+1]){
			dime = payerDime(couleur,x,y+1,dime,visited);
		}
		if(cases[x][y-1].getCouleurTapis()==couleur && !boolean[x][y-1]){
			dime = payerDime(couleur,x,y-1,dime,visited);
		}
		return dime;
	}

	




}

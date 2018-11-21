/**
*	Classe representant l'etat d'une case
*/

public class Case{

	/**
	*	Presence du joueur
	*	true = oui
	*	false = non
	*/
	private boolean joueur;

	/**
	*	Presence d'un tapis
	*	true = oui
	*	false = non
	*/
	private boolean tapis;

	/**
	*	Couleur tapis
	*	1 = rouge
	*	2 = bleu
	*	3 = vert
	*	4 = jaune
	*/
	private int couleur;

	/**
	*	Constructeur, initialise les valeurs par defaut
	*/
	public Case(){
		joueur = false;
		tapis = false;
		couleur = 0;
	}
}
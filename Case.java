/**
*	Classe representant l'etat d'une case
*/

public class Case{

	/**
	*	Couleur tapis
	*	0 = pas de tapis
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
		couleur = 0;
		posXPion = 4; //Placer le pion au centre
		posYPion = 4;

	}

	/**
	*	Methode pour mettre un tapis sur la case
	*	@param nb (Voir l'attribut couleur pour les differents valeur de nb)
	*/
	public void setCouleurTapis(int nb){
		if(nb>0 && nb<5){
			couleur = nb;
		} else {
			System.out.println("Erreur setCouleurTapis "+nb);
		}
	}

	/**
	*	Methode pour obtenir la couleur du tapis de la case
	*	@return couleur qui est la couleur du tapis de la case
	*/
	public int getCouleurTapis(){
		return couleur;
	}
}